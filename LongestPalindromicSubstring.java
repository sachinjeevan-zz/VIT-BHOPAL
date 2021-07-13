import java.util.*;
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int n = str.length();
       int dp[][] = new int[n][n];
       for(int i=0;i<n;i++)
       {
           dp[i][i] = 1;
       }
       for(int i=0;i<n-1;i++)
       {
           if(str.charAt(i)==str.charAt(i+1))
           {
               dp[i][i+1] = 2;
           }
           else
           {
               dp[i][i+1] = 0;
           }
       }
       int i=0,j=2,k=2;
       int maxi = 1;
       int a=0,b=0;
       while(k<n)
       {
            if(str.charAt(i)==str.charAt(j))
            {
                if(dp[i+1][j-1]!=0)
                {
                    dp[i][j] = dp[i+1][j-1]+2;
                    if(dp[i][j]>maxi)
                    {
                        maxi = dp[i][j];
                        a = i;
                        b=j;
                    }
                }
                else
                {
                    dp[i][j] = 0;
                }
            }
            i++;
            j++;
            if(j>=n)
            {
                i=0;
                k++;
                j = k;
            }
    }
    System.out.println(maxi);
    for(int c=a;c<=b;c++)
    {
        System.out.print(str.charAt(c));
    }

    }
}
