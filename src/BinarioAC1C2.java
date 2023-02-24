import java.util.Scanner;

public class BinarioAC1C2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número binario de 8 bits: ");
        String input = scanner.nextLine();

        /**
         * Validación de la entrada
         */
        if (input.length() != 8 || !input.matches("[01]+")) {
            System.out.println("La entrada no es válida.");
            return;
        }

       /**
        * en esta parte hacemos un complemento a 1
        * */
        StringBuilder complementoUno = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            complementoUno.append(c == '0' ? '1' : '0');
        }
        System.out.println("Complemento a uno: " + complementoUno.toString());

        /**
         * En esta parte hacemos un complemento a 2
         */
        StringBuilder complementoDos = new StringBuilder();
        boolean carry = true;
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = complementoUno.charAt(i);
            if (carry) {
                if (c == '0') {
                    complementoDos.append('1');
                    carry = false;
                } else {
                    complementoDos.append('0');
                }
            } else {
                complementoDos.append(c);
            }
        }
        if (carry) {
            complementoDos.append('1');
        }
        System.out.println("Complemento a dos: " + complementoDos.reverse().toString());
    }
}




