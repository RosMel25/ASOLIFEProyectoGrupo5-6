package lacomarcaproyecto;

import Personas.Cliente;
import ProductosServicios.Producto;

class agregar {

    public Producto agregarproducto(int codigo, String descripcion, float precio) {
        Producto productoNuevo = new Producto(codigo, descripcion, precio);
        System.out.println(productoNuevo);

        return productoNuevo;

    }
    public Pedido agregarPedido(String descripcion, int codigo, Producto producto, Cliente cliente) {

        Pedido pedidoNuevo = new Pedido(descripcion, codigo, producto, cliente);

        return pedidoNuevo;
    }

    public Cliente agregarCliente(String nombre, int cedula, String direccion, int telefono, String correo) {

        Cliente clienteNuevo = new Cliente(nombre, cedula, direccion, telefono, correo);

        return clienteNuevo;
    }
}
