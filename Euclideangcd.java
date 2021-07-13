import java.util.*;
public class Euclideangcd {
    public static int gcd(int A,int B)
    {
        if(A==0) return B;
        if(B==0) return A;
        return gcd(B,A%B);
    }
    public static void main(String[] args) {
        int A,B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        int C = gcd(A,B);
        System.out.print(C);
    }
}
