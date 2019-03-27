public class MyArrays {
    public static int insert(int[] values, int currentSize, int pos, int newElement) {
        if(currentSize < values.length) {
            for(int i = currentSize - 1; i > pos;i--) {
                values[i] = values[i - 1];
            }

            values[pos] = newElement;
            currentSize++;
        }

        return currentSize;
    }

    public static int[] selectionSort(int[] a) {
        int i, j, smallest, sub, temp;

        for(i = 0; i < a.length; i++) {
            smallest = a[i];

            sub = i;

            for(j = i+1; j < a.length; j++) {
                if(a[j] < smallest) {
                    sub = j;

                    smallest = a[sub];
                }
            }

            temp = a[i];
            a[i] = a[sub];
            a[sub] = temp;
        }

        return a;
    }

    public static int[] insertionSort(int[] a) {
        int i, j, temp, key;

        for(i = 1; i < a.length; i++) {
            key = a[i];
            j = i - 1;

            while (j >= 0 && a[j] > key) {
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;

                j--;
            }
        }

        return a;
    }

    public static boolean binarySearch(int[] a, int search) {
        int mid;
        int high = a.length -1;
        int low = 0;
        boolean found = false;

        while(!found && high >= low) {
            mid = (high + low)/2;

            if(search == a[mid]) {
                found = true;
            }
            else if ( search < a[mid]) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return found;
    }

    public static int[] mergeSort(int[] a)
    {
        if (a.length <= 1) { return a; }
        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];
        // Copy the first half of a into first, the second half into second
        for (int i = 0; i < first.length; i++)
        {
            first[i] = a[i];
        }
        for (int i = 0; i < second.length; i++)
        {
            second[i] = a[first.length + i];
        }

        mergeSort(first);
        mergeSort(second);
        merge(first, second, a);

        return a;
    }

    private static int[] merge(int[] first, int[] second, int[] a) {
        int iFirst = 0, iSecond = 0, j = 0;

        while(iFirst < first.length && iSecond < second.length){
            if(first[iFirst] < second[iSecond]) {
                a[j] = first[iFirst];
                iFirst++;
            }
            else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }

        while (iFirst < first.length){
            a[j] = first[iFirst];
            iFirst++;
            j++;
        }
        while(iSecond < second.length){
            a[j] = second[iSecond];
            iSecond++;
            j++;
        }

        return a;
    }

    public static void main(String[] args) {
        int cnt = 0;
        int[][] numarray = new int[1][2];
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 1; j++)
            {
                numarray[j][i] = cnt;
                cnt++;
            }
        }
        System.out.print(cnt);
    }

}
