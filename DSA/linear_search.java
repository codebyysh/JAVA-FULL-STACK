package DSA;

public class linear_search {
    public static void main(String[] args) {
        
        int arr[] = {1,4,3,2,1,3,4,5,6,2,1,3,4} ; 
        int target = 6 ; 

        int result = linearSearch(arr , target) ; 
        System.out.println(result);
    }

    public static int linearSearch(int[] arr, int target) {
        int result = -1 ; 

        for ( int i = 0 ; i < arr.length ; i ++ ){
            if ( target == arr[i] ) result = i  ; 
        }
        return result ; 
        
    }
}
