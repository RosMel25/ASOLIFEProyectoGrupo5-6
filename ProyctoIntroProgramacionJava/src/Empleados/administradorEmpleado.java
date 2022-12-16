package Empleados;

import javax.swing.JOptionPane;

public class administradorEmpleado {

    public empleado arrempleado[] = new empleado[10];

    public empleado crearEmpleado() {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
        int ID = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite la identificación del coolaborador: "));
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el número de teléfono del coolaborador: "));
        String puesto = JOptionPane.showInputDialog("Ingrese el puesto del empleado: ");
        int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite la cantidad de años de trabajar para la compañía: "));
        String correo = JOptionPane.showInputDialog("Ingrese el correo electrónico del empleado: ");
        int numeroEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el número de empleado del coolaborador: "));
        arrempleado[numeroEmpleado - 1] = new empleado(nombre, ID, telefono, puesto, correo, tiempo, numeroEmpleado);
        return arrempleado[numeroEmpleado - 1];
    }

    public void cargaARR() {
        arrempleado[0] = new empleado("Alejandro", 113190073, 84428500, "Digitador", "alemartinezfallas@gmal.com", 4, 1);
        arrempleado[1] = new empleado("Mel", 3445123, 63548987, "Gerente", "Mel@gmail.com", 10, 2);
        arrempleado[2] = new empleado("Josimar", 1659874, 63987456, "Gefe Bodega", "Josimar@gmail.com", 5, 3);
        arrempleado[3] = new empleado("Kiany", 3654852, 89752132, "asistente", "Kiany", 8, 4);

    }

    public void mostrarEmpleado() {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleado: "));
        String cadena = "";
        cadena += "Nombre: " + arrempleado[numero - 1].getNombre() + " \n "
                + "Identificación: " + arrempleado[numero - 1].getID() + " \n "
                + "Teléfono: " + arrempleado[numero - 1].getTelefono();
        JOptionPane.showMessageDialog(null, cadena);
    }

    public void listaEmpleado() {

        for (empleado arrempleado1 : arrempleado) {
            if (arrempleado1 != null) {
                System.out.println(arrempleado1);
            }
        }
    }

    public void menuEmpleado() {
        cargaARR();
        boolean ejecutarmenu = true;
        while (ejecutarmenu == true) {
            int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido"
                    + "\nSeleccione la opcion:"
                    + "\n1. Crear empleado"
                    + "\n2. Mostrar empleados"
                    + "\n3. Mostrar lista de empleados "
                    + "\n4. Regresar"));
            switch (opcionMenu) {
                case 1:
                    crearEmpleado();
                    break;

                case 2:
                    mostrarEmpleado();
                    break;

                case 3:
                    listaEmpleado();
                    break;

                case 4:
                    ejecutarmenu = false;

            }
        }
    }

}
