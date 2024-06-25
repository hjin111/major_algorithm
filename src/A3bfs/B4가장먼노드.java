package A3bfs;

import java.util.*;

public class B4가장먼노드 {

    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) {
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        int n = 6;

        // 초기화
        adjList = new ArrayList<>();
        visited = new boolean[n+1];
        distance = new int[n+1];
        Arrays.fill(distance, 1);

        for(int i = 0; i < n+1; i++){
            adjList.add(new ArrayList<>()); // 빈 List 가 node 갯수 만큼 만들어진다.
        }
        for(int[] a : edge){
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }

        bfs(1, n);
        // System.out.println(Arrays.toString(distance));
        int max = Arrays.stream(distance).max().getAsInt();
        int count = (int)Arrays.stream(distance).filter(a -> a == max).count();
    }

    static void bfs(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int temp = queue.poll(); // 꺼내기
            visited[temp] = true;
            System.out.println(temp);
            for (int target : adjList.get(temp)) {
                // target을 queue에 add 하기 전에 true로 세팅
                if (!visited[target]) {
                    queue.add(target);
                    distance[target] = distance[temp] + 1;
                    visited[target] = true;
                }
            }
        }
    }
}
