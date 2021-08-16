import java.util.Scanner;
public class LuanaAssisSilva_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de lados de um polígono convexo regular: ");
        int n = teclado.nextInt();
        int nd = n * (n - 3) / 2;
        System.out.println("O polígono possui " +nd+ " diagonais");
    }
}
