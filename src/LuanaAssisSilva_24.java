import java.util.Scanner;
public class LuanaAssisSilva_24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Digite um valor para a : ");
        int a = teclado.nextInt();
        System.out.print("Digite um valor para b : ");
        int b = teclado.nextInt();
        System.out.print("Digite um valor para c : ");
        int c = teclado.nextInt();
        int delta = (int) Math.pow(b, 2) + (-4 * a) * c;
        if (delta >= 0 ) {
            double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println(" As raízes da equação " + a + " x^2 + " + b + " x + " + c + " são : " + x1 + " , " + x2);
        }
        else {System.out.println(" O valor de delta é negativo, portanto não há raízes. ");
        }
    }
}
