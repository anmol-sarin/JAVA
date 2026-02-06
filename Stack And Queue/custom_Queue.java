public class custom_Queue {
    private int [] data;
    private static final int default_size = 10;
    int end = -1;
    public custom_Queue(){
        this(default_size);
    }
    public custom_Queue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return end == data.length-1;
    }
    public boolean isEmpty(){
        return end == -1;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[++end] = item;
        return true;
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty !!");
        }
        int removed = data[0];
        for(int i = 1;i<end;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty !!");
        }
        return data[0];
    }
    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty !!");
        }
        for (int i = 0; i<end+1;i++){
            System.out.print(data[i]+" ");
        }
    }
    public static void main(String[] args) throws Exception{
        custom_Queue cq = new custom_Queue(8);
        cq.insert(23);
        cq.insert(25);
        cq.insert(45);
        cq.insert(56);
        cq.insert(34);
        cq.insert(34);
        cq.insert(34);
        cq.display();
        System.out.println();
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        cq.display();
    }
}
