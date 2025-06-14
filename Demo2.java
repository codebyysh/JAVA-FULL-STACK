import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;



class Student {
    int age ; 
    String name ; 

    public Student ( int age , String name ){
        this.age = age ; 
        this.name = name ; 
    }

    @Override
    public String toString(){
        return "Student age os " + age + "Name of student is " + name ; 
    }
}




public class Demo2 {

    // var r = 10 ; this will give error
    public static void main(String[] args) {
        var b = 10 ;  
        var d = "yash" ; 
        // Collection nums = new Collection() {
            
        // };

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare ( Integer i , Integer j ){
                if ( i % 10 > j % 10 ) return 1 ; 
                else return -1 ; 
            }
        };

        // List<Integer> nums = new ArrayList<Integer>() ; 
        // nums.add(6) ; 
        // nums.add(7) ; 
        // nums.add(8) ; 
        // nums.add(9) ; 
        // nums.add(10) ; 

        // Collections.sort(nums , com) ; 

        // System.out.println(nums.indexOf(8));
        // System.out.println(nums.get(10));

        // Map<String , Integer> students = new HashMap<>() ; 
        // students.put("navin", 99) ; 
        
        // Collections.sort(nums);


        // List<Student> nums = new ArrayList<>() ;
        //     nums.add(new Student(21 , "Yash")) ;  



        List<Integer> nums = Arrays.asList(4,5,8,9,1,2,6,8,5,0) ; 
        // for ( int i = 0 ; i < nums.size() ; i ++ ){
        //     System.out.println(nums.get(i));
        // }

        // for ( int n : nums ){
        //     System.out.println(n);
        // }


        nums.forEach(n -> System.out.println(n));

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept( Integer n) {
        //         System.out.println(n);
        //     }
        // };


        Consumer<Integer> con = n -> System.out.println(n);


        nums.forEach(con);


        nums.forEach(n -> System.out.println(n));



        Stream<Integer> s1 = nums.stream() ;
        Stream<Integer> s2 = s1.filter(n -> n %2 == 0 ) ;
        Stream<Integer> s3 = s2.map(n -> n * 2 ) ; 


        int result = nums.stream()
                        .filter(n -> n%2 == 0)
                        .map(n -> n*2)
                        .reduce(0 , (c,e) -> (c+e)) ; 
         
        s1.forEach(n -> System.out.println(n));
        s2.forEach(n -> System.out.println(n));


        System.out.println(result);

    }

}












































// // class A implements Runnable {
// //     public void run (){
// //         for ( int i = 1 ; i <= 10 ; i ++){
// //             System.out.println("hy");
// //             try {
// //                 Thread.sleep(10);
// //             } catch (InterruptedException e) {
// //                 // TODO Auto-generated catch block
// //                 e.printStackTrace();
// //             }
// //         }
// //     }
// // }

// // class B implements Runnable {
// //     public void run (){
// //         for ( int i = 1 ; i <= 10 ; i ++){
// //             System.out.println("hello");
// //             try {
// //                 Thread.sleep(10);
// //             } catch (InterruptedException e) {
// //                 // TODO Auto-generated catch block
// //                 e.printStackTrace();
// //             }
// //         }
// //     }
// // }



// class Counter {
//     int count ; 
//     public synchronized void increment (){
//         count ++ ; 
//     }
// }

// public class Demo2 {
//     public static void main(String[] args) throws InterruptedException {
//         System.out.println("hey");

//         Counter c = new Counter () ; 

//         Runnable obj1 = () -> {
//                 for ( int i = 1 ; i <= 10 ; i ++){
//                     c.increment(); 
//                 }
//             }; 

             
//         Runnable obj2 =  () -> {
//                 for ( int i = 1 ; i <= 10 ; i ++){
//                     c.increment(); 
//                 }
//             };




//         // obj2.setPriority(Thread.MAX_PRIORITY);
//         // System.out.println(obj1.getPriority());

//         Thread t1 = new Thread(obj1) ; 
//         Thread t2 = new Thread(obj2) ; 

//         t1.start() ; 
//         t2.start() ;

//         t2.join();
//         t1.join();

//         System.out.println(c.count);

//     }
// }













































// import java.util.Scanner;

// public class Demo2 {
//     public static void main(String[] args) {
        
//         try {
//             Scanner sc = new Scanner(System.in) ; 
//             int num = sc.nextInt() ; 
        
