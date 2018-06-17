package array.low;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray lowArray;
        lowArray = new LowArray(100);
        int nElems = 0;
        int j;

        lowArray.set(0, 77);
        lowArray.set(1, 99);
        lowArray.set(1, 44);
        lowArray.set(2, 55);
        lowArray.set(3, 22);
        lowArray.set(4, 88);
        lowArray.set(5, 11);
        lowArray.set(6, 0);
        lowArray.set(7, 66);
        lowArray.set(8, 33);
        lowArray.set(9, 10);
        nElems = 10;

        for (j = 0; j < nElems; j++) {
            System.out.print(lowArray.get(j) + " ");
        }
        System.out.println("");

        int searchKey = 26;
        for (j = 0; j < nElems; j++) {
            if (lowArray.get(j) == searchKey) break;
        }
        if (j == nElems) {
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        searchKey = 55;
        for (j = 0; j < nElems; j++) {
            if (lowArray.get(j) == searchKey) break;
        }
        for (int k = j; k < nElems - 1; k++) {
            lowArray.set(k, lowArray.get(k + 1));
        }
        nElems--;

        for (j = 0; j < nElems; j++) {
            System.out.print(lowArray.get(j) + " ");
        }
    }
}
