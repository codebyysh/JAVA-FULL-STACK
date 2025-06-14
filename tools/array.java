package tools;
public class array {
    public static void main(String[] args) {
        // System.out.println("array bnana seekh rhe h ");

        // // static allocation 
        // int arr[] = {1,2,3,4,5,6,7,8,9,0} ; 
        
        int arr3[][] = new int[8][8] ;

        // // dyanmic allocation
        // int arr2[] = new int[10] ; 

        // for ( int i = 0 ; i < arr.length ; i ++ ){
        //     System.out.println("the elements at " + i + "are" + arr[i] ) ;
        // }

        for (int i = 0 ; i < arr3.length ; i++ ){
            for ( int j = 0 ; j < arr3.length ; j++ ){
                arr3[i][j] = (int)(Math.random() * 100); 
            }
        }

        for (int i = 0 ; i < arr3.length ; i++ ){
            for ( int j = 0 ; j < arr3.length ; j++ ){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        
        for ( int i = 0 ; i < 10 ; i ++ ){
            for ( int j = i ; j < 10  ; j ++ ){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();



        // System.out.println(" the size of the arr is " + arr3.length);
    }
}


