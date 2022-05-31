import java.util.Scanner;
public class Radio {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese radio del circulo: ");
        double radio = scan.nextDouble();

        double area = Math.PI*(Math.pow(radio,2));
        System.out.println("El valor del area es:");
        System.out.println(String.format("%.2f",  area));     
    }
}