import java.util.*;
public class multiples
{
    public static int sn(int a1,int an,int n)
    {
        return (int)(n/2.0*(a1+an));
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int a1,an,n;
            a1 = 3;
            n = m/3;
            an = a1*n;
            int s3 = sn(a1,an,n);
            a1 = 5;
            n = m/5;
            an = a1*n;
            int s5 = sn(a1,an,n);
            a1 = 15;
            n = m/15;
            an = a1*n;
            int s15 = sn(a1,an,n);
            System.out.print(s3+s5-s15);
    }
}