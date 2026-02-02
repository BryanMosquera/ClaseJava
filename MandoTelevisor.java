import java.util.Scanner;

public class MandoTelevisor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Televisor tv1 = new Televisor();

        int opcion = -1;

        System.out.println("¡Bienvenido al Mando a Distancia Virtual!");

        do {
            System.out.println("======= MANDO =======");
            System.out.println("1. Subir Canal");
            System.out.println("2. Bajar Canal");
            System.out.println("3. Subir Volumen");
            System.out.println("4. Bajar Volumen");
            System.out.println("5. Subir Color");
            System.out.println("6. Bajar Color");
            System.out.println("0. Apagar / Salir");
            System.out.println("=====================");
            System.out.print("Ingrese una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    tv1.subirCanal();
                    System.out.println("Subiste un canal.");
                    break;
                case 2:
                    tv1.bajarCanal();
                    System.out.println("Bajaste un canal.");
                    break;
                case 3:
                    tv1.subirVolumen();
                    System.out.println("Subiste el volumen.");
                    break;
                case 4:
                    tv1.bajarVolumen();
                    System.out.println("Bajaste el volumen.");
                    break;
                case 5:
                    tv1.subirColor();
                    System.out.println("Subiste el color.");
                    break;
                case 6:
                    tv1.bajarColor();
                    System.out.println("Bajaste el color.");
                    break;
                case 0:
                    System.out.println("Apagando televisor. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            if (opcion >= 1 && opcion <= 6) {
                System.out.println("Canal: " + tv1.getCanal()
                        + " | Volumen: " + tv1.getVolumen()
                        + " | Color: " + tv1.getColor());
            }

        } while (opcion != 0);

        entrada.close();
    }
}
