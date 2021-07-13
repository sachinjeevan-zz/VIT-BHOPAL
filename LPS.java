import java.util.*;
public class LPS {
   public static void main(String[] args) {
       String str;
       Scanner sc = new Scanner(System.in);
       str = sc.nextLine();
       int n = str.length();
       int mat[][] = new int[n][n];
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(i==j)
               {
                   mat[i][j]=1;
               }
               else
               {
               mat[i][j] = 0;
               }
           }
       }
       int i=0,j=1,k=1;
       while(k<n)
       {
                if(str.charAt(i) ==  str.charAt(j))
            {
                mat[i][j] = mat[i+1][j-1] + 2;
            }
            else
            {
                mat[i][j] = Math.max(mat[i][j-1], mat[i+1][j]);
            }
            i++;
            j++;
            if(j==n)
            {
                k++;
                i=0;
                j=k;
            }
       }
       for(int a=0;a<n;a++)
       {
           for(int b=0;b<n;b++)
           {
               System.out.print(mat[a][b]+" ");
           }
           System.out.print("\n");
       }
       
       
   } 
}

BANANA
