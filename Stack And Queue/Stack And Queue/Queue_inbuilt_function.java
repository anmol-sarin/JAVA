import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
public class Queue_inbuilt_function {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(54);
        queue.add(4);
        queue.add(5);
        queue.add(20);
        queue.add(2);
//        System.out.println(queue.remove());
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(34);
        deque.add(44);
        deque.add(54);
        deque.addFirst(24);
        deque.addFirst(64);
        deque.addFirst(74);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        
    }
}
