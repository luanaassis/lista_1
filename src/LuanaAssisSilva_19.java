import java.util.Scanner;
public class LuanaAssisSilva_19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        double numero = Double.parseDouble(teclado.nextLine());
        if (numero >= 0) {
            double quadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);
            double raizQ = Math.sqrt(numero);
            double raizC = Math.cbrt(numero);
            System.out.println( numero + " elevado ao quadrado é " + quadrado + " e elevado ao cubo é " + cubo);
            System.out.println("A raiz quadrada de "+ numero +" é " + raizQ + " e a raiz cubica é " + raizC);
        } else {
            System.out.println("Apenas números positivos!");
        }
    }
}