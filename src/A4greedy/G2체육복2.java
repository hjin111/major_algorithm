package A4greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class G2체육복2 {
    public static void main(String[] args) {

        int n = 5;
        int[] lost = {2,4}; // 정렬 따로 할 필요 없음
        int[] reserve = {1,3,5};
        Set<Integer> lostSet = new HashSet<>();
        Arrays.sort(reserve);
        for(int l : lost){
            lostSet.add(l);
        }
        for(int i = 0; i < reserve.length; i++){
            if(lostSet.contains(reserve[i])){
                lostSet.remove(reserve[i]);
                reserve[i] = -1; // 뺐다고 표시만 해둠
            }
        }

        for(int i = 0; i < reserve.length; i++){
            if(reserve[i] == -1)continue;
            if(lostSet.contains(reserve[i]-1)){
                lostSet.remove(reserve[i]-1);
            } else if (lostSet.contains(reserve[i]+1)) {
                lostSet.remove(reserve[i]+1);
            }
        }

        System.out.println(n - lostSet.size());
    }
}
