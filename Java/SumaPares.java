import java.util.Scanner;

public class SumaPares{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int valor=0;
        while (n>0){
            int numero = scan.nextInt();
            if (numero %  2==0){
                valor = valor+numero;
            }
            n -=1;
        }
        System.out.print(valor);
    }
}
