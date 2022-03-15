import java.util.LinkedList;
import java.util.Queue;

public class SDA4REVI {
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<String>();

        queue.add("1");     // Insert `1` into the queue
        queue.add("2");     // Insert `2` into the queue
        queue.add("3");     // Insert `3` into the queue
        queue.add("4");     // Insert `4` into the queue
        System.out.println("Queue awal:" + queue);

        queue.add("5");     // Insert `5` into the queue
        queue.add("6");     // Insert `6` into the queue
        queue.add("7");     // Insert `7` into the queue
        queue.add("8");     // Insert `8` into the queue
        System.out.println("Queue Setelah Ditambah beberapa karakter:" + queue);


        System.out.println("Elemen Pertamanya yaitu " + queue.peek());

        queue.remove();     // removing the front element (`1`)
        queue.remove();     // removing the front element (`2`)
        queue.remove();     // removing the front element (`3`)
        queue.remove();     // removing the front element (`4`)


        queue.add("9");     // Insert `9` into the queue
        queue.add("10");     // Insert `10` into the queue
        System.out.println("Queue Setelah di Remove Dari Beberapa Karakter:" + queue);


        System.out.println("Elemen Pertamanya yaitu " + queue.peek());

        // Returns the total number of elements present in the queue
        System.out.println("Ukuran queue itu adalah " + queue.size());

        // check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("Queue ini kosong");
        }
        else {
            System.out.println("Queue ini tidak kosong");
        }
    }
}