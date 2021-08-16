import java.util.Scanner;
public class LuanaAssisSilva_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasT = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioM = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
        double horasE = Double.parseDouble(teclado.nextLine());
        double a = salarioM * 0.125;
        double b = salarioM * 0.25;;
        double c = horasT * a;
        double d = horasE * b;
        double e = c + d;
        System.out.println( e + " é o salário a receber. ");
    }
}
