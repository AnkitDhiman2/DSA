package DSA.Algos.Sorting;



class BubbleSort {

    private static < T > void  swap(T [] ar , int a , int b)
    {
        T temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }

    private static void  swap(int [] ar , int a , int b)
    {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }


    static void sort( int [] a)
    {
        int size = a.length;

        for (int i = 0 ; i < size ; i ++)
        {
            for (int j = 0 ; j < size - 1 -i ; j++)
            {
                if(a[i]> a[j])
                    swap(a,i,j);
            }
        }
    }


    static < T extends Comparable > void sort(T [] a)
    {
        int size = a.length;
        for (int i = 0 ; i < size ; i ++)
        {
            for (int j = 0 ; j < size - 1 -i ; j++)
            {
                if(a[i].compareTo(a[j]) < 0)
                    swap(a,i,j);
            }
        }

    }


}
