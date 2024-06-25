package A3bfs;

import java.util.LinkedList;
import java.util.Queue;

public class B5이동BFS {

    static boolean[] visited;

    public static void main(String[] args) {
        int start = 5;
        int target = 17;
        visited = new boolean[target+1];

        // -1,+1, 현재 숫자 * 2
        // 가장 빠른 횟수
        // -1 *2 *2 +1 => 4
        dfs(start, target);
    }

    static void dfs(int start, int target) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while(!queue.isEmpty()) {
            int k = queue.poll();
            if(!visited[start]){
                k -= 1;
            }
        }
    }
}
