public class Persona {
    private String nombre;
    private String apellidos;
    private int fechaNacimiento; //Es el año de nacimiento 
    private String ciudad;
    private String profesion;
    private String dni;
//Si no se especifica ningun constructor se genera el constructor Persona() sin ningun atributo por defecto. 
//Construir un constuctor por defecto que inicialice los atributos con valores por defecto.
    public Persona(String nombre, String apellidos,String dni, int fechaNacimiento){
        this.nombre = nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        cambiarFechaNacimiento(fechaNacimiento);
    }

    public Persona(String nombre, String apellidos,String dni, int fechaNacimiento, String ciudad, String profesion){
        this(nombre, apellidos, dni, fechaNacimiento);
        this.ciudad=ciudad;
        this.profesion=profesion;
    }
    public String getNombre(){
    return nombre;

}
    public String getApellidos(){
    return apellidos;
}
   //getter 
    public int obtenerFechaNacimiento(){
        return fechaNacimiento;
    }
    public void obtenerDatos(){
        String cadena = "Nombre: " + nombre + "\n" + "Apellidos: " + apellidos + "\n" + "Fecha de Nacimiento: " + fechaNacimiento + "\n" + "Ciudad: " + ciudad + "\n" + "Profesión: " + profesion + "\n" + "DNI: " + dni;
        System.out.println(cadena);
    }
    //setter
    public void cambiarProfesion(String Profesion){
        this.profesion=Profesion.trim().toUpperCase();
    }
    public void modificarCiudadResidencia(String nuevaCiudad){
        ciudad=nuevaCiudad.trim().toUpperCase();
    }
    public void cambiarNombre(String nuevoNombre){
        nombre=nuevoNombre.trim().toUpperCase();
    }
    public void cambiarApellidos(String nuevosApellidos){
        apellidos=nuevosApellidos.trim().toUpperCase();
    }
    public void cambiarDNI(String nuevoDNI){
        dni=nuevoDNI.trim().toUpperCase();
}
    public void cambiarFechaNacimiento(int fechaNacimiento){
        //comprobar que la edad es >=18 sino, no se cambia
        if (fechaNacimiento>2008)
           this.fechaNacimiento = fechaNacimiento;
    }   

}