package ClasePrincipal;

import Ahorros.administrarAhorro;
import Empleados.administradorEmpleado;
import Prestamos.AdministrarPrestamo;
import SistemasRetirosDepositos.ClaseAbstractaCajero;
import SistemasRetirosDepositos.Consulta;
import javax.swing.JOptionPane;

public class ProyectoFinalASOLIFE {

    public static void main(String[] args) {
        ClaseAbstractaCajero mesajero = new Consulta();
        administrarAhorro adminAhorro = new administrarAhorro();
        //Empleado empleado1 = new Empleado("nombre", 0, 0, "puesto", "correo", 0, 0);
        administradorEmpleado admin = new administradorEmpleado();
        AdministrarPrestamo adminP = new AdministrarPrestamo();
        admin.cargaARR();

        int intentos = 0;
        while (intentos != 3) {
            String usuario = JOptionPane.showInputDialog("Ingrese el usuario");
            String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña");

            if (usuario.equals("admin") && contraseña.equals("1234")) {
                System.out.println("Bienvenido al sistema Asociado");

                int opcion = 0;
                while (opcion == 0) {
                    String opcionLectura = JOptionPane.showInputDialog(null,
                            "Que desea realizar:"
                            + "\n   1. Menu empleados."
                            + "\n   2. Tramitar un prestamo. "
                            + "\n   3. Tramitar un ahorro"
                            + "\n   4. Retiros"
                            + "\n   6. Salir");
                    opcion = Integer.parseInt(opcionLectura);

                    if (opcion == 1) {

                        int op = 0;
                        while (op == 0) {
                            admin.menuEmpleado();
                            break;
                        }

                        opcion = 0;
                    }
                    if (opcion == 2) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
                        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleado:"));
                        if (admin.arrempleado[numero - 1].getNumeroEmpleado() == numero && nombre.equals(admin.arrempleado[numero - 1].getNombre())) {
                            adminP.creaPrestamo(admin.arrempleado[numero - 1]);
                        } else {
                            System.out.println("No se pudo tramitar el préstamo");
                        }

                        opcionLectura = JOptionPane.showInputDialog(null, "Que desea realizar:\n1. Menú empleados.\n2. Tramitar un prestamo \n3. Tramitar un ahorro \n4.Pagar Prestamo 4\n5. Pago de servicios \n6. Reportes \n7. Salir");
                        opcion = Integer.parseInt(opcionLectura);

                    }

                    if (opcion == 2) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
                        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleado:"));
                        if (admin.arrempleado[numero - 1].getNumeroEmpleado() == numero && nombre.equals(admin.arrempleado[numero - 1].getNombre())) {
                            adminP.creaPrestamo(admin.arrempleado[numero - 1]);

                        } else {
                            System.out.println("No se pudo tramitar el préstamo");
                        }
                        opcion = 0;

                    }
                    if (opcion == 3) {
                        int op = 0;
                        while (op == 0) {
                            adminAhorro.menuAhorro();
                            break;
                        }
                        opcion = 0;
                    }
                    if (opcion == 4) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
                        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleado:"));
                        if (admin.arrempleado[numero - 1].getNumeroEmpleado() == numero && nombre.equals(admin.arrempleado[numero - 1].getNombre())) {
                            mesajero.setSaldo(500000);
                            mesajero.Operaciones();

                        } else {
                            System.out.println("No se pudo tramitar el préstamo");
                        }
                        opcion = 0;

                    }

                    if (opcion == 6) {
                        break;

                    } else {
                        opcion = 0;
                    }

                }
                intentos = 3;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contrasena invalido(a) intentelo de nuevo");
                intentos++;

            }

        }

    }

}