/**
 *
 * @author Vicente
 */
public class Jugador {

    public Jugador(String cedula, String nombre, String apellido, int edad){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public void caminar() {
        System.out.println("Hacer caminar a Alex");
    }

    public void correr() {
        System.out.println("Hacer correr a Alex");
    }

    public void viajar() {
        System.out.println("Hacer viajar a Alex");
    }
}