import java.util.Scanner;
import static java.lang.Math.sqrt;
public class LuanaAssisSilva_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a medida da rua A: ");
        double ruaA = Double.parseDouble(teclado.nextLine());
        System.out.print("Digite a medida da rua B: ");
        double ruaB = Double.parseDouble(teclado.nextLine());
        System.out.print("Quantos km a serem caminhados? : ");
        double distancia = Double.parseDouble(teclado.nextLine());
        double ruaC = sqrt ( (ruaA*ruaA) + (ruaB*ruaB));
        double perimetro = ruaA + ruaB + ruaC ;
        double distanciaMetro =  distancia * 1000;
        int voltas = (int) (distanciaMetro / perimetro);
        System.out.println( voltas + ", é número de voltas a serem dadas no quarteirão");
    }
}
