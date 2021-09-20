package banco;

/**
 *
 * @author Daniel
 */
public class Persona {
    private int edad;
    private String nom;
    private String apellido;

    public Persona() {
    }
    
    public Persona(int edad, String nom, String apellido) {
        this.edad = edad;
        this.nom = nom;
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{"  + "Nombre=" + nom + ", Apellido=" + apellido  +  ", Edad=" + edad +  '}';
    }
    
    
}
