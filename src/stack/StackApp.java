package stack;

public class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty()){
            System.out.print(theStack.pop());
            System.out.print(" ");
        }
        System.out.println("");
    }
}
