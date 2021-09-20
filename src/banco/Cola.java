/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Cola extends Lista{
     public void ANULA() {
        datos.clear();
    }

    public Object FRENTE() {
        return RECUPERA(PRIMERO(datos)-1, datos);
    }

    public void PONE(Object x) {
        INSERTA(x, FIN(datos)-1, datos);
    }
    
    public void QUITA(Cola c){
        SUPRIME(PRIMERO( c.getP())-1 , c.getP());
    }
    
    public boolean VACIA(){
        boolean retorno=false;
        
        if (datos.isEmpty()==true) {
            retorno = true;
        }
        
        return retorno;
    }

    public ArrayList getP() {
        return this.datos;
    }

    public void setP(ArrayList p) {
        this.datos = p;
    }
}
