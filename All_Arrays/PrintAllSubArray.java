

//Find Sub Array of an Array?

public class PrintAllSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //Scanner sc= new Scanner(System.in);

        subArray(arr);;
    }

    public static void subArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print (arr[k] +" ");
                }
                System.out.println();
            }
        }
    }
}
