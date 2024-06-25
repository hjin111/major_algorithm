package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D6타겟넘버 {

    static int answer;
    public static void main(String[] args) {

        int[] numbers = {1,1,1,1,1};
        int target = 3;

        dfs(numbers, target, 0,0);

    }
    static void dfs(int[] numbers, int  target, int length, int total){
        if(length == numbers.length && total == target){
            answer++;
        }

        dfs(numbers, target, length+1, total-numbers[length]);
    }
}
