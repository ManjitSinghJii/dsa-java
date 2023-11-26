public class ReverseArray {


     public static void reverseArray(int[] arr){
        
        int i=0, j=arr.length-1;
        while (i<j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9};
        System.out.println("before Swap array is ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println();
        reverseArray(arr);
        
        System.out.println("After Swap array is ");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }

   
}
