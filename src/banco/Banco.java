/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.awt.TextArea;
import java.util.ArrayList;
import java.util.Random;
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

    public Banco() {
    }

    public void Metodo1(JTextArea ta_cajeros, JTable jt_personas, JFrame pVentana, JTextPane tp_transaccion, JLabel pContPersonas) {
        this.ta_cajeros = ta_cajeros;
        this.jt_personas = jt_personas;
        this.ventana = pVentana;
        this.tp_transaccion = tp_transaccion;
        this.contPersonas = pContPersonas;
        Thread hilo = new Thread(hilo_metodo1);
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

    public void actualizarDatos() {
        /* 
            Actualizar tabla que representa la cola de personas
         */

        try {
            DefaultTableModel model = (DefaultTableModel) jt_personas.getModel();

            model.setRowCount(0);
            if (personas.getP().size() >= 0) {
                for (int j = 0; j < personas.getP().size(); j++) {
                    //if (personas.getP().get(j) != null) {//Safe coding
                    Persona temp = (Persona) personas.getP().get(j);
                    model.addRow(new Object[]{temp.getNom() + temp.getApellido()});
                    //}
                }
            } else {
                model.addRow(new Object[]{"VACIO"});
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }

        /*
            ACTUALIZAR ESTADO DE LOS CAJEROS
         */
        try {
            ta_cajeros.setText("");
            String  results = "";
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
                    while (personas.VACIA() != true) {

                        int cajeroAsignado = azar.nextInt(cajeros.size());
                        //JOptionPane.showMessageDialog(ta_cajeros, cajeroAsignado);
                        cajeros.get(cajeroAsignado).setVacio(false);
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

                    ventana.setVisible(false);//Cerrar venta

                    Main n = new Main();
                    n.enseñarTransa(cajeros.size(), cajeros);//Abrir ventana con rersultados
                } catch (ArrayIndexOutOfBoundsException e) {
                }

            } catch (InterruptedException e) {
            }
        }
    };

}
