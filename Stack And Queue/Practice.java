public class Practice {
    private int[] data;
    private static final int DefaultSize = 10;
    int ptr = -1;
    Practice(){
        this(DefaultSize);
    }
    Practice(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        if(ptr == data.length -1 ){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(ptr == -1){
            return true;
        }
        return false;
    }
    public boolean Push(int item) throws Exception{
        if(isFull()){
            throw new Exception("THIS STACK IS FULL CAN'T PUSH IN IT");
        }
        ptr++;
        data[ptr] =item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("this stack is already empty");
        }
        int remainder = data[ptr];
        ptr--;
        return remainder;
    }
    public int peek(){
        return data[ptr];
    }
    public static void main(String[] args)throws Exception{
        Practice stack = new Practice(5);
        stack.Push(35);
        stack.Push(36);
        stack.Push(37);
        stack.Push(38);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
