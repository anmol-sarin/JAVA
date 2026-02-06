import java.util.Stack;
public class queue_using_stack {
    public void main(String[] args){
        QueueUsingStack qus = new QueueUsingStack();
        qus.insert(23);
        qus.insert(24);
        qus.insert(25);
        qus.insert(26);

        qus.remove();


    }
    class QueueUsingStack{
        private Stack<Integer> first;
        private Stack<Integer> second;
        public QueueUsingStack(){
            first = new Stack<>();
            second = new Stack<>();
        }
        public void insert(int item){
            first.push(item);
        }
        public int remove(){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            int removed = second.pop();
            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return removed;
        }
        public boolean isEmpty(){
            return first.isEmpty();
        }
        public int peek () throws Exception{
            while(!first.isEmpty()){
                first.push(second.pop());
            }
            int peeked = second.peek();
            while(!second.isEmpty()){
                first.push(second.pop());
            }
            return peeked;
        }
    }
}
