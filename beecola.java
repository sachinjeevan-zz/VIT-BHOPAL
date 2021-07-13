import java.util.*;
public class beecola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int hash[] = new int[100001];
        for(int i=0;i<=100000;i++)
        {
            hash[i]=0;
        }
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
            hash[arr[i]]++;
        }
        for(int i=1;i<=100000;i++)
        {
            hash[i] = hash[i-1] + hash[i];
        }
        int q = sc.nextInt(),x;
        for(int i=0;i<q;i++)
        {
            x = sc.nextInt();
            System.out.println(hash[x]);
        }
    }
}
