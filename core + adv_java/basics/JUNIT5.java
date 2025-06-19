package basics;

class Calc {
    // one unit 
    public int divide( int num1 , int num2 ){
        return num1/num2 ; 
    }
    
    // another Unit 
    public int miltiply ( int num1 , int num2 ){
        return num1* num2 ; 
    }
}

class ReverseString{

    public String reverseString(String str ){
        char[] charArray = str.toCharArray() ; 
        int left = 0 ; 
        int right = charArray.length -1 ; 

        while ( left <= right ){
            char temp = charArray[left] ; 
            charArray[left] = charArray[right];
            charArray[right] = temp ; 

            left ++ ;
            right -- ; 
        }
        return new String(charArray) ; 
    }
}




public class JUNIT5 {
    public static void main(String[] args) {
        Calc c = new Calc() ; 
        int result = c.divide(10,5) ; 
    
        if ( result == 2 ) {
            System.out.println("test case is passes ");
        }
        else System.out.println("test case failed ") ; 

        
    }
}
