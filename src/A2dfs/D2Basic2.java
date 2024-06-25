package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D2Basic2 {

    static List<List<Integer>> adjList; // 리스트로 안 담으면 for 문 돌려서 다
    static boolean[] visited;
    public static void main(String[] args) {

        int[][] arr = {{0,1},{0,2},{1,3},{2,3},{3,5},{2,4}};

        // 초기화
        adjList = new ArrayList<>(); // []
        for(int i = 0; i < 6; i++){
            // 새로운 빈 ArrayList 객체를 생성하고 생성된 빈 리스트를 adList에 추가 하기
            // [[],[],[],[],[],[]]
            adjList.add(new ArrayList<>()); // 빈 List 가 node 갯수 만큼 만들어진다.
        }

        // arr은 2차원 배열, 각 요소는 2개의 정수를 가진 1차원 배열이다.
        // 각 1차원 배열은 그래프의 한 엣지를 나타낸다.
        for(int[] a : arr){ // int[] a 는 arr의 각 1차원 배열을 참조한다. 1번째 반복 : a 는 {0,1} / 2번째 반복 : a 는 {0,2} / 3번째 반복 : a 는 {1,3} ....
            adjList.get(a[0]).add(a[1]);
            // 0->1 && 1->0 양방향일경우
            adjList.get(a[1]).add(a[0]);

            // 1번째 반복 {0,1}
            // a[0] 은 0이고, a[1]은 1이다.
            // adjList.get(0).add(1);은 노드 0의 리스트에 1을 추가한다.
            // adjList.get(1).add(0);은 노드 1의 리스트에 0을 추가한다.
            // adjList = [[1], [0], [], [], [], []]

            // 2번쨰 반복 {0,2}
            // a[0] 은 0이고, a[1]은 2이다.
            // adjList.get(0).add(2);은 노드 0의 리스트에 2를 추가한다.
            // adjList.get(2).add(0);은 노드 2의 리스트에 0을 추가한다.
            // adjList = [[1, 2], [0], [0], [], [], []]

            // 3번째 반복 {1,3}
            // a[0]은 1이고, a[1]은 3이다.
            // adjList.get(1).add(3);은 노드 1의 리스트에 3을 추가한다.
            // adjList.get(3).add(1);은 노드 3의 리스트에 1을 추가한다.
            // adjList = [[1, 2], [0, 3], [0], [1], [], []]

        }
        visited = new boolean[6];
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
