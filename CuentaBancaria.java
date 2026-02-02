public class CuentaBancaria {
    //Atributos 
    private String id;
    private double saldo;
    private Persona propietario;
    private String tipo;
    //constructores 
    //Crear una cuenta sin saldo incial 
    public CuentaBancaria(String id, Persona propietario, String tipo){
        this.id=id;
        this.propietario= propietario;
        this.tipo= tipo;
    }
    //Crear una cuenta con saldo incial
    public CuentaBancaria(String id, Persona propietario, String tipo, double saldo){
        this(id,propietario,tipo);
        this.saldo=saldo;
    }

    private double getSaldo(){
        return saldo;
    }
    //metodo
    //metodo ingresr : si la cantidad a ingresar es <=0 mensaje y no ingresa nada
    public void ingresar(double cantidad){
        if(cantidad<=0){
            System.out.println("Error en la cantidad");
        }else{
            saldo+=cantidad; //saldo=saldo+cantidad
            System.out.println("Ingreso realizado correctamente");
        }
        System.out.println("Saldo actual: "+ getSaldo());
    }

// metodo sacar debe comprobar que la cantidad es menor que el saldo
    public void sacar(double cantidad){
        if(cantidad>saldo){
            System.out.println("Error saldo insuficiente");
        } else{
        saldo-=cantidad; //saldo=sando-cantidad
        System.out.println("Operacion realizada correctamente");
        }
        System.out.println("Saldo actual: "+ getSaldo());
    }

    public void mostrarCuenta(){
        System.out.println("\t\t------------------------------------");
        System.out.println("\t\t      Datos cuenta Bancaria ");
        System.out.println("\t\t------------------------------------");
        System.out.println("\t\tN°: " + id);
        System.out.println("\t\tTipo: " + tipo);
        System.out.println("\t\tSaldo: " + saldo);
        System.out.println("\t\ttitular:"+propietario.getNombre()+" "+propietario.getApellidos());
        System.out.println("\t\t------------------------------------");

    }
}
