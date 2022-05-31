import java.util.Scanner;
public class SubTexto
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto = scan.next();
        int posicioninicial = scan.nextInt();
        int posicionfinal = scan.nextInt();
        
        String subm = texto.substring(posicioninicial,posicionfinal+1);
        System.out.println(subm);
    }
}
