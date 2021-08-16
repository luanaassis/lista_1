import java.util.Scanner;
public class LuanaAssisSilva_22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor para A: ");
        double a = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite um valor para B: ");
        double b = Double.parseDouble(teclado.nextLine());
        double aT = b;
        b = a;
        a = aT;
        System.out.println(" O valor de A é " + a + ",  e o valor de B é " + b );
    }
}
