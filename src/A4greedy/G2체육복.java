package A4greedy;

import java.util.Arrays;

public class G2체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};

        int[] arr = new int[n+1];
        int answer = 0;

        for(int i = 0; i < reserve.length; i++){
            for( int j = 0; j < lost.length; j++){
                if(reserve[i] == 1){
                    if(reserve[i] + 1 == lost[j]){
                        arr[reserve[i]] = 1;
                        arr[lost[j]] = 1;
                    }
                } else if(reserve[i] == n){
                    if(reserve[i] - 1 == lost[j]){
                        arr[reserve[i]] = 1;
                        arr[lost[j]] = 1;
                    }
                } else if(reserve[i] + 1 == lost[j] || reserve[i] - 1 == lost[j]){
                    arr[reserve[i]] = 1;
                    arr[lost[j]] = 1;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

       for(int i = 1; i < arr.length; i++){
           if(arr[i] == 0){
               answer ++;
           }
       }

        System.out.println( n - answer);

    }
}
