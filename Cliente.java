public class Cliente {
    private static final int MAX_PRODUCTOS = 10;

    private String nombre;
    private String apellido;
    private String dni;
    private String codigoPostal;
    private Producto[] comprasRealizadas;
    private int totalCompras;

    public Cliente(String nombre, String apellido, String dni, String codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.codigoPostal = codigoPostal;
        this.comprasRealizadas = new Producto[MAX_PRODUCTOS];
        this.totalCompras = 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Producto[] getComprasRealizadas() {
        return comprasRealizadas;
    }

    public void setComprasRealizadas(Producto[] comprasRealizadas) {
        this.comprasRealizadas = comprasRealizadas;
    }

    public int getTotalCompras() {
        return totalCompras;
    }

    public void agregarProducto(Producto producto) {
        if (totalCompras < MAX_PRODUCTOS) {
            comprasRealizadas[totalCompras] = producto;
            totalCompras++;
        }
    }

    @Override
    public String toString() {
        String texto = "Cliente: " + nombre + " " + apellido + ", DNI: " + dni + ", CP: " + codigoPostal + "\n";
        texto += "Compras: ";

        if (totalCompras == 0) {
            texto += "sin compras";
        } else {
            for (int i = 0; i < totalCompras; i++) {
                texto += "\n  - " + comprasRealizadas[i].toString();
            }
        }
        return texto;
    }
}
