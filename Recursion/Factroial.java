import java.util.Scanner;

public class Factroial {
    public static void main(String[] args) {
        Factroial f=new Factroial();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number for its Factroial  : ");
        int n=sc.nextInt();
        long ans = f.findFact(n);
        System.out.println(ans);
        sc.close();
    }

    public long findFact(int n){
        if(n==1){
            return 1;
        }
        else{
            return findFact(n-1)*n;
        }
    }
}