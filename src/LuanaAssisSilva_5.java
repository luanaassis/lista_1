import java.util.Scanner;
public class LuanaAssisSilva_5 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o salário: ");
        double salarioB = Double.parseDouble(teclado.nextLine());
        double salarioG = salarioB + (salarioB * 0.10);
        double salarioF = salarioG - (salarioG * 0.05);
        System.out.println("O salário final é " + salarioF);
    }
}
