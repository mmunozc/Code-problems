public class PrincipalPoint{
    public static void main (String [] args){
        Point p1 = new Point ();
        p1.setX(4);
        p1.setY(4);
        Point p2 = new Point ();
        p2.setX(4);
        p2.setY(5);

        double dist = p1.distance(p2);

        Point pMedio = p1.pointMedio(p2);
        System.out.println("Distancia :" + dist);
        System.out.println("Punto Medio :" + pMedio.getX() + " "+ pMedio.getY());

    }
}

