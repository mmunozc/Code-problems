import java.util.Scanner;
public class Word{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String frase = scan.next();
        
        frase = frase.toLowerCase();
        
        System.out.println(frase.length());
        System.out.println(frase.indexOf("a"));
    }
}