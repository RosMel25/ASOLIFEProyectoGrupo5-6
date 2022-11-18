package lacomarcaproyecto;

/**
 *
 * @author Dell
 */
public class Cliente {

    private int cedula;
    private String nombre;
    private String apellidos;
    private int numeroTelefonico;
    private String direccion;

    public Cliente(int cedula, String nombre, String apellidos, int numeroTelefonico, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroTelefonico = numeroTelefonico;
        this.direccion = direccion;
    }

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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente:" + "\nCedula:" + cedula + "\nNombre del cliente:" + nombre + "\nApellidos del cliente:" + apellidos + "\nNúmero Telefónico:" + numeroTelefonico + "\nDirección:" + direccion;

    }
}
