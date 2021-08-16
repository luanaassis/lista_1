import java.util.Scanner;
public class LuanaAssisSilva_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a base do retângulo: ");
        double base = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe a altura do retângulo: ");
        double altura = Double.parseDouble(teclado.nextLine());
        double area = base * altura;
        double perimetro = (2 * base) + (2 * altura);
        System.out.println("A área do retângulo é " + area + " m^2 e o perímetro do retângulo é " + perimetro + " m");
    }
}
