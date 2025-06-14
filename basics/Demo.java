package basics;

// final - variable , method , class similar to const
// final class --> stopping the inheritance 
// final variale --> stopping the change or makng it constant 
// final method --> stopping over riding



abstract class Computer {

    public void show1 (){
        System.out.println("my name is computer ");
    }

    public void show8 (){
        System.out.println("9 show");
    }

    public abstract void show () ; 
}

class Laptop extends Computer {
    public void show1 (){
        System.out.println("my name is laptop ");
    }
    public void show7 (){
        System.out.println("9 show");
    }

    public void show (){
        System.out.println("hey abstract ki vghe se hu idhr ");
    } 
}

class C extends Computer {
    public void show1 (){
        System.out.println("my name is C ");
    }
    public void show6 (){
        System.out.println("9 show");
    }
    public void show (){
        System.out.println("hey abstract ki vghe se hu idhr ");
    }
}


// final class Calculator {
//     public void show (){
//         System.out.println("in Calc show ");
//     }
//     public int add (){
//         System.out.println("in add show");
//         return 0 ; 
//     }

// }

// class AdvCalculator extends Calculator {
//     public void show (){
//         System.out.println("in AdvCalc show ");
//     }
// }


public class Demo {
    public static void main(String[] args) {
        
        // Computer obj1 = new Computer() ; 
        // obj1.show1() ; 

        // obj1 = new Laptop() ; 
        // obj1.show1() ;

        // obj1 = new C() ; 
        // obj1.show1(); 


        // final int num = 9 ; 
        // num = 10 ; 

        // upcasting
        // Computer obj1 = new Laptop() ;
        // obj1.show8();



        // //downcasting
        // Laptop obj2 = (Laptop) obj1 ; 
        // obj2.show7();


        // int num = 7 ; 
        // Integer num2 = num ; // auto boxing 
        // System.out.println(num2);

        // int num3 = num2 ; 
        // System.out.println(num3); // auto unboxing


        // String str = "12" ; 

        A obj7 = new A() {
            public void anony(){
                System.out.println("new show");
            }

            public void show (){
                System.out.println("abstract ki vghe se hu ");
                anony();
            }

        };

        obj7.show(); 
    }

}
