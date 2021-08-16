import java.util.Scanner;
public class LuanaAssisSilva_18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do salário mínimo : ");
        double salarioM = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe a quantidade de quilowatts consumidas : ");
        double quilowattsR = Double.parseDouble(teclado.nextLine());
        double a = (salarioM/5);
        double b = quilowattsR * a;
        double c = b - (b * 0.15);
        System.out.println( a + " é o valor pago por quilowatt; " + b + " é o valor a ser pago pelo consumo, e " + c + " é o valor a ser pago com desconto de 15% .");
    }
}
