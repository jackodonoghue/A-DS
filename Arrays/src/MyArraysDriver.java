public class MyArraysDriver {
    private static int currentSize = 0;

    public static void main(String[] args) {
        int[] values = new int[]{6,7,4,7,2,6};
        String st = "";
/*

        //Run 1: Expected Outcome = 1

        currentSize = MyArrays.insert(values, currentSize, 4, 5);

        System.out.println(currentSize);

        //Run 2: Expected Outcome = 2

        currentSize = MyArrays.insert(values, currentSize, 2, 6);

        System.out.println(currentSize);

        //Run 3: Expected Outcome = 3

        currentSize = MyArrays.insert(values, currentSize, 1, 7);

        System.out.println(currentSize);

        //Run 4: Expected Outcome = 4

        currentSize = MyArrays.insert(values, currentSize, 0, 8);

        System.out.println(currentSize);

        //Run 5: Expected Outcome = 5

        currentSize = MyArrays.insert(values, currentSize, 3, 9);


        for(int i = 0; i < values.length; i++) {
            st += ", " + values[i];
        }

        System.out.println(currentSize + " " + st);*/

        int[] newArr = MyArrays.mergeSort(values);

        for(int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

        if(MyArrays.binarySearch(values, 5))
             System.out.print("\n\n\n YESSSS");
        else
            System.out.print("\n\n\nNOOOO");


    }
}
