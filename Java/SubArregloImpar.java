public class SubArregloImpar{
    public static int[] subArreglo(int[] a){
        int varb = 0;
        for(int i=0; i<a.length; i++){
            if(!(a[i] % 2==0)){
                varb++;                
            }
        }
        
        int[] arreglo = new int[varb];
        int num = 0;
        for(int i=0; i<a.length; i++){
            if(!(a[i] % 2==0)){
                arreglo[num] = a[i];
                num++;                
            }
        }
        return arreglo;

    }
   

    public static void imprimir(int[] a){

        for(int i=0; i<a.length; i++){
            if(i==a.length-1){
                System.out.print(a[i]);
            }else{
                System.out.print(a[i]+ ",");
            }

        }

    }
}