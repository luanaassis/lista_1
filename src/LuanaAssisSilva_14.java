import java.util.Scanner;
public class LuanaAssisSilva_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o comprimento da base do quarto: ");
        double base = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite o comprimento da altura do quarto: ");
        double altura = Double.parseDouble(teclado.nextLine());
        double area = base * altura;
        double potencia = area * 18;
        System.out.println("A área do quarto é de " + area + " m^2, e a potência de iluminação necessária é de " + potencia + " watts.");
    }
}
