import java.util.Scanner;

public class TextoDuplicado
{

    public static void main(String[] args) { 
        String texto;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese texto: ");
        texto = entrada.next();

        System.out.println(texto+texto);
    }
}

