import java.util.Scanner;
public class WithoutString{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String base = scan.next();
        String eliminar = scan.next();
        if(base.contains(eliminar)){
            base = base.substring(0,base.indexOf(eliminar))+base.substring(base.indexOf(eliminar)+eliminar.length());
        }
        System.out.println(base);
    }
}