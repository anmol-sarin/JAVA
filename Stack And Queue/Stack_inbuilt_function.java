import java.util.Stack;
public class Stack_inbuilt_function {
    public static void main(String [] args){
        Stack <Integer> stack = new Stack<>();
        stack.push(36);
        stack.push(37);
        stack.push(38);
        stack.push(39);
        stack.push(40);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
