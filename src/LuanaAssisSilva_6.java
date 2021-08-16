import java.util.Scanner;

public class LuanaAssisSilva_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Digite o salário fixo: ");
        double salarioF = Double.parseDouble(teclado.nextLine());
        System.out.print(" Digite o valor de vendas: ");
        double valorV = Double.parseDouble(teclado.nextLine());
        double beneficio = salarioF + (valorV * 0.04);
        System.out.println ("O benefício que o funcionário receberá é de: " + beneficio );
    }
}
