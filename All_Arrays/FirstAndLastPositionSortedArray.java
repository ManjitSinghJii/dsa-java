public class FirstAndLastPositionSortedArray {

    public static int[] searchRange(int[] arr, int target){
        int[] res={-1,-1};

        int l=0, h=arr.length-1, mid=0;

        while (l<=h) {
            mid = (l+h)/2;

            if (arr[mid] == target) {
                res[0] = mid;
                h = mid-1;
            }

            else if (arr[mid] < target) {
                l = mid+1;
            }
            else{
                h = mid-1;
            }

        }


        l=0; 
        h=arr.length-1; 
        mid=0;

        while (l<=h) {
            mid = (l+h)/2;

            if (arr[mid] == target) {
                res[1] = mid;
                l = mid+1;
            }

            else if (arr[mid] < target) {
                l = mid+1;
            }
            else{
                h = mid-1;
            }

        }

        //  for(int i=0; i<res.length; i++){
        //     System.out.print(res[i] +" ");
        // }

        return res;

       
    }

    public static void main(String[] args) {
        int[] arr = {2,4,4,4,4,49,50,50};

        //int [] ans = searchRange(arr,4);
       // int [] ans = searchRange(arr,50);
        int [] ans = searchRange(arr,50);



        System.out.println(ans[0]+" "+ans[1]);
    }
}
