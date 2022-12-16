package Ahorros;

import Empleados.empleado;

public class ahorro {

    private empleado empleado;
    private float total;
    private float montoAhorro;
    private int numeroCuenta;

    public ahorro(empleado empleado, float total, float montoAhorro, int numeroCuenta) {
        this.empleado = empleado;
        this.total = total;
        this.montoAhorro = montoAhorro;
        this.numeroCuenta = numeroCuenta;
    }

    public empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(empleado empleado) {
        this.empleado = empleado;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getMontoAhorro() {
        return montoAhorro;
    }

    public void setMontoAhorro(float montoAhorro) {
        this.montoAhorro = montoAhorro;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "ahorro{" + "empleado=" + empleado + ", total=" + total + ", montoAhorro=" + montoAhorro + ", numeroCuenta=" + numeroCuenta + '}';
    }
}
