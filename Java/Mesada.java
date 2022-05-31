import java.util.Scanner;
public class Mesada{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
       String persona = scan.next(); 
       int dinero;;
        while(true){
            dinero = scan.nextInt();
            if(dinero>500){
                System.out.print(persona + " eres mi angel");
                break;
            }else{
                System.out.print(persona + " me decepcionas");
            }
            
        }
    }
}