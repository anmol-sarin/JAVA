public class DLL2 {
    private Node head;
    private Node tail;
    int size;
    class Node{
        private int value;
        private Node next;
        private Node prev;
        Node(int value){
            this.value = value;
        }
        Node(int value, Node next , Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertNode(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head !=null){
            head.prev = node;
        }
        head = node;
    }
    public void Display() {
        Node node = head;
        Node last = tail;
        while (node != null) {
            System.out.print(node.value + "->");
            last = node;
            node = node.next;
        }
        System.out.println("END");
//        System.out.println("Printing in reverse :");
//        while (last != null) {
//             System.out.print(last.value + "->");
//             last = last.prev;
//        }
    }
    public void insertend(int value){
        Node node = new Node(value);
        Node last  = head;
        while (last.next != null){
            last= last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
    }
    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insert_at_index(int value , int after){
        Node node = new Node(value);
        Node pointer = find(after);
        node.next = pointer.next;
        pointer.next = node;
        node.prev = pointer;
        node.next.prev = node;
        if(pointer == null){
            System.out.println("Pointer does not exist");
            return;
        }
    }
}
