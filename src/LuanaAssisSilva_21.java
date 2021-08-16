import java.util.Scanner;
public class LuanaAssisSilva_21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do ângulo formado pela escada: ");
        double angulo = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite a altura da parede: ");
        double altura = Double.parseDouble(teclado.nextLine());
        double medida = ( altura / Math.sin(Math.toRadians(angulo)));
        // Math.sin retorna o seno do número & Math.toRadians transforma a medida do ângulo em radianos.
        System.out.println( medida + ",  é a medida da escada. ");
    }
}
