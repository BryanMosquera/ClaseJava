public class AppPunto {
    public static void main(String[] args) {
        System.out.println("Puntos creados al principio"+Punto.getCantidadPuntos());
        //Crear un punto con el primer constructor
        Punto p1 = new Punto(5); //crear el punto (5,5)
        System.out.println("p1="+p1.toString());
        double distancia1 = p1.calcularDistanciaCentro();
        System.out.println("La distancia la punto1 es:"+distancia1);
        //Crear un segundo punto con el otro constructor
        Punto p2 = new Punto(4,0); //Quiero crear el punto (4,0)
        System.out.println("p2="+p2.toString());
        double distancia2 = p2.calcularDistanciaCentro();
        System.out.println("La distancia al punto2 es:"+distancia2);
        Punto p3 = new Punto(10,20);
        System.out.println("Puntos creados:"+Punto.getCantidadPuntos());
        System.out.println("Imprimimos el valor de punto1");
        System.out.println(p1.toString());
        
    }
}