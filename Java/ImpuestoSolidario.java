import java.util.Scanner;

public class ImpuestoSolidario
{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        double salario = scan.nextDouble();

        String tipocontrato = scan.next();

        if((salario > 10000000)&&(tipocontrato.equals("publico"))){
            salario = salario/100*15;
            System.out.println(String.format("%.2f", salario));
        }else{
            System.out.println("No debes aportar");
        }
    }
}