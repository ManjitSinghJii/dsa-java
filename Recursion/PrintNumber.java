import java.util.Scanner;

// Write a Recursion Code For Print number of sum?

public class PrintNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number for its Sum  : ");
        int n=sc.nextInt();
        PrintNumber p= new PrintNumber();
        int sums=p.numberSum(n);
        System.out.println(sums);
        sc.close();
    }

    int numberSum(int n){
        if(n==1){
            //System.out.println(n);
            return 1;
        }
        else {
           return numberSum(n-1) + n;
        }
        
    }
    
}
