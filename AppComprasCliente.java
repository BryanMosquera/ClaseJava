public class AppComprasCliente {
    public static void main(String[] args) {
        Producto producto1 = new Producto("P001", "Camisa", "ModaPlus", "Azul", 25.50);
        Producto producto2 = new Producto("P002", "Pantalon", "UrbanStyle", "Negro", 35.00);
        Producto producto3 = new Producto("P003", "Zapatos", "Elegance", "Marron", 59.99);

        Cliente cliente1 = new Cliente("Ana", "Gomez", "12345678A", "28080", null);
        cliente1.agregarProducto(producto1);

        Cliente cliente2 = new Cliente("Luis", "Martinez", "87654321B", "46001", null);
        cliente2.agregarProducto(producto2);
        cliente2.agregarProducto(producto3);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
