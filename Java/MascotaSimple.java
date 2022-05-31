public class MascotaSimple{
    private int edad = 8;
    private String nombre;
    
   public MascotaSimple(){
         this.nombre = "Kitty";
    }
   public MascotaSimple(String nom){
       this.nombre = nom;
    }
   public MascotaSimple(String nmb,int edad){
       this.nombre = nmb;
       this.edad = edad;
    }
   public String getNombre(){
       return this.nombre;
    }
   public int getEdad(){
       return this.edad;
    }
    
}
   
   
  