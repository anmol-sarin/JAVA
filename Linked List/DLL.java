public class DLL {
    private Node head;
    private Node tail;
    private int size=0;
    public class Node{
        private int value;
        private Node next;
        private Node prev;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next , Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head!= null){
            head.prev = node;
        }
        head = node;
        size++;
    }
    public void display(){
        Node temp = head;
        for(int i=0;i<size;i++){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void displayrev(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(last.value + "<-");
            last = last.prev;
        }
        System.out.println("begining");
    }
}
