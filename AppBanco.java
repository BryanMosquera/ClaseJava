public class AppBanco {
    public static void main(String[] args) {
    Persona p1= new Persona ("Juan", "Pérez", "12345678A", 2007, "Madrid", "Ingeniero");
    p1.obtenerDatos();
    CuentaBancaria cuenta1 = new CuentaBancaria("123456789", p1, "Cuenta Corriente",10);
    cuenta1.mostrarCuenta();
    CuentaBancaria cuenta2 = new CuentaBancaria("123456324", p1, "Cuenta Plazo Fijo", 1000);
    cuenta2.mostrarCuenta();
    cuenta1.sacar(25);
    cuenta2.sacar(100);
    }
}
