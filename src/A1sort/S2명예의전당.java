package A1sort;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class S2명예의전당 {
    public static void main(String[] args) {

        int k = 3;
        int[] scores = {10, 100, 20, 150, 1, 100, 200};
        int[] result = new int[k];
        Queue<Integer> pq = new PriorityQueue<>();
        for (int score : scores) {
            pq.add(score);
        }

    }
}
