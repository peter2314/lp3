import java.util.*;

class Huffman {

     public static void main(String[] args) {

        char[] ch = {'A', 'B', 'C', 'D' };
        int[] freq = {5, 9, 12, 13};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int f : freq) {
            pq.add(f);
        }

        int totalCost = 0;

        while (pq.size() > 1) {

            int a = pq.poll();
            int b = pq.poll();

            int sum = a + b;

            System.out.print("\nCombine: " + a + " + " + b + " = " + sum );

            totalCost = totalCost + sum;

            pq.add(sum);
        }

        System.out.println("\nHuffman Total Cost: " + totalCost);
     }
}