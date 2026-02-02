public class Punto {

    private int x;
    private int y;
    //atributo estatico que es una variable global a toda la calse
    //no esta asociada a ningun objeto Punto.cantidadPunto
    private static int cantidadPuntos;
    public Punto (int x){
        this.x=x;
        cantidadPuntos++;
    }
    public Punto(int x, int y){
        this(x); //this.x=x
        this.y=y;
    }
    //este metodo es static pq no deberia estar asociado a ningun objeto 
    //(solo esta asociado a la clase, es decir es generico de la clase) --> Punto.getCantidadPunto
    public static int getCantidadPuntos(){
        return cantidadPuntos;
    }
    public double calcularDistanciaCentro(){
        return Math.sqrt((x*x)+(y*y));
        //return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)); ELEVAR AL CUADRADO
    }
    @Override
    public String toString(){
        return "["+x+","+y+"]";
    }
}