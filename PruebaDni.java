public class PruebaDni {
     // Tabla de letras para el cálculo del DNI
    private static final char[] LETRAS_DNI = {
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    /**
     * Valida un DNI español sin usar expresiones regulares.
     * @param dni La cadena que representa el DNI (ej: "12345678A").
     * @return true si el DNI es válido, false en caso contrario.
     */
    public static boolean validarDNI(String dni) {
        if (dni == null || dni.length() != 9) {
            return false; // Longitud incorrecta
        }

        String numStr = dni.substring(0, 8); // Parte numérica
        char letraDNI = Character.toUpperCase(dni.charAt(8)); // Letra proporcionada

        // 1. Validar que los primeros 8 caracteres sean dígitos
        if (!esNumerico(numStr)) {
            return false;
        }

        int numeroDNI = Integer.parseInt(numStr);

        // 2. Calcular la letra correspondiente
        int resto = numeroDNI % 23;
        char letraCalculada = LETRAS_DNI[resto];

        // 3. Comparar la letra calculada con la proporcionada
        return letraCalculada == letraDNI;
    }

    /**
     * Método auxiliar para verificar si una cadena contiene solo números.
     * @param str La cadena a verificar.
     * @return true si es numérica, false si no.
     */
    private static boolean esNumerico(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false; // Si no es un dígito, es inválido
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println("1324342A es valido" + validarDNI("1324342A")); 
    }
}
