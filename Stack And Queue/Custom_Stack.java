public class Custom_Stack {
    protected int [] data;
    private static final int Default_size = 10;
    public Custom_Stack(){
        this(Default_size);
    }
    public Custom_Stack(int size){
        this.data = new int[size];
    }
    int ptr = -1;
    public boolean Push(int item){
        if(isFull()){
//            System.out.println('your stack is full');
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    boolean isFull(){
        return ptr == data.length - 1; //pointer is at last index
    }
    private boolean isEmpty(){
        return ptr == -1;  //
    }
    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty!!");
        }
        int removed  = data[ptr];
        ptr--;
        return removed;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty thatswhy there is no peek");
        }
        return data[ptr];
    }
    public static void main(String[] args) throws Exception {
        Custom_Stack stack = new Custom_Stack(15);
        stack.Push(34);
        stack.Push(35);
        stack.Push(36);
        stack.Push(37);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.peek());
    }
}
