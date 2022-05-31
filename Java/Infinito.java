import java.util.Scanner;
public class Infinito{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero;
        while (true){
            numero = scan.nextInt();
            if(numero==0){
                break;
            }else{
                System.out.println(numero*3);
            }
        }
    }
}