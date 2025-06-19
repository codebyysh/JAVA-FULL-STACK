package tools;
class typecasting {
    byte b;
    int a;

    typecasting() {
        b = 12;
        a = 256;
        // b = a; // This would cause a type mismatch error
        // a = b; // This is valid, but b must be initialized first
        b = (byte) a; 

        // type conversion 
        // type casting is an explicit operation 
        // type promotion ka example de rha hu neche just 
        byte a1 = 10 ; 
        byte a2 = 30 ;

        int result1 = a1 * a2 ; 
        System.out.println(result1);

    }
}


// datatypes and variables 
class Hello{
    public static void main ( String a[] ){

        int num1 = 3 ;
        int num2 = 5 ; 
        int result = num1 * num2 ; 
        System.out.println(result);
        System.out.println(num1 + num2 );
        System.out.println("Hello World") ; 
        System.out.println(9+10);

        // float default nhi hota java me double hota hh 
        // to agr meko float use krna h to typecast krna pdenga

        float x = 5.6f ; 
        double x2 = 5.6 ; 

        int num = 1_00_00_00_000 ; 
        System.out.println(num);


        //boolean b = 1 ;   this thing nto works in java as it only accepts true and false 
        boolean b1 = true ; 


    }
}