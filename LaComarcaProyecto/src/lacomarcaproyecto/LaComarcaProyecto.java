package lacomarcaproyecto;

import Personas.Cliente;
import ProductosServicios.Producto;
import javax.swing.JOptionPane;

public class LaComarcaProyecto {

    public static void main(String[] args) {

        Producto producto1 = new Producto(001, "TV 45 pulgadas", 50000);
        Producto producto2 = new Producto(002, "Parlante XIAOMI", 45000);
        Producto producto3 = new Producto(003, "Lavadora de platos", 35500);
        Producto producto4 = new Producto(004, "Freidora de aire", 7000);
        Producto producto5 = new Producto(005, "Coffee Maker", 45500);
        Producto producto6 = new Producto(006, "Olla Arrocera", 65000);
        Producto producto7 = new Producto(007, "Olla multiusos", 15500);
        agregar Agregar = new agregar();
        Producto productoNuevo = null;
        Pedido pedidoNuevo = null;

        int intentos = 0;
        while (intentos < 3) {
            String usuario = JOptionPane.showInputDialog("Ingrese el usuario");
            String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña");

            if (usuario.equals("Administradores") && contraseña.equals("Principal")) {
                System.out.println("Bienvenido al sistema estimado administrador");

                int contadorMenu = 1;

                while (contadorMenu != 0) {
                    int opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para agregar un producto"
                            + "\nIngrese 2 para ver los productos" + "\nIngrese 3 para agregar un cliente" + "\nIngrese 4 para realizar la factura"));
                    switch (opcionMenu) {

                        case 1:
                            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto"));
                            String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del producto");
                            float precio = Float.valueOf(JOptionPane.showInputDialog("Ingrese el precio"));
                            Agregar.agregarproducto(codigo, descripcion, precio);

                            JOptionPane.showMessageDialog(null, "Producto guardado con éxito");
                            System.out.println("\n");
                            break;

                        case 2:

                            System.out.println(productoNuevo);
                            System.out.println("\n");
                            System.out.println(producto1);
                            System.out.println("\n");
                            System.out.println(producto2);
                            System.out.println("\n");
                            System.out.println(producto3);
                            System.out.println("\n");
                            System.out.println(producto4);
                            System.out.println("\n");
                            System.out.println(producto5);
                            System.out.println("\n");
                            System.out.println(producto6);
                            System.out.println("\n");
                            System.out.println(producto7);
                            System.out.println("\n");
                            
                            break;

                        case 3:
                            JOptionPane.showMessageDialog(null, "Ingrese los datos del cliente");
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del cliente"));
                            String direccion = JOptionPane.showInputDialog("Ingrese la direccion del cliente");
                            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono del cliente"));
                            String correo = JOptionPane.showInputDialog("Ingrese el correo del cliente");

                            Cliente clienteNuev = new Cliente(nombre, cedula, direccion, telefono, correo);
                            
                            System.out.println("\n");

                            JOptionPane.showMessageDialog(null, "Ingrese los datos del pedido");

                            String descripcio = JOptionPane.showInputDialog("Ingrese la descripcion del pedido");
                            int codigo1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del pedido"));

                            pedidoNuevo = Agregar.agregarPedido(descripcio, codigo1, producto7, clienteNuev);

                            System.out.println(pedidoNuevo);
                            
                            System.out.println("\n");
                            
                            break;

                        case 0:
                            contadorMenu = opcionMenu;

                    }
                    intentos = 3;
                }

            }
        }
    }
}
