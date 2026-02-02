public class Televisor {

    private int canal;
    private int volumen;
    private int color;
    //constructor por defecto
    public Televisor(){
        setCanal(canal=1);
        setVolumen(volumen=0);
        setColor(color=7);
    }
    public Televisor(int valorCanal){
        setCanal(valorCanal);
        setVolumen(0);
        setColor(7);
    }
    //metodos para implementar la app mando a distancia
    public void subirCanal(){
         if (canal == 10) {
            canal = 0;
        } else {
            canal++;
        }
    }
    public void bajarCanal(){
         if (canal == 0) {
            canal = 10;
        } else {
            canal--;
        }
    }
    private void cambiarCanal(int nuevoCanal) {
        setCanal(nuevoCanal);
    }
    private void setCanal(int nuevoCanal){
        if(nuevoCanal<0 || nuevoCanal>10)
            canal=0;
        else canal=nuevoCanal;
        verCanal();
    }
    public int getCanal(){
        return canal;
    }

    //VOLUMEN
    public void subirVolumen() {
        if (volumen<15){
            volumen++;
        }
    }
    public void bajarVolumen() {
        if (volumen>0){
            volumen--;
        }
    }
    private void setVolumen(int nuevoVolumen) {
        if (nuevoVolumen < 0 || nuevoVolumen >15) {
            volumen = 0;
        } else if (nuevoVolumen>15){
            volumen=15;
        }else {
            volumen = nuevoVolumen;
        }
        verVolumen();
    }
    public int getVolumen() {
        return volumen;
    }

    //COLOR
    public void subirColor() {
       if (color < 7) {
            color++;
        }
    }
    public void bajarColor() {
        if (color > 1) {
            color--;
        }
    }
     private void setColor(int nuevoColor) {
       if (nuevoColor < 1) {
            color = 1;
        } else if (nuevoColor > 7) {
            color = 7;
        } else {
            color = nuevoColor;
        }
        verColor();
    }
    public int getColor() {
        return color;
    }
    private void verCanal(){
        System.out.println("Canal: " +canal);
    }
    private void verVolumen(){
        System.out.println("Volumen: " +volumen);
    }
    private void verColor(){
        System.out.println("Color: "+color);
    }
}
