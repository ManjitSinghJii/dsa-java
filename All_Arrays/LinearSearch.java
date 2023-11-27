

// Linear Search

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,90,100,30};
        int key = 30;
        System.out.println("At Index " + isSearch(arr, key));
    }

    static int isSearch(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
