/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

/**
 *
 * @author Daniel
 */
public class Cajero {

    boolean vacio = true;
    JTextArea ta_cajeros;
    JTable jt_personas;
    Random azar = new Random();
    Pila gestiones= new Pila() ;
    Cola personas=new Cola() ;

    //persona actual (Metodo 1)
    Persona p = new Persona();

    public Cajero() {
    }

    public Cajero(JTextArea ta_cajeros, JTable jt_personas, Pila gestiones, Cola personas, int numCajero) {
        this.ta_cajeros = ta_cajeros;
        this.jt_personas = jt_personas;
        this.gestiones = gestiones;
        this.personas = personas;
        this.numCajero = numCajero;
    }

    int numCajero;

    public int sizePersonas(){
        return personas.getP().size();
    }
    
    public Cola getPersonas() {
        return personas;
    }

    public void setPersonas(Cola personas) {
        this.personas = personas;
    }

    

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
        vacio = false;
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public void transaccion2() {
        
        ArrayList<String> op_transacciones = new ArrayList();
        op_transacciones.add("Pago");
        op_transacciones.add("Deposito");
        op_transacciones.add("Retiro");

        Collections.shuffle(op_transacciones);//Desordenar la lista

        gestiones.METE(op_transacciones.get(0));
    }
    
    
    public void transaccion1(JTextPane tp_transaccion, int numCajero) {
        
        ArrayList<String> op_transacciones = new ArrayList();
        op_transacciones.add("Pago");
        op_transacciones.add("Deposito");
        op_transacciones.add("Retiro");

        Collections.shuffle(op_transacciones);//Desordenar la lista

        gestiones.METE(op_transacciones.get(0));
        tp_transaccion.setText("Cajero "+ (numCajero+1) + " "+p.getNom()+" "+p.getApellido()+ " "+op_transacciones.get(0));
    }

}
