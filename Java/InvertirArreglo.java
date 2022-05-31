public class InvertirArreglo{
    public static  int[] invertir(int[] a){
        int[] inv = new int[a.length];
        
        for(int i = 0, j = inv.length -1; i<a.length; i++, j--){
            inv [i] = a[j];
        }
        return inv;
    }

    public static void imprimir(int[] a){
         
        for(int i=0; i<a.length; i++){
            if(i==a.length-1){
                System.out.print(Integer.toString(a[i]));
            }else{
                System.out.print(Integer.toString(a[i])+ ",");
            }

        }

    }
}


