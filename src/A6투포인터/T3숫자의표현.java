package A6투포인터;

import java.util.Arrays;

public class T3숫자의표현 {
    public static void main(String[] args) {
        int n = 15;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        int start = 0;
        int end = 0;
        int sum = nums[0];
        int count = 0;

        while (start <= end && end < nums.length) {
            if(sum == n){
                count++;

            }else if( sum < n && end < nums.length - 1 ){
                end++;
                sum += nums[end];
            }
        }

        System.out.println(count);


    }
}
