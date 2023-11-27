/**
 *     Find a ceil of an sorterd Array and
 *     Find a floor of a Sorted Array        
 *      FindCeilFloor
 */
public class FindCeilFloor {

    public static void main(String[] args) {
        int[] arr = {19,23,56,61,72,88,92};
        int key = 118;
        System.out.println(isCeil(arr, key));
        System.out.println(isFlooor(arr, key));
    }
    
    public static int isCeil(int[] arr, int key){

        int l=0, h=arr.length-1;
        int mid=0;
        while (l<=h) {
            mid = (l+h)/2;

            if (key == arr[mid]) {
                return key;
            }
            else if (key< arr[mid]) {
                h = mid -1;
            }
            else{
                l = mid +1;
            }
        
        }
        if (l<arr.length) {
            return arr[l];
        }
        else{
            return -1;
        }
    }


    public static int isFlooor(int[] arr, int key){
        int l=0, h=arr.length-1, mid=0;

        while (l<=h) {
            mid = (l+h)/2;
            if (key == arr[mid]) {
                return arr[mid];
            }
            else if(key < arr[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
       if (h>=0) {
         return arr[h];
       }
       else{
        return -1;
       }
    }
}