import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class SubsetSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean dp[][] = new boolean[n][k+1];
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=k;j++)
            {
                if(j==0) dp[i][j]=true;
                else if(i==0)
                {
                    if(j==arr[i]) dp[i][j]=true;
                    else dp[i][j]=false;
                } 
                else
                {
                    if(arr[i]>j)
                    {
                        dp[i][j] = dp[i-1][j];
                    }
                    else
                    {
                        dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i]];
                    }
                }
                if(j==k && dp[i][j]==true)
                {
                    flag= true;
                    break;
                } 
            }
        }
        if(flag)
        {
            System.out.print("Subset exist with the given sum");
        }
        else
        {
            System.out.print("Subset does not exist with the given sum");
        }
    }
}
