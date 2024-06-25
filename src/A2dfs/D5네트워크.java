package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D5네트워크 {

    static List<List<Integer>> adjList;
    static int[] count;

    public static void main(String[] args) {

        int n = 3;
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};

        adjList = new ArrayList<List<Integer>>();
        for (int i = 0; i < n + 1; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(computers[i][j] == 1){
                    adjList.get(i + 1).add(j+1);
                }
            }
        }

        // System.out.println(adjList);
        count = new int[n];
        dfs(1, 0);

    }

    static void dfs(int start, int count){

    }
}
