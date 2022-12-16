package Empleados;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class empleado {

   administradorEmpleado emp = new administradorEmpleado();

    String nombre;
    private int ID;
    private int telefono;
    private String puesto;
    private String correo;
    private int tiempoLaboral;
    private int numeroEmpleado;

    public empleado(String nombre, int ID, int telefono, String puesto, String correo, int tiempoLaboral, int numeroEmpleado) {
        this.nombre = nombre;
        this.ID = ID;
        this.telefono = telefono;
        this.puesto = puesto;
        this.correo = correo;
        this.tiempoLaboral = tiempoLaboral;
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = JOptionPane.showInputDialog(null, "Escriba el nombre del colaboraor: ");
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        String IDLectura = JOptionPane.showInputDialog(null, "Ingrese el ID del colaborador: ");
        ID = Integer.parseInt(IDLectura);
        this.ID = ID;
    }

    public int getTelefono() {
        System.out.println();
        return telefono;
    }

    public void setTelefono(int telefono) {
        String telefonoLectura = JOptionPane.showInputDialog(null, "Ingrese el telefono del colaborador:");
        telefono = Integer.parseInt(telefonoLectura);
        this.telefono = telefono;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        puesto = JOptionPane.showInputDialog(null, "Ingrese el puesto del colaborador: ");
        this.puesto = puesto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        correo = JOptionPane.showInputDialog(null, "Ingrese el correo del colaborador: ");
        this.correo = correo;
    }

    public int getTiempoLaboral() {
        return tiempoLaboral;
    }

    public void setTiempoLaboral(int tiempoLaboral) {
        String tiempoLaboralLectura = JOptionPane.showInputDialog(null, "Ingrese el tiempo laboral del colaborador: ");
        tiempoLaboral = Integer.parseInt(tiempoLaboralLectura);
        this.tiempoLaboral = tiempoLaboral;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        String numeroLectura = JOptionPane.showInputDialog(null, "Ingrese número de empleado del colaborador: ");
        tiempoLaboral = Integer.parseInt(numeroLectura);
        this.numeroEmpleado = numeroEmpleado;
    }

    @Override
    public String toString() {
        return "-----------------------------------------\n" + "Codigo: " 
                + "Nombre: " + nombre 
                + ". ID: " + ID 
                + ". Telefono: " + telefono 
                + ". Puesto: " + puesto 
                + ". Correo:" + correo 
                + ". Tiempo laboral: " + tiempoLaboral 
                + ". Numero de empleado: " + numeroEmpleado;
    }



}