package DSA.Algos.Searching;

public class LinearSearch {


    static int search(int [] ar , int element)
    {
        for(int i = 0 ; i < ar.length ; i++)
        {
            if(ar[i] == element)
                return i;
        }

        return -1;
    }



    static < T extends Comparable<T>> int search( T [] ar , T element)
    {
        for(int i = 0 ; i < ar.length ; i++)
        {
            if(ar[i].equals(element))
                return i;
        }

        return -1;
    }


}
