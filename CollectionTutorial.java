import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionTutorial {
    public static void main(String[] args) {
        // List list = new ArrayList();

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(2,25);
        // System.out.println(list);

        //queue
        // Queue<Integer> queue = new LinkedList<Integer>();
        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
        // System.out.println(queue);
        // queue.remove();
        // queue.offer(50);
        // System.out.println(queue);


        //priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.offer(10);
        pq.add(2);
        pq.add(3);
        pq.offer(1);
        System.out.println(pq);




    }
}
