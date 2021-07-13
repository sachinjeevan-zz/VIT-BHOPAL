import java.util.*;
public class Sundaram {
    public static void main(String[] args) {

    int N;
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int M = (N-1)/2;
    int arr[] = new int[M+1];
    for(int k=0;k<=M;k++)
    {
        arr[k] = k;
    }
    int i=1,j=1;
    int a = i+j+2*i*j;
    while(a<=M)
    {
        arr[a] = 0;
        j++;
        a = i+j+2*i*j;
        if(a>M)
        {
            i++;
            j=i;
            a = i+j+2*i*j;
        }
    }
    System.out.print("2 ");
    for(int k=0;k<=M;k++)
    {
        if(arr[k]!=0)
        {
            System.out.print(arr[k]*2+1+" ");
        }
    }
    }
}
