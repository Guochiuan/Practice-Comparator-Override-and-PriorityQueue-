import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        test01();
        System.out.println();
        test02();
    }

    public static void test01() {
        PriorityQueue pq = new PriorityQueue();
        pq.offer("c");
        pq.offer("a");
        pq.offer("b");
        String s;
        int cc =0;
        while (!(s = ""+ pq.poll()).equals("null")) {

            System.out.print(s + ", ");
        }
    }

    public static void test02() {
        Comparator c = new Comparator() {

            
            @Override
            public int compare(Object a1, Object b1) {
                String a = a1.toString();
                String b = b1.toString();
                return a.compareTo(b) * -1; // Using descending order
            }
        };
       PriorityQueue pq = new PriorityQueue(3, c);
      //  PriorityQueue pq = new PriorityQueue(3);
        pq.offer("c");
        pq.offer("a");
        pq.offer("b");
        String s;
        while (!(s = ""+ pq.poll()).equals("null")) { // default is ascending order.
            System.out.print(s + ", ");
        }

    }

}