public class Planeta{
    private String nombre;
    private double masa;
    public static int contador = 0;
    
    public Planeta(String nom, double mas){
        this.nombre=nom;
        this.masa=mas;
    }
    
    public Planeta(){
        this("Tierra",5.972);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getMasa(){
        return this.masa;
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public void setMasa(double mas){
        this.masa = mas;
    }
    
    public static Planeta planetaMedio(Planeta p){
        Planeta p1 = new Planeta (p.getNombre(),p.getMasa()/2);
        
       return p1;
    }
    
}