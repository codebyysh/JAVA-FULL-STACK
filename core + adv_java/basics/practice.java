package basics;

abstract class Car {
    public abstract void drive () ;

    public void music (){
        System.out.println("play music");
    }
}

class WagonR extends Car {
    public void drive (){
        System.out.println("Driving...");
    }
}



class A {
    public void show () {
        System.out.println("A show");
    }

    public void show1 (){
        System.out.println("A1 show ");
    }

    class C {
        public void config (){
            System.out.println("config ... ");
        }
    }

    static class D {
        public void Dclass (){
            System.out.println("in D show ");
        }
    }
}

class B extends A {
    public void show3 (){
        System.out.println("B show ");
    }
}


public class practice {
    public static void main(String[] args) {
        
        A obj = new A() ; 
        obj.show();

        // upcasting 
        obj = new B() ; 
        obj.show1();
        obj.show();

        //  Downcasting
        B obj2 = (B) obj ; 
        obj2.show3() ; 
        obj2.show1() ;
        obj2.show();



        int num = 8 ; 
        Integer num1 =  num ; // autoboxing

        int num3 = num1 ; // auto unboxing 

        // final 
        /*
         * final -> method --- > prevent from over riding 
         * final -> variable --- > making it constant 
         * final -> class --- > stopping the inheritance 
         */



         String str = "12" ; 
         int num4 = Integer.parseInt(str) ; 
         System.out.println(num4);

        Car obj5 = new WagonR() ; 
        obj5.drive();
        obj5.music();

        A.C obj0 = obj.new C() ; 
        obj0.config();

        A.D objD = new A.D(); // ✅ no need for A's object
        objD.Dclass();        // ✅ allowed, instance method on instance
        
    }
}
