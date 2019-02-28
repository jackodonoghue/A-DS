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
}
