package Prestamos;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class calculo {

    private int plazo;
    private double monto;
    private double tasaInteres;
    private double cuota;

    public calculo(int plazo, double monto, double tasaInteres, double cuota) {
        this.plazo = plazo;
        this.monto = monto;
        this.tasaInteres = tasaInteres;
        this.cuota = cuota;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        String plazoLectura = JOptionPane.showInputDialog(null, "Ingrese la cantidad de cuotas 12, 24, 36 o 48:");
        plazo = Integer.parseInt(plazoLectura);
        this.plazo = plazo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        String montoLectura = JOptionPane.showInputDialog(null, "Ingrese el monto solicitado:");
        monto = Integer.parseInt(montoLectura);
        this.monto = monto;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        tasaInteres = 0.04 * monto;
        this.tasaInteres = tasaInteres;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        cuota = (getTasaInteres() + getMonto());
        this.cuota = cuota;
    }

    public void crearPrestamo() {
        setPlazo(0);
        setMonto(0);
        setTasaInteres(0);
        setCuota(0);
    }

    public void mostrarPrestamo() {
        System.out.println("**************************************************");
        System.out.println("*************Informacion de Prestamo**************");
        System.out.println("**************************************************");
        System.out.println("Monto del prestamo: " + getMonto());
        System.out.println("Plazo del prestamo: " + getPlazo());
        System.out.println("Su cuota mensual es de: " + (getCuota() / getPlazo()));
        System.out.println("La tasa de interes del prestamo es de: " + getTasaInteres());
        System.out.println("El monto del prestamo con intereses es de: " + (getTasaInteres() + getMonto()));
        System.out.println("**************************************************");
        System.out.println("*******************Muchas gracias*****************");
        System.out.println("**************************************************");
    }

    public void menuPrestamo() {
        int seleccion = 0;
        while (seleccion == 0) {
            String seleccionLectura = JOptionPane.showInputDialog(null, "Bienvenido a nuestro sistema de calculo prestamos. \nSeleccione la opcion: \n1. Calcular un prestamo. \n2. Mostrar el prestamo. \n3. Regresar. \n4. Salir.");
            seleccion = Integer.parseInt(seleccionLectura);
            if (seleccion == 1) {
                crearPrestamo();
                seleccion = 0;
            }
            if (seleccion == 2) {
                mostrarPrestamo();
                seleccion = 0;
            }
            if (seleccion == 3) {
                seleccion = 0;
            }

            if (seleccion == 4) {
                break;
            } else {
                seleccion = 0;
            }
        }

    }

}
