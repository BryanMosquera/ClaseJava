import java.util.Random;

public class AppArrayPuntos {
    public static void main(String[]args){
        Punto[]puntos = new Punto[5];
        puntos[0]= new Punto(1,1);
        puntos[1]= new Punto(2,2);
        System.out.println("Llevamos "+Punto.getCantidadPuntos()+" puntos creados.");
        System.out.println("El primer punto del array es:"+puntos[0].toString());
        System.out.println("El segundo punto del array es:"+puntos[1].toString());
        //Creamos un arrary de 5 puntos aleatorios 
        Random r = new Random();
        Punto[] puntosAlePuntos = new Punto[5];
        for (int i=0;i<puntosAlePuntos.length;i++){
            puntosAlePuntos[i]= new Punto(r.nextInt(20), r.nextInt(20));
        }
        for (int i=0;i<puntosAlePuntos.length;i++){
            System.out.println("Punto"+(i+1)+":" + puntosAlePuntos[i].toString());
        }
        System.out.println("Puntos generados:"+ Punto.getCantidadPuntos());
    }
}
