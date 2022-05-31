import java.util.Scanner;

public class PrincipalJugador{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jugador jugador1 = new Jugador();

        int salud = scan.nextInt();
        jugador1.setSalud(salud);
        
        String nombre = scan.next();

        jugador1.setNombre(nombre);

        int num = scan.nextInt();
        jugador1.reducirSalud(num);
       
        int num2 = scan.nextInt();

        jugador1.reducirSalud(num2);

        System.out.println(jugador1.getNombre() + jugador1.getSalud());
    }
}