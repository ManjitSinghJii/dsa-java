public class SpanOfArray {


// Span Of An Array..........?   max-min

    public static int spanOfArray(int[] arr){

        //int max=0,min=0;
        int max =arr[0], min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max ){
                max = arr[i];
            }

            if (arr[i]<min) {
                min = arr[i];
            }
        }

        return (max - min);
    }
    public static void main(String[] args) {
        
        int[] arr = {20,42,88,100,99,6,1};

        System.out.println(spanOfArray(arr));
    }
}
