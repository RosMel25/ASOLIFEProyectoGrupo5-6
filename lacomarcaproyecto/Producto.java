package lacomarcaproyecto;

/**
 *
 * @author Dell
 */
public class Producto {
    private String nombre;
    private int id;
    private double precio;

    public Producto(String nombre, int id, int precio) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto" + "\nArtículo comprado:" + nombre + "\nID del artículo:" + id + "\nPrecio del artículo:" + precio;
    }
}
