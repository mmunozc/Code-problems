import java.util.Scanner;

public class Trabajo
{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int diatrabajado = scan.nextInt();
        double salario = scan.nextDouble();

        switch (diatrabajado){
            case 1:
            {
                salario = salario*1.455; 
                System.out.println(String.format("%.2f", salario));
                break;
            }

            case 2:
            case 3:
            {
                System.out.println(String.format("%.2f", salario));
                break;

            }

            case 4:
            {
                salario = salario*1.1;
                System.out.println(String.format("%.2f", salario));
                break;
            }

            case 5:
            {
                salario = salario*1.295;
                System.out.println(String.format("%.2f", salario));
                break;
            }

            case 6:
            case 7:
            {
                salario = salario*1.75;
                System.out.println(String.format("%.2f", salario));
                break;
            }

       
        }


    }
}