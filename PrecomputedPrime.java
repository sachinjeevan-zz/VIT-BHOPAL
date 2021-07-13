import java.util.*;
public class PrecomputedPrime
{
public static void main(String args[])
    {
        int N;
        //scanf("%d",&N);
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int sqr = (int)Math.ceil(Math.sqrt(N));
        int primes[] = new int[sqr],k=0,d;
    int arr[] = new int[sqr+1];
    arr[0]=arr[1]=0;
    for(int i=2;i<=sqr;i++)
    {
        arr[i]=1;
    }
    for(int i=2;i*i<=sqr;i++)
    {
        if(arr[i]==1)
        {
            for(int j=i*i;j<=sqr;j+=i)
            {
                arr[j] = 0;
            }
        }
    }
    int sieve[] = new int[sqr],l=0;
    for(int i=0;i<=sqr;i++)
    {
        if(arr[i]==1)
        {
            sieve[l++]=i;
        }
    }

    d = sieve[0];
    int j=1;
    while(j<=l)
    {
        while(N%d==0)
        {
            primes[k++] = d;
            N = N/d;
        }
        d = sieve[j];
        j++ ;
    }
    if(N>1)
    {
        primes[k++] = N;
    }
        for(int i=0;i<k;i++)
        {
            System.out.print(primes[i] + " ");
        }
    }
}


