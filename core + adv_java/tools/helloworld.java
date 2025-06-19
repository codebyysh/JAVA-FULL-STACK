package tools;
import java.util.Scanner;

class calculator {
    int num1 = 2 ; 
    int num2 = 3 ; 
    public int add (){
        int result = num1 + num2 ; 
        System.out.println("the result is " + result);
        return 0 ; 
    }
}


class pen {
    private int price ; 

    public void getprice (){
        System.out.println("the price of the pen is " + price);
    }
}



public class helloworld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ; 
        System.out.println("tell me your name ");

        String name = sc.nextLine() ; 
        System.out.println("the given name is " + name );

        System.out.println("hello world");

        int x = 8 ; 
        int y = 9 ; 
        int z = 10 ; 

        if ( x > y && x > z ) {
            System.out.println("sbse bda number x hh bhai");
        }
        else if ( y >x && y > z  ){
            System.out.println("sbse bda number y h bhai ");
        }
        else {
            System.out.println("sbse bda number aayega z ");
        }


        int i = 0 ; 
        while ( i < 4 ){
            System.out.println("hello bhai " + i );
            i++ ; 
        }
        System.out.println("loop khtm ho gya h ");


        for ( int j= 0 ; j < 4 ; j ++ ){
            System.out.println("hello");
        }




        calculator calc = new calculator() ; 
        calc.add() ; 

        pen p = new pen() ; 
        p.getprice() ; 

    }
}
