package priorityqueue;

public class PriorityQApp {
    public static void main(String[] args) {
        PriorityQ theQ = new PriorityQ(5);
        theQ.insert(30);
        theQ.insert(50);
        theQ.insert(10);
        theQ.insert(40);
        theQ.insert(20);

        while (!theQ.isEmpty()){
            long item = theQ.remove();
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}
