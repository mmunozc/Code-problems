package labs.Codingbat;

public class squareUp{
    public int[] square_Up(int n)
    {
        int[] arr = new int[n*n];
        int pos;
        for(int i = 1; i <= n; i++)
        {
            pos = n * i - 1;
            for(int j = 1; j <= i; j++, pos--){
                arr[pos] = j;
            }
        }
        return arr;
    }
}
//O(n^2)
