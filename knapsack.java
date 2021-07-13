import java.util.*;
public class knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt(),C = sc.nextInt();
        int wt[] = new int[N];
        int val[] = new int[N];
        int dp[][] = new int[N+1][C+1];
        for(int i=0;i<N;i++)
        {
            wt[i] = sc.nextInt();
            val[i] = sc.nextInt();
        } 
        for(int i=0;i<=N;i++)
        {
            for(int j=0;j<=C;j++)
            {
                if(i==0 || j==0) dp[i][j]=0;
                else
                {
                    if(wt[i-1]<=j)
                    {
                        dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-wt[i-1]]+val[i-1]);
                    }
                    else
                    {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        for(int i=0;i<=N;i++)
        {
            for(int j=0;j<=C;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
