import java.util.*;

// Find the MAximum And Pair integer in a given arrays ?

public class MaximumAndPair {


      static int andPair(int[] arr){

        int res = 0;
        for(int i=0; i<arr.length-1; i++ ){
            for(int j=i+1; j<arr.length; j++){

                if ((arr[i] & arr[j] )> res) {
                    res = arr[i] & arr[j];
                }
            }
        }
           return res; 
        }
    public static void main(String[] args) {
        
         int[] arr = {16,9,6,13};

        int ans = andPair(arr);
        //System.out.print(ans);
        System.out.println(andPair(arr));
    }

       

}
