package stack.reverse;

import stack.StackX;

public class Reverse {
    private String input;
    private String output;

    public Reverse(String in){
        input = in;
    }

    public String doRev(){
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int j = 0; j < input.length(); j++){
            char ch = input.charAt(j);
            theStack.push(ch);
        }

        output = "";

        while (!theStack.isEmpty()){
            char ch = (char) theStack.pop();
            output = output + ch;
        }

        return output;
    }
}
