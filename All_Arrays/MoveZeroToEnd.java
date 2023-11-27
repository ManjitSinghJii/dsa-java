public class MoveZeroToEnd {


    public static void moveZero(int[] arr){
        int size=arr.length;

        if (size == 0 || size ==1) {
            return;
        }

        int nz=0,z=0;

        while (nz<size) {
            if (arr[nz] !=0) {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }




        //       while (z<size) {
        //     if (arr[z] == 0) {
        //         int temp = arr[z];
        //         arr[z] = arr[nz];
        //         arr[nz] = temp;
        //         nz++;
        //         z++;
        //     }
        //     else{
        //         z++;
        //     }
        // }



        for(int i=0; i<size; i++){
            System.out.print(arr[i] +" ");

        }


    }
    public static void main(String[] args) {
        
        int[] arr={0,2,60,0,8,4,3,0,10};

        moveZero(arr);
    }
}
