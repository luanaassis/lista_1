import java.util.Scanner;
public class LuanaAssisSilva_23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" A pesquisa foi feita com quantas pessoas? ");
        int total = teclado.nextInt();
        System.out.print(" Pessoas que assistem a novela A: ");
        int a = teclado.nextInt();
        System.out.print(" Pessoas que assistem a novela B: ");
        int b = teclado.nextInt();
        System.out.print(" Pessoas que assistem a novela C: ");
        int c = teclado.nextInt();
        System.out.print(" Pessoas que assistem as novelas A & B: ");
        int ab = teclado.nextInt();
        System.out.print(" Pessoas que assistem as novelas A & C: ");
        int ac = teclado.nextInt();
        System.out.print(" Pessoas que assistem as novelas B & C : ");
        int bc = teclado.nextInt();
        System.out.print(" Pessoas que assistem todas as opções: ");
        int abc = teclado.nextInt();
        int nAssiste = total - (a - ab - ac - abc) - (ab) - (ac) - (b - ab - bc - abc) - (bc) - (c - ac - bc - abc) - abc;
        System.out.println( nAssiste + " pessoas não assistem nenhuma das novelas.");
    }
}
