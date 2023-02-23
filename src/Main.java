import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("BIENVENIDO A CALCULADORA BINARIOS ");
            System.out.println("Seleccione una opción");
            System.out.println("1. Convertir número binario a complemento a magnitud y signo");
            System.out.println("2. Convertir número binario a complemento a dos");
            n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Ingrese un número binario de 8 bits: ");
                    String binario1 = input.nextLine();
                    // Representación en complemento a magnitud y signo
                    char signo = binario1.charAt(0);
                    String magnitud = binario1.substring(1);
                    System.out.println("Complemento a magnitud y signo: " + signo + magnitud);
                    break;
                case 2:
                    System.out.print("Ingrese un número binario de 8 bits: ");
                    String binario2 = input.nextLine();
                    // Representación en complemento a dos
                    String complemento = "";
                    boolean carry = true;
                    for (int i = binario2.length() - 1; i >= 0; i--) {
                        char bit = binario2.charAt(i);
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
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        } while (n != 2);
    }
}
