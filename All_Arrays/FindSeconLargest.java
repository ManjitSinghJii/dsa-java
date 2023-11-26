import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSeconLargest {

    public static int secondLargest(int[] arr){
        int max1=0, max2=0;
        if (arr[0]>arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        }
        else{
            max2 = arr[1];
            max1 = arr[0];
        }

        for(int i=2; i<arr.length; i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]> max2){
                max2 = arr[i];
            }
        }
        
        return max2;

    }

    public static void main(String[] args) {

        int [] arr ={4,8,7,55,88,22,33};
        System.out.println("Second largest element is");
        int ans=secondLargest(arr);
        System.out.println(ans);


        
        // Arrays.sort(arr);
        // System.out.println("second largesr element is " + arr[1]);
        // System.out.println(arr[0]);
        // System.out.println(arr[arr.length-1]);

        // for(int i=0; i<arr.length; i++){
        //     System.out.println( i+1 +" element is " + arr[i]);
        // }
        // System.out.println("done");

    }
    
}