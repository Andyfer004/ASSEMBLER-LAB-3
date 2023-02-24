import java.util.Scanner;

public class DecimalHexadecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número decimal entre 0 y 4095: ");
        int decimal = scanner.nextInt();

        if (decimal < 0 || decimal > 4095) {
            System.out.println("El número ingresado no está en el rango válido.");
            return;
        }

        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("El número " + decimal + " en hexadecimal es: " + hexadecimal.toUpperCase());
    }
}

