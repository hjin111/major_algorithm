package A3bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B1basic1 {

    static List<List<Integer>> adjList;
    static boolean[] visited;

    public static void main(String[] args) {
        int[][] arr = {{0,1}, {0,2},{1,3},{2,3},{2,4}};

        // 초기화
        adjList = new ArrayList<>();
        visited = new boolean[5];

        for(int i = 0; i < 5; i++){
            adjList.add(new ArrayList<>()); // 빈 List 가 node 갯수 만큼 만들어진다.
        }
        for(int[] a : arr){
            adjList.get(a[0]).add(a[1]);
        }

        // bfs 로 각 나오는 각 노드 방문하고 출력
        // 0 -> 1 -> 2 -> 3 -> 4
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while(!queue.isEmpty()){
            int temp = queue.poll(); // 꺼내기
            // visited[temp] = true; // 아무 의미 없음
            System.out.println(temp);
            for(int target : adjList.get(temp)){
                // target을 queue에 add 하기 전에 true로 세팅
                if(!visited[target]){
                    queue.add(target);
                    visited[target] = true;
                }
            }
        }
    }

}
