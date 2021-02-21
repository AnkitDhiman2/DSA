package DSA.Algos.Searching;

public class BinarySearch {

    static int binarySearch(int [] arr, int  element){  // iterative approach

        int l = 0 ;
        int r = arr.length-1;

        while (l <= r)
        {
            int mid = l + (r - l) / 2;

            if (arr[mid] == element)
                return mid;

            else if ( element < arr[mid])
                r = mid - 1;

            else
                l = mid + 1;

        }
        return -1;
    }

    static int binarySearchRecursive(int [] arr, int element, int left, int right){   // recursive approach

        if (left <= right) {

            int mid = left + (right - left) / 2;
            if (element == arr[mid])
                return mid;

            if (element < mid)
                return binarySearchRecursive(arr, element, left, mid - 1);

            return binarySearchRecursive(arr, element, mid + 1, right);
        }
        return -1;
    }

    static <T extends Comparable<T>> int binarySearch(T [] ar , T element)
    {
        int l = 0 ;
        int r = ar.length - 1;

        while (l <= r)
        {
            int mid  = l + (r - l) / 2;

            if (ar[mid].compareTo(element) == 0)
                return mid;
            else if (ar[mid].compareTo(element) < 0)
                    r = mid - 1;
            else
                l = mid + 1;
        }

        return -1;
    }





}
