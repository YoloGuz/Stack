package StackTest;

public class MainStack {
    public static void main(String [] args){
        Stack miStack = new Stack();
        miStack.push("Z");
        miStack.push("Y");
        miStack.push("X");
        System.out.println("Stack size: " + miStack.getQuantity());
        miStack.printStack();
        System.out.println("----------");
        miStack.pop();
        System.out.println("Stack size: " + miStack.getQuantity());
        miStack.printStack();
        System.out.println("----------");
        miStack.pop();
        System.out.println("Stack size: " + miStack.getQuantity());
        miStack.printStack();
        System.out.println("----------");
        miStack.pop();
        System.out.println("Stack size: " + miStack.getQuantity());
        miStack.printStack();
        System.out.println("----------");
        miStack.pop();
        miStack.printStack();
    }
}
