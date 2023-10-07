import java.util.Scanner;
// If a given number is N then find its sum of digit?
public class SumOfDigit {
    public static void main(String[] args) {
        SumOfDigit s=new SumOfDigit();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to calculate its sum of digit ");
        int n=sc.nextInt();
        int ans =s.digitSum(n);
        System.out.println(ans);
        sc.close();
    }

    int digitSum(int n){
        if(n==0){
            return 0;
        }
        else{
            int rem=n%10;
            int que=n/10;
            return digitSum(que) + rem;
        }
    }
}