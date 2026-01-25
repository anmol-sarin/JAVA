public class Dynamic_Stack extends Custom_Stack {
        public Dynamic_Stack(){
            super();
        }
        public Dynamic_Stack(int size){
            super(size);
        }

    @Override
    public boolean Push(int item) {
        if(this.isFull()){
            //double the size of the array
            int [] temp = new int[data.length * 2];
            //coping  all previous values
            for(int i = 0 ; i<data.length ; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.Push(item);
    }
    public static void main(String[] agrs) throws Exception {
            Custom_Stack stack = new Custom_Stack(3);
            stack.Push(34);
            stack.Push(36);
            stack.Push(38);
            stack.Push(37);
            stack.Push(39);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
    }
}
