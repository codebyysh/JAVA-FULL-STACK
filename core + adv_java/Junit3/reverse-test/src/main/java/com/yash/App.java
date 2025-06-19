package com.yash;

/**
 * Hello world!
 */


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

    public static String reverseString(String str ){
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


class RectangleArea {
    public double areaOfRectangle ( int length , int breadth ){
        return length *breadth ; 
    }
}


class AreaOfCircle {
    public double areaOfCircle ( int radius ) {
        return 3.14 * radius *radius ; 
    }
}






public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
