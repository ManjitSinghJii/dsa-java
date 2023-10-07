import java.util.Scanner;
// Given Number Print all number from 1 to N in increasing order?

public class PrintAllNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number for its Print Nmber : ");
        int n=sc.nextInt();
        PrintAllNumber p=new PrintAllNumber();
        p.printNumber(n);
        sc.close();

    }

    public void printNumber(int n){

        if(n==1){
            System.out.print(n+" ");
            return;
           
        }
        else{
            printNumber(n-1);
            System.out.print(n+" ");
        }
    }
}
