import java.util.Scanner;
public class SubTextoMejorado
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto = scan.next();
        int posicioninicial = scan.nextInt();
        int posicionfinal = scan.nextInt();
        

        if (posicionfinal>texto.length()){
            System.out.println("Error");
        }else if (posicioninicial>posicionfinal){
            System.out.println("Error2");
        }else{
            String subm = texto.substring(posicioninicial,posicionfinal+1);
            System.out.println(subm);
        }
    }
}
