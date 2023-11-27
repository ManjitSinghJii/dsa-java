
// Remove all duplicate element from a Sorted Array

public class RemoveDuplicateElement {

    static void duplicat(int[] arr){

        int[] temp = new int[arr.length];
        int j=0;
        temp[j] = arr[0];

        for(int i=1; i<arr.length; i++){
            if (temp[j] != arr[i]) {
                j++;
                temp[j] = arr[i];
            }
        }

        for(int i=0; i<=j; i++){
            System.out.print(temp[i] +" ");
        }
        System.out.println();
    }

    static void duplicateInSameArray(int[] arr){

        int j=0;
        for(int i=1; i<arr.length; i++){
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }

        for(int i=0; i<=j; i++){
            System.out.print(arr[i] + " ");
        }


    }
    public static void main(String[] args) {
        
        int[] arr = {2,2,8,11,12,12,56};
        System.out.println("Using temp arr" );

        duplicat(arr);

        System.out.println("Using in same Array ");

        duplicateInSameArray(arr);
    }
}
