public class Cliente {
    private static final int MAX_PRODUCTOS = 10;

    private String nombre;
    private String apellido;
    private String dni;
    private String codigoPostal;
    private Producto[] comprasRealizadas;
    private int totalCompras;

    public Cliente(String nombre, String apellido, String dni, String codigoPostal, Producto[] comprasRealizadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.codigoPostal = codigoPostal;
        this.comprasRealizadas = new Producto[MAX_PRODUCTOS];
        this.totalCompras = 0;
        if (comprasRealizadas != null) {
            for (Producto producto : comprasRealizadas) {
                if (producto != null) {
                    agregarProducto(producto);
                }
            }
        }
    }

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
        Producto[] copia = new Producto[totalCompras];
        for (int i = 0; i < totalCompras; i++) {
            copia[i] = comprasRealizadas[i];
        }
        return copia;
    }

    public void setComprasRealizadas(Producto[] comprasRealizadas) {
        this.comprasRealizadas = new Producto[MAX_PRODUCTOS];
        this.totalCompras = 0;
        if (comprasRealizadas != null) {
            for (Producto producto : comprasRealizadas) {
                if (producto != null) {
                    agregarProducto(producto);
                }
            }
        }
    }

    public void agregarProducto(Producto producto) {
        if (totalCompras >= MAX_PRODUCTOS) {
            throw new IllegalStateException("No se pueden agregar mas de 10 productos.");
        }
        comprasRealizadas[totalCompras] = producto;
        totalCompras++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cliente{")
            .append("nombre='").append(nombre).append('\'')
            .append(", apellido='").append(apellido).append('\'')
            .append(", dni='").append(dni).append('\'')
            .append(", codigoPostal='").append(codigoPostal).append('\'')
            .append(", comprasRealizadas=");

        if (totalCompras == 0) {
            builder.append("[]");
        } else {
            builder.append('[');
            for (int i = 0; i < totalCompras; i++) {
                builder.append(comprasRealizadas[i]);
                if (i < totalCompras - 1) {
                    builder.append(", ");
                }
            }
            builder.append(']');
        }
        builder.append('}');
        return builder.toString();
    }
}
