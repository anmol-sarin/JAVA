public class LL {
    private node head;
    private node tail;
    private int size;
    private class node{
        private int value;
        private node next;
        public node(int value){
            this.value = value;
        }
        public node(int value, node next){
            this.value = value;
            this.next = next;
        }
    }
    public LL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        node node = new node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
    }
    public void insertLast(int value){
        node node = new node(value);
        tail.next = node;
        tail = node;

    }
    public void display(){
        node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }
}
