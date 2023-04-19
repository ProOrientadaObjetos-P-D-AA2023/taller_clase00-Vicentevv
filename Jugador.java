/**
 *
 * @author Vicente
 */
public class Jugador {
    private int cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public Jugador(int cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void caminar() {
        System.out.println("El jugador está caminando");
    }

    public void correr() {
        System.out.println("El jugador está corriendo");
    }

    public void viajar() {
        System.out.println("El jugador está viajando");
    }

    // Getters y setters para los atributos
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad=edad;
    }
}