package A3bfs;

import java.util.*;

public class B6게임맵 {

    // 좌표를 더해서 queue 에 담는다.
    // 상하좌우를 더해준다. => 상하좌우 좌표 add
    public static void main(String[] args) {

        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1}); // 출발지 : [0,0] 거리 : 1
        // x, y 코드 외우기
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
//        boolean[][] visited = new boolean[maps.length][maps[0].length];
//        visited[0][0] = true;
        maps[0][0] = -1;
        int answer = -1;
        while (!queue.isEmpty()) {

            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i]; // -1 : x 왼쪽으로 이동, 1 : x 오른쪽 이동
                int ny = current[1] + dy[i];
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length ){// && !visited[nx][ny]) {
                    if (maps[nx][ny] == 1) {
                        queue.add(new int[]{nx, ny, current[2] + 1});
                        maps[nx][ny] = -1; // 1인 애들만 가게 로직을 짜서 원본을 -1로 바꿔버리기
                        // visited[nx][ny] = true;
                        if(nx==maps.length-1 && ny==maps[0].length-1){
                            answer = current[2] + 1;
                            // System.out.println(answer);
                            break;
                        }
                    }
                }
            }
        }
    }
}
