public class circular_queue {

    private int [] data;
    private static final int default_size = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public circular_queue(){
        this(default_size);
    }
    public circular_queue(int size){
        this.data = new int [size];
    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
    public static void main(String[] args){
        circular_queue cq = new circular_queue(7);
        cq.insert(23);
        cq.insert(25);
        cq.insert(26);
        cq.insert(27);
        cq.insert(28);
        cq.insert(29);
        cq.insert(30);
    }
}

