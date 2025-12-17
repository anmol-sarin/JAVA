public class LL2 {
    private Node head;
    private Node tail;
    private int size;
    public class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }
    public void insertnode(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " , ");
            temp = temp.next;
        }
        System.out.println("end");
    }
    public void insertnewhead(int value){
        Node newhead = new Node(value);
        newhead.next = head;
        head = newhead;
    }
    public void insertnewtail(int value){
        Node newtail = new Node(value);
        if(tail==null){
            insertnode(value);
        }
        tail.next = newtail;
        tail = newtail;
        size++;
    }
    public void insert(int value, int index){
        if(index == 0){
            insertnode(value);
            return;
        }
        if(index == size){
            insertnewtail(value);
            return;
        }
        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }
        Node newnode = new Node(value , temp.next);
        temp.next = newnode;
        size++;
    }
    public void deletefirst(){
        int value = head.value;
        head = head.next;
        if(head ==null){
            tail = null;
        }
        size--;
        return;
    }
    public void deletelast(){
        Node temp = head;
        for(int i=1;i<size;i++){
            temp = temp.next;
        }
        int value = tail.value;
        temp.next=null;
        tail = temp;
        System.out.println("deleted element is "+value);
        size--;
        return ;
    }
    public void deleteatindex(int index){
        Node temp = head;
        for(int i = 1; i<index;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
        return;
    }
    public void find(int value){
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == value) {
                System.out.println("item found!!!!!!!!!");
                break;
            }
            temp = temp.next;
        }
    }
}
