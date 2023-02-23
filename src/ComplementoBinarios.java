import java.util.Scanner;

public class ComplementoBinarios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número binario de 8 bits: ");
        String binario = input.nextLine();

        // Representación en complemento a magnitud y signo
        char signo = binario.charAt(0);
        String magnitud = binario.substring(1);
        System.out.println("Complemento a magnitud y signo: " + signo + magnitud);

        // Representación en complemento a dos
        String complemento = "";
        boolean carry = true;
        for (int i = binario.length() - 1; i >= 0; i--) {
            char bit = binario.charAt(i);
            if (carry) {
                if (bit == '0') {
                    complemento = "1" + complemento;
                    carry = false;
                } else {
                    complemento = "0" + complemento;
                }
            } else {
                complemento = bit + complemento;
            }
        }
        System.out.println("Complemento a dos: " + complemento);
    }
}