//             int j = 18 ; 
//             int result = j / num ; 
//         }
//         catch (Exception e ){
//             System.out.println(" the system throws an exception ");
//         }
//         finally{
//             System.out.println(" the system files can now be closed ");
//             // br.close() ; 
//         }
//     }
// }

























// class A {
//     public void show () throws ClassNotFoundException {
//         Class.forName("Calc") ; 
//     }
// }


// public class Demo2 {
//     static {
//         System.out.println("class loaded");
//     }
//     public static void main(String[] args) {
//         A obj = new A() ; 
//         try {
//             obj.show();
//         }
//         catch( Exception e){

//         }
//     }
// }







// class yashException extends Exception {

//     yashException(String string) {
//         super ( string) ; 
//     }
// }




// public class Demo2 {
//     static {
//         System.out.println(" the coding begins ");
//     }
//     public static void main(String[] args) {
        
//         int i = 0 ; 
//         int j = 0 ; 

//         int nums[] = new int[10] ; 

//         try {
//             j = 18 / i ;
//             if ( j == 0 ) throw new ArithmeticException("i dont want to print zero ") ;  
//             else if ( j == 1 ) throw new yashException (" yes its my exception") ; 
//         }

//         catch ( yashException y ){
//             System.out.println("yash exceptp");
//         }

//         catch ( ArithmeticException e ) {
//             System.out.println("Ssomething went wrong . " + e );
//         }
        
//         catch ( Exception e ){
//             System.out.println("Something went wrong " + e );
//         }

//         System.out.println(j);
//         System.out.println("bye bye ");
//     }
// }












// @FunctionalInterface
// interface A {
//     int show (int i , int j) ;
// }


// // class B implements A {
// //     public void show (){
// //         System.out.println("in B show ");
// //     }
// // }


// public class Demo2 {
//     public static void main(String[] args) {

//         // lambda function is only implemented in functional interface 
//         A obj = ( i , j) ->  i+j ;

//         int result = obj.show(5 , 9) ;
//         System.out.println(result);
//     }
// }










// @FunctionalInterface
// interface A {
//     void show (int i ) ; 
// }


// // class B implements A {
// //     public void show (){
// //         System.out.println("in show");
// //     }
// // }

// public class Demo2 {
//     public static void main(String[] args) {
        
//         A obj2 = new A() {
//             public void show(int i){
//                 System.out.println(" in show ");
//             }
//         };

//         // lambda functions 
//         A obj = (int i ) -> System.out.println("in lambda show" + i );
        
//         A obj3 = i -> System.out.println(i + " this is show now ");

//         obj.show(5);
        
//     }
// }















// enum Status {
//     running , failed , pending , success ; 
// }


// public class Demo2 {
//     public static void main(String[] args) {
//         int i = 5 ; 
//         Status s = Status.success ; 
//         Status[] ss = Status.values() ; 
        


//         System.out.println(ss[0]);

//         for ( Status sss : ss ){
//             System.out.println(sss);
//         }
//     }
// }


// interface A {
//     int age = 44  ;  // they are final and static 
//     String area = "mumbai" ; 

//     public abstract void show ();
//     void config () ;
// }

// interface X {
//     void run () ; 
// }


// interface Y extends X {
//     void run2 (); 
// }

// class B implements A,X {

//     @Override
//     public void show() {
//         System.out.println("in class B show ");
//     }

//     @Override
//     public void config() {
//         System.out.println("in class B config ");
//     }

//     @Override
//     public void run() {
//         System.out.println("run run run from X ");
//     }

// }


// public class Demo2 {
//     public static void main(String[] args) {
//         A obj ; 
//         obj = new B() ; 

//         obj.config();
//         obj.show();

//         System.out.println(A.age);
//         System.out.println(A.area);
//     }
// }






// interface Computer {
//     void code() ; // behind the scene public abstract is here 
// }


// class Desktop implements Computer {
//     public void code (){
//         System.out.println("desktop coding...");
//     }
// }

// class Laptop implements Computer {
//     public void code (){
//         System.out.println("coding...");
//     }
// }


// class Developer {
//     public void code (Computer lap){
//         lap.code() ;
//         System.out.println("coding by developer...");
//     }
// }


// public class Demo2{
//     public static void main(String[] args) {
//         Computer lap = new Laptop() ; 
//         Computer desk = new Desktop() ; 

//         Developer yash = new Developer() ; 
//         yash.code(desk);

//     }
// }