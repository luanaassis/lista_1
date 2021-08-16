import java.util.Scanner;
public class LuanaAssisSilva_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o raio da circunferência: ");
        double raio = Double.parseDouble(teclado.nextLine());
        final double pi = 3.1416;
        double areaC = pi * (raio*raio);
        System.out.println( areaC + "é a área da circunferência.");
    }
}
