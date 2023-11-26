package Bit_Manuplation;

public class LengthOfConsecutive{
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter any number ....");
        int n = 63;
        //n= sc.nextInt();
        System.out.println(consecution(n));
        System.out.println(countConsecution(n));

    }

    public static boolean consecution(int n){

        if ((n & (n<<1)) !=0) {
            return true;
        }
        else{
            return false;
        }
        
    }


    public static int countConsecution(int n){
         int count = 0;

         while (n>0) {
            n = (n & (n<<1));
            count++;
         }
         return count;
    }

}