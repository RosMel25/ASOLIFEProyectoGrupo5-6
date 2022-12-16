package Ahorros;

import Empleados.empleado;
import Empleados.administradorEmpleado;
import javax.swing.JOptionPane;


public class administrarAhorro {

    public ahorro arrAhorro[] = new ahorro[10];
    
    administradorEmpleado admin = new administradorEmpleado();

    public void crearAhorro(empleado empleado) {

        int pocicion = 0;
        boolean agregado = false;

        while (pocicion < 10 && agregado == false) {

            if (arrAhorro[pocicion] == null) {
                float montoAhorro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto del ahorro: "));
                float total = 0;
                int Cuenta = pocicion;
                arrAhorro[pocicion] = new ahorro(empleado, total, montoAhorro, Cuenta + 1);
                System.out.println("Cuenta de ahorro creada correctamente");
                agregado = true;

            }
            pocicion++;
        }
    }

    public void sumarAhorro(int cuenta, String nombre) {

        float saldo;

        if (nombre.equals(arrAhorro[cuenta - 1].getEmpleado().getNombre()) && cuenta == arrAhorro[cuenta - 1].getNumeroCuenta()) {
            saldo = (float) (arrAhorro[cuenta - 1].getTotal() + arrAhorro[cuenta - 1].getMontoAhorro());
            arrAhorro[cuenta - 1].setTotal(saldo);
        }
    }

    public void mostrarAhorro(int numero) {
        System.out.println("Nombre del empleado: " + arrAhorro[numero - 1].getEmpleado().getNombre());
        System.out.println("Número de cuenta: " + arrAhorro[numero - 1].getNumeroCuenta());
        System.out.println("Monto del ahorro: " + arrAhorro[numero - 1].getMontoAhorro());
        System.out.println("Saldo: " + arrAhorro[numero - 1].getTotal() + "\n" + "-----------------*--------------");

    }

    public void retiro() {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de empleado");
        int cuenta = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el número de cuenta"));
        float retiro = Float.parseFloat(JOptionPane.showInputDialog("Cuanto dinero desea retirar?"));
        float saldo;

        if (nombre.equals(arrAhorro[cuenta - 1].getEmpleado().getNombre()) && cuenta == arrAhorro[cuenta - 1].getNumeroCuenta()) {
            if (retiro <= arrAhorro[cuenta - 1].getMontoAhorro()) {
                saldo = (float) (arrAhorro[cuenta - 1].getTotal() - retiro);
                arrAhorro[cuenta - 1].setTotal(saldo);
            } else {
                System.out.println("No se puede hacer el retiro, montos insuficientes.");
            }
        } else if (nombre.equals(arrAhorro[cuenta - 1].getEmpleado().getNombre()) && cuenta > arrAhorro[cuenta - 1].getNumeroCuenta()) {
            System.out.println("No se puede hacer el depósito");
        } else {
            System.out.println("No se puede hacer el depósito");
        }

    }
    
    public void menuAhorro() {
        int opahorro = 0;
        while (opahorro == 0) {
            String opahorroLectura = JOptionPane.showInputDialog(null,
                    "Bienvenido"
                    + "\nSeleccione la opcion:"
                    + "\n1. Abrir una cuenta de ahorros"
                    + "\n2. Depositar monto del ahorro"
                    + "\n3. Regresar");
            opahorro = Integer.parseInt(opahorroLectura);
            if (opahorro == 1) {
                admin.cargaARR();

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleado:"));

                if (admin.arrempleado[numero - 1].getNumeroEmpleado() == numero && nombre.equals(admin.arrempleado[numero - 1].getNombre())) {
                    crearAhorro(admin.arrempleado[numero - 1]);
                    mostrarAhorro(numero);
                    opahorro = 0;

                } else {
                    System.out.println("No se ha podido crear la cuenta");
                }
            }
            if (opahorro == 2) {
                admin.cargaARR();
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleado:"));

                if (admin.arrempleado[numero - 1].getNumeroEmpleado() == numero && nombre.equals(admin.arrempleado[numero - 1].getNombre())) {

                    sumarAhorro(numero, nombre);
                    mostrarAhorro(numero);
                    opahorro = 0;
                } else {
                    System.out.println("No se ha podido hacer el depósito");
                }

            }
            if (opahorro == 3) {
                break;

            } else {
                opahorro = 0;

            }
        }
    }

}