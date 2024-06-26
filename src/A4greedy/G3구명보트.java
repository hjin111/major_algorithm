package A4greedy;

import java.util.*;

public class G3구명보트 {
    public static void main(String[] args) {

        int[] people = {70,50,80,50};
        int limit = 100;
        int max = 0;
        int size = people.length;
        int answer = 0;

        // 2명
        for(int i=0; i<people.length; i++){
           for(int j=i+1; j<people.length; j++){
               if( people[i] + people[j] <= limit){
                    answer++;
               }
           }
        }

        // 1명
        Arrays.sort(people);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            list.add(people[i]);
        }
        for (int i = 0; i < size; i++) {
            if(list.get(i) > max) {
                max = list.get(i);
                list.remove(list.get(i));
                size--;
                continue;
            }
        }

        if( max <= limit) answer++;
        System.out.println(answer);



    }
}
