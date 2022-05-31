import java.util.Scanner;

public class PrincipalPlaneta{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        
        int cont = 0;
        while(cont<5){
            System.out.println("Ingrese el nombre del planeta");
            String nombre = s1.next();
            
            System.out.println("Ingrese la masa del planeta");
            double masa = s1.nextDouble();
            
            Planeta newPlaneta = new Planeta(nombre, masa);
            
            System.out.println(newPlaneta.getNombre());
            System.out.println(newPlaneta.getMasa());
            
            cont++;
        }
    }
}