package Prestamos;

import Empleados.empleado;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class prestamo {

    private empleado empleado;
    private String tipoPrestamo;
    private double monto;
    private double Plazo;
    private double interes;
    private double total;
    private double cuota;
    private int cuenta;

    public prestamo(empleado empleado, String tipoPrestamo, double monto, double Plazo, double interes, double total, double cuota, int cuenta) {
        this.empleado = empleado;
        this.tipoPrestamo = tipoPrestamo;
        this.monto = monto;
        this.Plazo = Plazo;
        this.interes = interes;
        this.total = total;
        this.cuota = cuota;
        this.cuenta = cuenta;
    }

    public empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(empleado empleado) {
        this.empleado = empleado;
    }

    public String getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(String tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getPlazo() {
        return Plazo;
    }

    public void setPlazo(double Plazo) {
        this.Plazo = Plazo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "empleado=" + empleado + ", tipoPrestamo=" + tipoPrestamo + ", monto=" + monto + ", Plazo=" + Plazo + ", interes=" + interes + ", total=" + total + ", cuota=" + cuota + ", cuenta=" + cuenta + '}';
    }

}
