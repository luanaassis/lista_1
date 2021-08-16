import java.util.Scanner;
public class LuanaAssisSilva_1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num1 = teclado.nextInt();
        System.out.print("Informe um número: ");
        int num2 = teclado.nextInt();
        System.out.print("Informe um número: ");
        int num3 = teclado.nextInt();
        int soma = (num1 + num2 + num3);
        int media = soma/3;
        System.out.println(" A média dos 3 números é " + media);
    }
}
