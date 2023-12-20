import java.util.*;
import java.lang.*;
import java.io.*;
public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long fact=1;
        long k=s.nextInt();
        for(int i=1;i<=k;i++)
        fact=((fact%1000000007)*(i%1000000007))%1000000007;
        System.out.println(fact);
    }    
}
