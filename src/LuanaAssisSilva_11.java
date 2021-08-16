import java.util.Scanner;
public class LuanaAssisSilva_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o valor da conta 1 : ");
        double conta1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o valor da conta 2 :");
        double conta2 = Double.parseDouble(teclado.nextLine());
        double conta1m = conta1 + (conta1 * 0.02);
        double conta2m = conta2 + (conta2 * 0.02);
        double resto = salario - (conta1m + conta2m);
        System.out.println(" Restará " + resto + " do salário.");
    }
}
