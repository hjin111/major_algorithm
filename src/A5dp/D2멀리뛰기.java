package A5dp;

public class D2멀리뛰기 {
    public static void main(String[] args) {
        // 기억하기 방식
        int n = 4; // 식 : f(n) = f(n-1) + f(n-2)
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i < n+1; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[n]);
    }
}
