package lacomarcaproyecto;

/**
 *
 * @author Dell
 */
public class Factura {
    private int id;
    private Producto producto;
    private Cliente cliente;
    private double subtotal;
    private double impuestos;
    private double descuento;
    private double total;

    public Factura(int id, Producto producto, Cliente cliente, double subtotal, double impuestos, double descuento, double total) {
        this.id = id;
        this.producto = producto;
        this.cliente = cliente;
        this.subtotal = subtotal;
        this.impuestos = impuestos;
        this.descuento = descuento;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura" + "\nID:" + id +  "\nproducto:" + producto + "\nCliente=" + cliente + "\nSubtotal=" + subtotal + "\nImpuestos:" + impuestos + "\nDescuento:" + descuento + "\nTotal=" + total;
    }
}
