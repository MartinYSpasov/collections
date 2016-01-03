package Lists.Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class TheStack {

    private String[] stackArray;
    private int stackSize;
    private int topOfTheStack = -1;

    public TheStack(int size) {
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }

    public void push(String input) {
        if (topOfTheStack + 1 < stackSize) {
            topOfTheStack++;
            stackArray[topOfTheStack] = input;
        } else {
            System.out.println("The stack is full !");
        }
    }

    public String pop() {
        if (topOfTheStack >= 0) {
            stackArray[topOfTheStack] = "-1";
            return stackArray[topOfTheStack--];
        } else {
            System.out.println("Stack is empty");
            return "-1";
        }
    }

    public String peek() {
       return stackArray[topOfTheStack];
    }

    public boolean isEmpty(){
        return stackArray[0] == "-1";
    }
}
