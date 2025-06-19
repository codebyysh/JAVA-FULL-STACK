package tools;



// camel casing 
// naming convection 
// classes and interfaces capital letters first char 
// constant - PIE full caps 
// variable and methods -- marks , show ()
// show_my_code wrong naming 
// showMyName right naming

import java.util.ArrayList;

// age , DATA , Human() , 


public class Calc {
    public int add ( int n1 , int n2 ){
        return n1 + n2 ;   
    }

    public int sub ( int n1 , int n2 ){
        return n1 - n2  ; 
    }
}


// over riding the functions in the child class 

class P {
    public void show (){
        System.out.println("P show");
    }
}

class Q extends P {
    public void show (){
        System.out.println("Q show");
    }
}







class A extends Object {
    public A() {
        super() ; 
        System.out.println("hey this is A ");
    }

    public A( int n ){
        super() ;
        System.out.println(" this is A Int ");
    }
}



class B extends A {
    public B (){
        super() ; 
        System.out.println("hey this is B ");
    }

    public B (int n){
        this() ; 
        System.out.println("hey this is int B ");
    }
    
}

class C extends A {
    public C (){
        super() ; 
        System.out.println("hey this is C ");
    }

    public C ( int n ) {
        this() ; 
        System.out.println("this is C int ");
    }
}



class Human extends Object {
    private
        String name ;
        int age ; 

    public
        void getter (){
            System.out.println("the name of the person is " + name );
            System.out.println("the age of the person is " + age );
        }

        void setter ( String name ){
            this.name = name ; 
        }

        void setage ( int age ){
            this.age = age ; 
        }



        Human (){
            name = "yash jangid naam hh sbke " ; 
            age = 100 ; 
            System.out.println("hey i am a Constructor");
            System.out.println(" these are the default values ");
        }

        Human( int age , String name ){
            System.out.println(" the name and the age of the person are " + age + name );
        }

        
}


public class OOPS {
    public static void main(String[] args) {
        
        // Human obj = new Human() ; 
        // Human obj2 = new Human( 100 , "yash") ; 
        // // obj.setage(10) ; 
        // // obj.setter("yash") ;

        // // obj.getter();

        // B obj = new B() ;
        // A obj = new A() ; 

        // B b = new B() ; 
        // A a = b ; 

        // A obj = new B() ; 
        // B obj = new A() ;

        
        // A obj ; 
        // new A().getClass() ; // anonyomous object 


        // AdvCalc obj = new AdvCalc() ; 
        // int division = obj.div(5,2) ; 
        // System.out.println(division);

        ArrayList list = new ArrayList() ; 



    }
}

