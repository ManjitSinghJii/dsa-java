import java.util.Scanner;
// Find Fibnacci Series.?
public class FindFib {
    public static void main(String[] args) {
        FindFib f=new FindFib();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number for its Sum  : ");
        int n=sc.nextInt();
        long ans= f.fibNumber(n);
       
        System.out.println(ans);
        sc.close();
    }

    int fibNumber(int n){
        if(n==0 || n==1){
            return n;
        }
        else{

            return fibNumber(n-1) + fibNumber(n-2);
        }
         
    }
}