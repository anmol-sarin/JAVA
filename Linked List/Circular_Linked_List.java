public class CLL {
    private Node head;
    private Node tail;
    public class Node{
        private int value;
        private Node next;
        Node(int value){
            this.value = value;
        }
        Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    public CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insertion(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display(){
        Node node = head;
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        do{
            System.out.print(node.value + "->");
            node = node.next;
        }while(node != head);
        System.out.print("HEAD");
    }
    public void delete(int value){
        Node node = head ;
        while(node.next.value != value){
            node = node.next;
        }
        node.next = node.next.next;

    }
}
