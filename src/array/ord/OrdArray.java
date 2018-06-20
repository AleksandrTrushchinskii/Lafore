package array.ord;

public class OrdArray {
    private long[] arr;
    private int nElems;

    public OrdArray(int maxSize) {
        arr = new long[maxSize];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (arr[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (arr[curIn] > searchKey) {
                    upperBound = curIn - 1;
                } else {
                    lowerBound = curIn + 1;
                }
            }
        }
    }

    public void insert(long value) {
        if (nElems != 0) {
            int lowerBound = 0;
            int upperBound = nElems - 1;
            int curIn;

            while (true) {
                curIn = (lowerBound + upperBound) / 2;
                if (arr[curIn] == value) {
                    break;
                } else if (lowerBound > upperBound) {
                    break;
                } else {
                    if (upperBound - lowerBound == 0) {
                        if (value > arr[curIn]) {
                            curIn = curIn + 1;
                            break;
                        } else {
                            break;
                        }
                    } else if (arr[curIn] > value) {
                        upperBound = curIn - 1;
                    } else {
                        lowerBound = curIn + 1;
                    }
                }
            }

            for (int i = nElems - 1; i >= curIn; i--) {
                arr[i + 1] = arr[i];
            }

            arr[curIn] = value;
        } else {
            arr[0] = value;
        }

        nElems++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) {
            return false;
        } else {
            for (int i = j; i < nElems; i++) {
                arr[i] = arr[i + 1];
            }
        }
        nElems--;
        return true;

    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
