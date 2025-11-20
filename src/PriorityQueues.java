import java.util.PriorityQueue;

public class PriorityQueues {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueues = new PriorityQueue<Integer>();

        priorityQueues.offer(24);
        priorityQueues.offer(15);
        priorityQueues.offer(9);
        priorityQueues.offer(45);

        System.out.println(priorityQueues);

        //peek	method	get	the	element	with the highest priority.
        System.out.println(priorityQueues.peek());//9
        //peek	method	does	not	change	the	queue
        System.out.println(priorityQueues);//[9,24,	15,	45]
        //poll	method	gets the	element	with the highest priority.
        System.out.println(priorityQueues.poll());//9
        //peek	method	removes	the	highest	priority element from the	queue.
        System.out.println(priorityQueues);//[24,15,45]
    }
}
