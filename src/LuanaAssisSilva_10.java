import java.util.Scanner;
public class LuanaAssisSilva_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor depositado no fundo de investimento: ");
        double valorDepositado = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o percentual de rendimento ao mês: ");
        double rendimento = Double.parseDouble(teclado.nextLine());
        System.out.print("Quantos meses o valor ficou investido?: ");
        double tempo = teclado.nextInt();
        double totalAcumulado = valorDepositado * (1 + (rendimento/100)) * tempo;
        System.out.println("O valor total acumulado é de " + totalAcumulado + " reais");
    }
}
