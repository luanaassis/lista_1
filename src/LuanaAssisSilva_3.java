import java.util.Scanner;
public class LuanaAssisSilva_3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número 1: ");
        double num1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o número 2: ");
        double num2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o número 3: ");
        double num3 = Double.parseDouble(teclado.nextLine());
        double resultado = (num1 * num2) / num3;
        System.out.println("O resultado da operação é " + resultado);
    }
}
