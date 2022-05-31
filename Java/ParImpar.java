import java.util.Scanner;

public class ParImpar
{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int numero = scan.nextInt();

       
        if(numero % 2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}