import java.util.Scanner;

public class Mayores
{

    public static void main(String[] args) { 
        int num1, num2;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num1 = entrada.nextInt();

        System.out.println("Ingrese otro numero: ");
        num2 = entrada.nextInt();

        System.out.println(num1+num2);

        System.out.println(num1*num2);
    }
}

