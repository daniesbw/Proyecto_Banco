package banco;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Pila extends Lista{
    
     public void ANULA() {
        datos.clear();
        System.out.println("P Vaciado");
    }

    public void SACA() {
        SUPRIME(PRIMERO(datos) - 1, datos);
    }

    public void METE(Object x) {
        INSERTA(x, PRIMERO(datos) - 1, datos);
    }

    public ArrayList getP() {
        return this.datos;
    }

    public void setP(ArrayList p) {
        this.datos = p;
    }

    public void agregar(Object x) {
        datos.add(x);
    }

    public void IMPRIMIR() {
        System.out.println(this.datos.size());
        System.out.println("===============IMPRIMIR PILA===============");
        System.out.print("Pila: " + '[');
        for (int i = datos.size() - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(datos.get(i) + " ");
            } else {
                System.out.print(datos.get(i));
            }

        }
        System.out.println("]");
        System.out.println("===============FIN IMPRIMIR===============");
    }
}
