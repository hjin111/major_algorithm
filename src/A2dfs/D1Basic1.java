package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D1Basic1 {

    // [[1,2],[3],[3,4]] -> 0번째 노드가 갈 수 있는 곳은 0번째 리스트에 담고 1번째 노드가 갈 수 있는 곳은 1번째 리스트에 담자
    static List<List<Integer>> adjList; // 리스트로 안 담으면 for 문 돌려서 다
    static boolean[] visited;
    public static void main(String[] args) {

        // 방문할 수 있는 정점이 여러개인 경우 정점 번호가 작은 것을 먼저 방문하는
        // dfs 알고리즘 형식의 방문 순서를 출력하라
        // 0,1,3,2,4
        int[][] arr = {{0,1}, {0,2},{1,3},{2,3},{2,4}};
        adjList = new ArrayList<>(); // 초기화
        for(int i = 0; i < 5; i++){
            adjList.add(new ArrayList<>()); // 빈 List 가 node 갯수 만큼 만들어진다.
        }
        for(int[] a : arr){
            adjList.get(a[0]).add(a[1]);
            // 0->1 && 1->0 양방향일경우
            // adjList.get(a[1]).add(a[0]);
        }
        visited = new boolean[5];
        dfs(0);
    }

    static void dfs(int start) { // 만약 start 가 0이면
        System.out.println(start); // 0출력
        visited[start] = true; // 0번째 방문했다는걸 표시
        for(int target :adjList.get(start)){ // 0에 갈 수 있는 노드가 1이랑 2임으로 먼저 1을 target 에다 담아주기
            if(visited[target] == false){
                dfs(target); // dfs(1)
            }
        }
    }
}
