import java.util.*;
public class KnightTour {
    public static boolean isSafe(int mat[][],int N,int i,int j)
    {
        if(i>=0 && j>=0 && i<N && j<N && mat[i][j]==0)
        {
            return true;
        }
        return false;
    }
    public static void solve(int mat[][],int x[],int y[],int N,int i,int j,int k)
    {
        if(k<=N*N)
        {
            for(int a=0;a<8;a++)
            {
                if(isSafe(mat,N,i+x[a],j+y[a])==true)
                {
                    mat[i+x[a]][j+y[a]] = k;
                    solve(mat,x,y,N,i+x[a],j+y[a],k+1);
                    mat[i+x[a]][j+y[a]] = 0;
                }
            }
        }
        else
        {
            for(int c=0;c<N;c++)
            {
                for(int d=0;d<N;d++)
                {
                    System.out.print(mat[c][d]+" ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int mat[][] = new int[N][N];
        int x[] = {-2,-2,-1,1,2,2,-1,1};
        int y[] = {-1,1,-2,-2,-1,1,2,2};
        mat[0][0] = 1;
        solve(mat,x,y,N,0,0,2);
    }
}
