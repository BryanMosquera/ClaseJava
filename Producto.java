/*Crear una app para manejar las compras de un cliente en una tienda */
/*Se desea almacenar a cada cliente: */
/*Nombre, apellido, dni,codigo postale y compras realizadas, las compras son como maximo 10 productos.
/*De cada producto necesitamos saber: ID, nimbre, marca, color y precio(no puede ser negativo ni 0 minimo 10 euros) */
/*La aplicacion debera crear dos clientes de ejemplo y asigmarles a uno un producto y al segundo dos productos */
/*UML: MEtodos de cada clase: Getters y setters, un constructor con todos los atributos, el metodo toString personalizado */
public class Producto {
    private String id;
    private String nombre;
    private String marca;
    private String color;
    private double precio;

    // Constructor
    public Producto(String id, String nombre, String marca, String color, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        setPrecio(precio);
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 10) {
            this.precio = 10;
        } else {
            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return "Producto: " + id + ", " + nombre + ", " + marca + ", " + color + ", " + precio + " euros";
    }
}
