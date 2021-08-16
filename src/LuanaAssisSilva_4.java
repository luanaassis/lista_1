import java.util.Scanner;
public class LuanaAssisSilva_4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a primeira nota: ");
        double nota1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe o primeiro peso: ");
        double peso1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe a segunda nota: ");
        double nota2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe o segundo peso: ");
        double peso2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe a terceira nota: ");
        double nota3 = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe o terceiro peso: ");
        double peso3 = Double.parseDouble(teclado.nextLine());
        double mediaP = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.println(" A média ponderada das notas é: " + mediaP);
    }
}
