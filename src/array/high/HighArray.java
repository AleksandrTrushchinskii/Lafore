package array.high;

public class HighArray {
    private long[] arr;
    private int nElems;

    public HighArray(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) break;
        }
        if (j == nElems) {
            return false;
        } else {
            return true;
        }
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == value) break;
        }
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems - 1; k++) {
                arr[k] = arr[k + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public long removeMax() {
        if (nElems == 0) {
            return -1;
        } else {
            long maxValue = arr[0];

            for (int i = 1; i < nElems; i++) {
                if (arr[i] > maxValue) maxValue = arr[i];
            }

            delete(maxValue);
            return maxValue;
        }
    }
}
