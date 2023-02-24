import java.util.Scanner;

public class HexadecimalDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número hexadecimal de 3 dígitos: ");
        String input = scanner.nextLine();

        if (input.length() != 3) {
            System.out.println("El número ingresado no tiene 3 dígitos hexadecimales.");
            return;
        }

        int decimal = Integer.parseInt(input, 16);
        System.out.println("El número " + input + " en decimal es: " + decimal);
    }
}

