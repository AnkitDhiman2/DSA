package DSA.Algos.Sorting;

public class InsertionSort {

    static void sort(int [] arr )
    {
        int size = arr.length - 1;

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

    static <T extends Comparable<T>> void sort(T [] ar)
    {
        int size = ar.length - 1;

        for(int i = 1 ; i <= size  ; i++)
        {
            T key = ar[i];

            int x = i - 1;

            while (x >= 0 && ar[x].compareTo(key) > 0)
            {
                ar[x+1] = ar[x];
                x--;
            }
            ar[x+1] = key;
        }
    }


}
