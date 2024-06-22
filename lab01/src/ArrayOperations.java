/** Array Operations Class. Optional Exercise **/
public class ArrayOperations {
    /**
     * Delete the value at the given position in the argument array, shifting
     * all the subsequent elements down, and storing a 0 as the last element of
     * the array.
     */
    public static void delete(int[] values, int pos) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        // TODO (OPTIONAL): YOUR CODE HERE
        for (int i = pos; i < values.length - 1; i++) {
            values[i] = values[i + 1];
        }
        values[values.length - 1] = 0;
    }

    /**
     * Insert newInt at the given position in the argument array, shifting all
     * the subsequent elements up to make room for it. The last element in the
     * argument array is lost.
     */
    public static void insert(int[] values, int pos, int newInt) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        // TODO (OPTIONAL): YOUR CODE HERE
        for (int i = values.length - 1; i > pos ; i--) {
            values[i] = values[i - 1];
        }
        values[pos] = newInt;
    }

    /** 
     * Returns a new array consisting of the elements of A followed by the
     *  the elements of B. 
     */
    public static int[] catenate(int[] A, int[] B) {
        // TODO (OPTIONAL): YOUR CODE HERE
        int m = A.length;
        int n = B.length;
        int[] res = new int[m + n];
        for (int i = 0; i < m; i++) {
            res[i] = A[i];
        }
        for (int i = m; i < res.length; i++) {
            res[i] = B[i-m];
        }
        return res;
    }

}