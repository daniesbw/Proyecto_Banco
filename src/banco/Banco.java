/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import static banco.Main.azar;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class Banco {

    Random azar = new Random();

    ArrayList<Cajero> cajeros = new ArrayList();
    Cola personas = new Cola();//metodo 1 
    JTextArea ta_cajeros;
    JTable jt_personas;
    JFrame ventana;
    JDialog ventana2;
    JTextPane tp_transaccion;
    JLabel contPersonas;
    int segundoGlobal = 0;

    public Banco() {
    }

    public void Metodo1(JTextArea ta_cajeros, JTable jt_personas, JFrame pVentana, JTextPane tp_transaccion, JLabel pContPersonas) {
        this.ta_cajeros = ta_cajeros;
        this.jt_personas = jt_personas;
        this.ventana = pVentana;
        this.tp_transaccion = tp_transaccion;
        this.contPersonas = pContPersonas;
        Thread hilo = new Thread(tiempo);
        hilo.start();
    }

    public void crearCajeros(int num) {
        for (int i = 0; i < num; i++) {
            cajeros.add(new Cajero());
        }
    }

    public void addPersona(Persona persona) {
        // se pone una persona a la cola
        this.personas.PONE(persona);
    }

    public Cola getPersonas() {
        return personas;
    }

    public Random getAzar() {
        return azar;
    }

    public void setAzar(Random azar) {
        this.azar = azar;
    }

    public ArrayList<Cajero> getCajeros() {
        return cajeros;
    }

    public void setCajeros(ArrayList<Cajero> cajeros) {
        this.cajeros = cajeros;
    }

    public String getNombreRandom() {
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Daniel");
        nombres.add("Pedro");
        nombres.add("Javier");
        nombres.add("Carlos");
        nombres.add("Angel");
        nombres.add("Claudio");
        nombres.add("Mario");
        nombres.add("Alejandro");
        nombres.add("Juanca");
        nombres.add("David");
        nombres.add("Adalberto");
        nombres.add("Horacio");

        nombres.add("Sofia");
        nombres.add("Maria");
        nombres.add("Scarlet");
        nombres.add("Steffany");
        nombres.add("Claudy");
        nombres.add("Camila");
        nombres.add("Angela");
        nombres.add("Andrea");
        nombres.add("Olivia");
        nombres.add("Emily");
        nombres.add("Isabella");

        Collections.shuffle(nombres);

        return nombres.get(0);
    }

    public String getApellidoRandom() {
        ArrayList<String> apellidos = new ArrayList();
        apellidos.add("González");
        apellidos.add("Rojas");
        apellidos.add("Sanchez");
        apellidos.add("Muños");
        apellidos.add("Perez");
        apellidos.add("Silva");
        apellidos.add("Contreras");

        Collections.shuffle(apellidos);

        return apellidos.get(0);
    }

    public void actualizarDatos() {
        /* 
            Actualizar tabla que representa la cola de personas
         */

        try {
            DefaultTableModel model = (DefaultTableModel) jt_personas.getModel();

            model.setRowCount(0);

            for (int j = 0; j < personas.getP().size(); j++) {
                Persona temp = (Persona) personas.getP().get(j);
                model.addRow(new Object[]{temp.getNom() + temp.getApellido()});
            }

        } catch (ArrayIndexOutOfBoundsException e) {
        }

        /*
            ACTUALIZAR ESTADO DE LOS CAJEROS
         */
        try {
            ta_cajeros.setText("");
            String results = "";
            for (int i = 0; i < cajeros.size(); i++) {
                results += "Cajero " + (i + 1) + " " + (cajeros.get(i).getP().getNom() + " " + cajeros.get(i).getP().getApellido()) + "\n";
            }
            ta_cajeros.setText(results);
        } catch (ArrayIndexOutOfBoundsException e) {
        }

    }

    Runnable hilo_metodo1 = new Runnable() {
        @Override
        public void run() {
            try {
                try {

                    while (personas.VACIA() != true && segundoGlobal<120) {

                        int cajeroAsignado = azar.nextInt(cajeros.size());

                        cajeros.get(cajeroAsignado).setP((Persona) personas.FRENTE());
                        personas.QUITA(personas);
                        actualizarDatos();
                        cajeros.get(cajeroAsignado).transaccion1(tp_transaccion, cajeroAsignado);

                        int tiempo = azar.nextInt(3000 - 1000) + 1000;//Tiempo de 1 - 3 secs
                        Thread.sleep(tiempo);

                        cajeros.get(cajeroAsignado).setP(new Persona(0, "Vacio", "Vacio"));
                        actualizarDatos();

                        contPersonas.setText(String.valueOf(personas.getP().size()));//Actualizar contador de personas
                    }

                    if (segundoGlobal < 120 && personas.VACIA() == true) {//Si la cola se acabo pone una persona mas

                        int edadRand = azar.nextInt(70 - 18) + 18;
                        Persona temp = new Persona(edadRand, getNombreRandom(), getApellidoRandom());
                        
                        actualizarDatos();
                        
                        personas.PONE(temp);
                        
                        Thread hilo = new Thread(hilo_metodo1);
                        hilo.start();
                    } else {
                        ventana.setVisible(false);//Cerrar venta

                        Main n = new Main();
                        n.enseñarTransa(cajeros.size(), cajeros);//Abrir ventana con rersultados
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                }

            } catch (InterruptedException e) {
            }
        }
    };

    Runnable tiempo = new Runnable() {
        @Override
        public void run() {
            Thread hilo = new Thread(hilo_metodo1);
            hilo.start();
            while (segundoGlobal < 120) {
                if (segundoGlobal == 120) {
                    hilo.stop();
                }
                segundoGlobal++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };

}
