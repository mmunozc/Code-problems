package labs;

public class insertionSort
{
public static int[] insertion_Sort (int[] array){
        int temp;
        for(int i = 1; i<array.length; i++){
            for(int j = i; j>0; j--){
                if(array[j]<array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }//O(n^2)

}
