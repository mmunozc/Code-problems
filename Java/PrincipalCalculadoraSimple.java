import java.util.Scanner;
public class PrincipalCalculadoraSimple {
  public static void main(String[] args) {
    CalculadoraSimple calculo = new CalculadoraSimple();
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int suma = calculo.sumar(num1,num2);
    System.out.println(suma);
    int resta = calculo.restar(num1, num2);
    System.out.println(resta);
   }
}