import java.util.Scanner;
public class LuanaAssisSilva_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a base maior do lote: ");
        double baseMaior = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite a base menor do lote: ");
        double baseMenor = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite a altura do lote: ");
        double altura = Double.parseDouble(teclado.nextLine());
        System.out.print("Qual o valor médio por m^2 ? : ");
        double valorM = Double.parseDouble(teclado.nextLine());
        double area = ((baseMaior + baseMenor) * altura) / 2;
        double valorV = area * valorM;
        System.out.println("Área total do lote é " + area + " m^2 e o valor médio do lote é de " + valorV);
    }
}
