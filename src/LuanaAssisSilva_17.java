import java.util.Scanner;
public class LuanaAssisSilva_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        double numero = Double.parseDouble(teclado.nextLine());
        int inteiro = (int) numero;
        double fracionaria = (numero - inteiro);
        System.out.println("A parte inteira do número informado é " + inteiro + " e a parte fracionária é "+ fracionaria+ ".");
    }
}
