import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sc.nextInt();
        int[] arr1 = new int[2*n];
        int[] arr2 = new int[2*n];
        int[] temp = new int[n+1];
        int[] temp2 = new int[n+1];
        int[] dp = new int[n+1];
        for (int i = 0; i < 2*n; i++){
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < 2*n; i++) {
            arr2[i] = sc.nextInt();
        }
        
        for (int i = 1; i <= n; i++) {
            temp[i] = arr2[i-1] - arr1[i-1];
        }
        
        for (int i = 1; i <= n; i++) {
            temp2[i] = arr2[i+n-1] - arr1[i+n-1];
        }
        // System.out.println(Math.abs(sum) + 1);
        
        


    }

    public static int solve(int[] dp, int[] arr1, int[] arr2, int n){
        if(n == 0) return 0;
        if(n == 1) dp[1] = arr1[1] + arr2[1];
        for(int i = 2; i <= n; i++){
            dp[i] += Math.max(1, 2);
        }
        return 0;
    }
    
}
