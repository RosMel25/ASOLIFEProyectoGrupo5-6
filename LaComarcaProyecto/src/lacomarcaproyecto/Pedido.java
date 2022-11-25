package lacomarcaproyecto;

import Personas.Cliente;
import ProductosServicios.Producto;

class Pedido {
    private String descripcion;
    private int codigo;
    private Producto producto;
    private Cliente cliente;

    @Override
    public String toString() {
        return "Pedido{" + "descripcion=" + descripcion + ", codigo=" + codigo + ", producto=" + producto + ", cliente=" + cliente + '}';
    }

    public Pedido(String descripcion, int codigo, Producto producto, Cliente cliente) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.producto = producto;
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
