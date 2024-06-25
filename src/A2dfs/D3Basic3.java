package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D3Basic3 {

    static List<List<Integer>> adjList;

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3, 7}, {4, 8}, {4, 9}, {5, 10}};

        // 초기화
        adjList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]); // 단방향
            // adjList = [[], [2, 3], [4, 5], [6, 7], [8, 9], [10], [], [], [], [], []]
        }

        List<List<Integer>> answer = new ArrayList<>(); // 전체 리스트
        List<Integer> temp = new ArrayList<>(); // 부분 리스트
        temp.add(1);
        dfs(answer, temp, 1);
        System.out.println(answer);
    }

    static void dfs(List<List<Integer>> answer, List<Integer> temp, int start) {

        if(adjList.get(start).isEmpty()){
            answer.add(new ArrayList<>(temp));
            return;
        }

        for(int target :adjList.get(start)){
            temp.add(target);
            dfs(answer, temp, target);
            // 예를 들어 [1,2,4,8] 의 temp.size()는 원소의 갯수이므로 4이다. -> temp.remove(3);
            temp.remove(temp.size() - 1); // DFS 호출이 끝나면 인접 노드를 현재 경로에서 제거(백트래킹)
        }
    }
}
