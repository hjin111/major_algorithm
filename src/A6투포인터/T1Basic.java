package A6투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class T1Basic {
    public static void main(String[] args) {

//        // 아래 배열에서 target이 될 수 있는 두 수의 조합 값을 모두 찾아라
//        int[] nums = {7,8,9,2,4,5,1,3,6};
//        int target = 10;
//
//        // 2중 for문 구현 : n^2
//        List<int[]> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if( nums[i] + nums[j] == target) {
//                    list.add(new int[]{nums[i],nums[j]});
//                }
//            }
//        }
//
//        Arrays.sort(nums);
//        // 1,2,3,4,5,6,7,8,9
//        int start = 0;
//        int end = nums.length - 1;
//        list = new ArrayList<>();
//        while(start < end){
//            if(nums[start] + nums[end] == target) {
//                list.add(new int[]{start,end});
//                start++;
//            }else if (nums[start] + nums[end] > target){
//                end--;
//            }else {
//                start++;
//            }
//        }
//
//        for( int[] l : list ){
//            System.out.println(Arrays.toString(l));
//        }
        int[] nums = {7,8,9,2,4,5,1,3,6};
        int target = 10;
        // 구간의 합이 target이 되는 배열의 index의 처음과 끝을 리스트에 담기
        int start = 0;
        int end = 0;
        int sum = nums[0];
        List<int[]> list = new ArrayList<>();
        while( start <= end && end < nums.length ){
            if(sum == target){
                list.add(new int[]{start, end});
                sum -= nums[start];
                start++;
            }else if(sum < target && end < nums.length - 1){
                end++;
                sum += nums[end];
            }else {
                sum -= nums[start];
                start++;
            }
        }

    }
}
