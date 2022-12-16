package Prestamos;

import Empleados.administradorEmpleado;
import Empleados.empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class AdministrarPrestamo {
  administradorEmpleado emp;

    public prestamo arrPPersonal[] = new prestamo[10];

    public prestamo arrPEstdudiantil[] = new prestamo[10];

    public prestamo arrPSalud[] = new prestamo[10];

    public void creaPrestamo(empleado empleado) {

        int OpPrestamo = Integer.parseInt(JOptionPane.showInputDialog("Cual es el tipo de préstamo solicitado?\n 1.Personal \n 2.Estudiantil\n 3.De Salud \n 4.Regresar \n 5.Salir"));
        int seleccion = 0;

        while (seleccion == 0) {
            if (OpPrestamo == 1) {
                float montoPP = Float.parseFloat(JOptionPane.showInputDialog("Digite el monto solicitado: "));

                if (100000 <= montoPP && montoPP <= 500000) {
                    int pocicion = 0;
                    boolean agregado = false;

                    while (pocicion < 10 && agregado == false) {

                        if (arrPPersonal[pocicion] == null) {
                            String tipoPrestamo = "Personal";
                            float Plazo = Float.parseFloat(JOptionPane.showInputDialog("Digite el plazo en meses: "));
                            double interes = montoPP * 0.20;
                            double total = montoPP + interes;
                            double cuota = total / Plazo;
                            int Cuenta = pocicion + 1;
                            arrPPersonal[pocicion] = new prestamo(empleado, tipoPrestamo, montoPP, Plazo, interes, total, cuota, Cuenta);
                            System.out.println("Prestamo creado correctamente");
                            agregado = true;
                            mostrarPP(Cuenta);
                        }
                        pocicion++;
                    }
                } else {
                    System.out.println("El monto no es adecuado para un préstamo personal: ");
                }

                OpPrestamo = Integer.parseInt(JOptionPane.showInputDialog("Cual es el tipo de préstamo solicitado?\n 1.Personal \n 2.Estudiantil\n 3.De Salud \n 4.Regresar \n 5.Salir"));

            }

            if (OpPrestamo == 2) {
                float montoPE = Float.parseFloat(JOptionPane.showInputDialog("Digite el monto solicitado: "));

                if (1000000 <= montoPE && montoPE <= 2000000) {
                    int pocicion = 0;
                    boolean agregado = false;

                    while (pocicion < 10 && agregado == false) {

                        if (arrPPersonal[pocicion] == null) {
                            String tipoPrestamo = "Estudiantil";
                            float Plazo = Float.parseFloat(JOptionPane.showInputDialog("Digite el plazo en años: "));
                            double interes = montoPE * 0.10;
                            double total = montoPE + interes;
                            double cuota = total / Plazo;
                            int Cuenta = pocicion + 1;
                            arrPEstdudiantil[pocicion] = new prestamo(empleado, tipoPrestamo, montoPE, Plazo, interes, total, cuota, Cuenta);
                            System.out.println("Prestamo creado correctamente");
                            agregado = true;

                        }
                        pocicion++;
                    }
                } else {
                    System.out.println("El monto no es adecuado para un préstamo estudiantil: ");
                }

                OpPrestamo = Integer.parseInt(JOptionPane.showInputDialog("Cual es el tipo de préstamo solicitado?\n 1.Personal \n 2.Estudiantil\n 3.De Salud \n 4.Regresar \n 5.Salir"));

            }

            if (OpPrestamo == 3) {
                float montoPS = Float.parseFloat(JOptionPane.showInputDialog("Digite el monto solicitado: "));

                if (500000 <= montoPS && montoPS <= 1000000) {
                    int pocicion = 0;
                    boolean agregado = false;

                    while (pocicion < 10 && agregado == false) {

                        if (arrPPersonal[pocicion] == null) {
                            String tipoPrestamo = "Estudiantil";
                            float Plazo = Float.parseFloat(JOptionPane.showInputDialog("Digite el plazo en años: "));
                            double interes = montoPS * 0.05;
                            double total = montoPS + interes;
                            double cuota = total / Plazo;
                            int Cuenta = pocicion + 1;
                            arrPSalud[pocicion] = new prestamo(empleado, tipoPrestamo, montoPS, Plazo, interes, total, cuota, Cuenta);
                            System.out.println("Prestamo creado correctamente");
                            agregado = true;

                        }
                        pocicion++;
                    }
                } else {
                    System.out.println("El monto no es adecuado para un préstamo de salud: ");
                }

                if (OpPrestamo == 4) {
                    break;
                }
                break;
            }
            break;
        }

    }

    public void mostrarPP(int numero) {
        System.out.println("Nombre del empleado: " + arrPPersonal[numero - 1].getEmpleado().getNombre());
        System.out.println("Número de cuenta: " + arrPPersonal[numero - 1].getCuenta());
        System.out.println("Monto del Préstamo : " + arrPPersonal[numero - 1].getMonto());
        System.out.println("Cuota : " + arrPPersonal[numero - 1].getCuota());
        System.out.println("Plazo del Préstamo : " + arrPPersonal[numero - 1].getPlazo());
        System.out.println("Saldo: " + arrPPersonal[numero - 1].getTotal() + "\n" + "-----------------*--------------");

    }

    public void mostrarPE(int numero) {
        System.out.println("Nombre del empleado: " + arrPEstdudiantil[numero - 1].getEmpleado().getNombre());
        System.out.println("Número de cuenta: " + arrPEstdudiantil[numero - 1].getCuenta());
        System.out.println("Monto del Préstamo : " + arrPEstdudiantil[numero - 1].getMonto());
        System.out.println("Cuota : " + arrPEstdudiantil[numero - 1].getCuota());
        System.out.println("Plazo del Préstamo : " + arrPEstdudiantil[numero - 1].getPlazo());
        System.out.println("Saldo: " + arrPEstdudiantil[numero - 1].getTotal() + "\n" + "-----------------*--------------");

    }

    public void mostrarPS(int numero) {
        System.out.println("Nombre del empleado: " + arrPSalud[numero - 1].getEmpleado().getNombre());
        System.out.println("Número de cuenta: " + arrPSalud[numero - 1].getCuenta());
        System.out.println("Monto del Préstamo : " + arrPSalud[numero - 1].getMonto());
        System.out.println("Cuota : " + arrPSalud[numero - 1].getCuota());
        System.out.println("Plazo del Préstamo : " + arrPSalud[numero - 1].getPlazo());
        System.out.println("Saldo: " + arrPSalud[numero - 1].getTotal() + "\n" + "-----------------*--------------");

    }

    public void cargarPrestamos() {
        emp.cargaARR();
        arrPPersonal[0] = new prestamo(emp.arrempleado[0], "Personal", 300000, 12, 39000, 339000, 28250, 1);
        arrPEstdudiantil[0] = new prestamo(emp.arrempleado[1], "Estudiantil", 300000, 12, 39000, 339000, 28250, 1);
        arrPSalud[0] = new prestamo(emp.arrempleado[2], "Salud", 300000, 12, 39000, 339000, 28250, 1);
        arrPSalud[1] = new prestamo(emp.arrempleado[3], "Salud", 300000, 12, 39000, 339000, 28250, 1);
    }

    public void pagarPP(String nombre, int numeroCuenta) {
        double saldo;

        if (nombre.equals(arrPPersonal[numeroCuenta].getEmpleado().getNombre()) && numeroCuenta == arrPPersonal[numeroCuenta].getCuenta()) {
            saldo = arrPPersonal[numeroCuenta - 1].getTotal() - arrPPersonal[numeroCuenta - 1].getCuota();
            arrPPersonal[numeroCuenta].setTotal(saldo);

        }
    }
}