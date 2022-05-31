import java.util.Scanner;

public class Supermercado
{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int tipoproducto = scan.nextInt();
        int cantprodcomprados = scan.nextInt();

        if(tipoproducto==1){
            System.out.println(5*cantprodcomprados);
        }else if(tipoproducto==2){
            System.out.println(10*cantprodcomprados);
        }else if(tipoproducto==3){
            System.out.println(15*cantprodcomprados);
        }
    }
}