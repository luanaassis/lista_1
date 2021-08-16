import java.util.Scanner;
public class LuanaAssisSilva_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe os minutos :  ");
        int minutos = teclado.nextInt();
        int horas = minutos / 60;
        int restoMin = minutos % 60;
        System.out.println("O resultado é : " + horas + " hora(s), e " + restoMin + " minutos." );
    }
}
