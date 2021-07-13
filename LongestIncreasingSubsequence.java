import java.util.*;
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int dp[] = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
            dp[i]=1;
        }
        // 10 22 9 33 21 50 41 60 80
        int i=1,j=0,maxi=1;
        while(i<N)
        {
            j=0;
            while(j<i)
            {
                if(arr[j]<=arr[i])
                {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    if(dp[i]>maxi)
                        maxi = dp[i];
                }
                j++;
            }
            i++;
        }

        System.out.print(maxi);

    }
}
