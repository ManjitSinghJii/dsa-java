
//Check given Array is Sorted or not


public class IsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {2,8,6,8,10,12};

        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
            
        }
        return true;
    }
}
