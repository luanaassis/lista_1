import java.util.Scanner;
public class LuanaAssisSilva_2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = teclado.nextInt();
        int antecessor = num - 1;
        int sucessor = num + 1;
        System.out.println("O número antecessor do número informado é: " + antecessor);
        System.out.println("O número sucessor do número informado é: " + sucessor);
    }
}
