package array.low;

public class LowArray {

    private long[] arr;

    public LowArray(int size){
        arr = new long[size];
    }

    public void set(int index, long value){
        arr[index] = value;
    }

    public long get(int index){
        return arr[index];
    }


}
