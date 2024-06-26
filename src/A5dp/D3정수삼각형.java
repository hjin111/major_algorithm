package A5dp;

import java.util.Arrays;

public class D3정수삼각형 {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        int[][] answer = new int[triangle.length][];
        answer[0] = Arrays.copyOf(triangle[0], triangle[0].length);
//        System.out.println(Arrays.deepToString(answer));
//        for(int i = 0; i < triangle.length - 1; i++){
//            answer[i+1] = new int[triangle[i].length];
//            for(int j = 0; j < triangle[i].length; j++){
//                if(answer[i][j] + triangle[i+1][j] > answer[i+1][j]){
//                    answer[i+1][j] = answer[i][j] + triangle[i+1][j];
//                }
//                if(answer[i][j] + triangle[i+1][j+1] > answer[i+1][j+1]){
//                    answer[i+1][j+1] = answer[i][j] + triangle[i+1][j+1];
//                }
//            }
//        }



        // answer[0][0] = triangle[0][0];
        for(int i = 1; i < triangle.length; i++){
            for(int j = 0; j < triangle[i].length; j++){
                // 조건 하나 더 추가하기
                if( j == 0 ){
                    triangle[i][j] = triangle[i - 1][j] + triangle[i][j]; // 1 0 =  0 0
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i][j];
                }

            }
        }
        for(int i = 0; i < triangle.length; i++){
            for(int j = 0; j < triangle[i].length; j++){
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
}
