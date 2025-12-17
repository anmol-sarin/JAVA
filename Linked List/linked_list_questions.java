public class linked_list_questions {
    private Node head;
    private Node tail;
    public int size;
    public class Node{
        private int value;
        private Node next;
        Node(int value){
            this.value = value;
        }
        Node(int value, Node next){
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
    //Question number 1 : insertion using recursion
    public void insertRec(int value , int index){
        head = insertRec(value , index , head);
    }
    public Node insertRec(int value , int index , Node node){
        if(index == 0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next = insertRec(value, index-1, node.next );
        return node;
    }

}

