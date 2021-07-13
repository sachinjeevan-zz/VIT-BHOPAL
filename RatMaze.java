import java.util.*;
public class RatMaze {
    public static boolean flag = false;
    public static boolean isSafe(int mat[][],int M,int N,int i,int j)
    {
        if(i<M && j<N && mat[i][j]==1)
        {
            return true;
        }
        return false;
    }
    public static void solve(int mat[][],int M,int N,int i,int j)
    {
        if(i==M-1 && j==N-1)
        {
            flag = true;
            System.out.print("Path exist");
            return;
        }
        else
        {
            if(flag==false && isSafe(mat,M,N,i+1,j)==true)
            {
                solve(mat,M,N,i+1,j);
            }
            if(flag==false && isSafe(mat,M,N,i,j+1)==true)
            {
                solve(mat,M,N,i,j+1);
            }
        }
       
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(), N = sc.nextInt();
        int mat[][] = new int[M][N];
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        solve(mat,M,N,0,0);
        if(flag==false)
        {
            System.out.print("Path does not exist");
        }

    }
}
