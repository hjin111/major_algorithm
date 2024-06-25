//package A2dfs;
//
//import java.util.ArrayList;
//import java.util.List;
//
//// 1. 정렬 : return o1[1].compareTo(o2[1]);
//// 중간에 끊기는 경우에는 백트래킹 해서 다른 경로 가봐야 안다
//
//public class D7여행경로 {
//
//    static List<List<String>> ticketList;
//    static List<String> result;
//    public static void main(String[] args) {
//        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
//
////        ticketList = new ArrayList<>();
////        for (String[] ticket : tickets) {
////            ticketList.add(List.of(ticket));
////        }
//        result = new ArrayList<>();
//
//        System.out.println(tickets[0][0]);
//        dfs(0, tickets);
//    }
//
//    static void dfs(int start, String[][] tickets){
//        System.out.println(tickets[start][1]);
//        for(int i = 0; i < tickets.length; i++){
//            if(tickets[i][0].equals(tickets[start][1])){
//                dfs(i, tickets);
//            }
//        }
//    }
//}

package A2dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D7여행경로 {

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        System.out.println(solution(tickets));
    }

    static boolean[] visit;
    static List<String> res = new ArrayList<>();

    public static List<String> solution(String[][] tickets) {
        String[] answer = new String[tickets.length+1];
        visit = new boolean[tickets.length];
        Arrays.sort(tickets, (a,b) -> {
            return a[1].compareTo(b[1]);
        });

        System.out.println(Arrays.deepToString(tickets));
        dfs("ICN", tickets, new ArrayList<>());

        return res;
    }

    public static boolean dfs(String start, String[][] tickets, List<String> path){
        path.add(start);
        if (path.size() == tickets.length + 1) {
            res.addAll(path);
            path.clear();
            return true;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visit[i] && tickets[i][0].equals(start)) {
                visit[i] = true;
                System.out.println(Arrays.toString(visit));
                System.out.println(path);
                if (dfs(tickets[i][1], tickets, path)) {
                    return true;
                }
                visit[i] = false;
            }
        }
        path.remove(path.size() - 1);
        return false;
    }
}