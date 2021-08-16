import java.util.Scanner;
import static java.lang.Math.round;
public class LuanaAssisSilva_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano atual: ");
        int anoAtual = teclado.nextInt();
        int numCopas = ((anoAtual - 1930)/4) - 1;
        System.out.println( numCopas + " copas já foram realizadas, desde 1930.");
    }
}
