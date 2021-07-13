import java.util.*;
public class nqueen {
    public static boolean isSafe(int mat[][],int N,int row,int col)
    {
        for(int i=0;i<N;i++)
        {
            if(mat[i][col]==1)
            {
                return false;
            }
        }
        int a=row,b=col;
        while(a>=0 && b>=0)
        {
            if(mat[a][b]==1) return false;
            a--;
            b--;
        }
        a=row;
        b=col;
        while(a<N && b<N)
        {
            if(mat[a][b]==1) return false;
            a++;
            b++;
        }
        a=row;
        b=col;
        while(a>=0 && b<N)
        {
            if(mat[a][b]==1) return false;
            a--;
            b++;
        }
        a=row;
        b=col;
        while(a<N && b>=0)
        {
            if(mat[a][b]==1) return false;
            a++;
            b--;
        }
        return true;
    }
    public static void solve(int mat[][],int N,int row)
    {
        if(row<N)
        {
            for(int col=0;col<N;col++)
            {
                if(isSafe(mat, N, row, col))
                {
                    mat[row][col] = 1;
                    solve(mat,N,row+1);
                    mat[row][col] = 0;
                }
            }
        }
        else
        {
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                {
                    if(mat[i][j]==1)
                        System.out.print("Q ");
                    else
                        System.out.print("- ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int mat[][] = new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j] = 0;
            }
        } 
        solve(mat,N,0);
    }
}
