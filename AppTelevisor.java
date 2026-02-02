import java.util.Scanner;

public class AppTelevisor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Televisor tv1 = new Televisor();

        menu(entrada, tv1);
    }

    public static void menu(Scanner entrada, Televisor tv1) {

        menu(tv1);
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                tv1.subirCanal();
                break;
            case 2:
                tv1.bajarCanal();
                break;
            case 3:
                tv1.subirVolumen();
                break;
            case 4:
                tv1.bajarVolumen();
                break;
            case 5:
                tv1.subirColor();
                break;
            case 6:
                tv1.bajarColor();
                break;
            case 0:
                System.out.println("Salió del televisor");
                entrada.close();
                return;
            default:
                System.out.println("La opción no es correcta");
        }

        menu(entrada, tv1);
    }
    public static void menu(Televisor tv1) {
         System.out.println("""
        ----- MENÚ TELEVISOR -----
        Canal: """ + tv1.getCanal() + """
        / Volumen: """ + tv1.getVolumen() + """
        / Color: """ + tv1.getColor() + """
        
        1. Subir canal
        2. Bajar canal
        3. Subir volumen
        4. Bajar volumen
        5. Subir color
        6. Bajar color
        0. Salir""");
        System.out.print("Elige una opción: ");
    }
}
