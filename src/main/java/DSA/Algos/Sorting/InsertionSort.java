package DSA.Algos.Sorting;

public class InsertionSort {

    public static void sort(int [] arr )
    {
        int size = arr.length;

        for(int i = 1 ; i <= size ; i++)
        {
            int current = arr[i];
            int j = i - 1 ;
            while ( j <= 0 && arr[j] > current )
            {
                arr[j + 1] = arr[j];
                j = j-1;
            }
            arr[j+1] = current;


        }
    }
    //[2,5,2,2,2,45,5,6]

}
