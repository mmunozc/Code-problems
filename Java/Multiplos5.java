import java.util.Scanner;
public class Multiplos5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese num");
         int n = scan.nextInt();
        for(int i=0; i<=n; i+=5){
            System.out.println(i);
        }
    }
}