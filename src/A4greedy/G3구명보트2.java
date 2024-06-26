package A4greedy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class G3구명보트2 {
    public static void main(String[] args) {

        int[] people = {70,50,80,50};
        int limit = 100;
        Arrays.sort(people);
        int endIndex = people.length - 1;
        int startIndex = 0;
        int answer = 0;
        while(startIndex < endIndex){
            answer++;
            endIndex--;
            if(people[endIndex] + people[startIndex] <= limit){
                startIndex++;
            }
        }


        // Deque 사용
//        Deque<Integer> deque = new ArrayDeque<>();
//        for(int p : people){
//            deque.add(p);
//        }
//        int answer = 0;
//        while(!deque.isEmpty()){
//            int last = deque.pollLast();
//            answer++;
//            if(!deque.isEmpty() && last + deque.peekFirst() <= limit){
//                deque.pollFirst();
//            }
//        }
//        System.out.println(answer);
    }
}
