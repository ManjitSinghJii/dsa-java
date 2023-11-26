public class FindSecondMinimum {
    
// Find Second Minimum in Array

    static int secondMinimum(int [] arr){
        int min1 = 0, min2=0;

        if (arr[0] < arr[1]) {
            min1=arr[0];
            min2 =arr[1];

        }
        else {

            min2= arr[0];
            min1 = arr[1];

        }

        for(int i=2; i<arr.length; i++){
            if (arr[i]<min1) {
                min2 = min1;
                min1= arr[i];
            }
            else if(arr[i]<min2){
                min2= arr[i];
            }
        }

        return min2;
    }
    public static void main(String[] args) {
        int[] arr = {-1,-2,99,1,0,6,7,3,88};
        System.out.println( " Second minimum is "+secondMinimum(arr)); 
    }
}
