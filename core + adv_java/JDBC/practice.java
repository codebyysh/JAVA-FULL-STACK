package JDBC;

class Pqr {
    Pqr(){
        System.out.println("this is constructor");
    }
    static {
        System.out.println("this is static block");
    }

    {
        System.out.println("this is instance block");
    }

}

public class practice {
    public static void main(String[] args) {
        // Pqr obj = new Pqr(); 

        // Class c = Pqr.class ;

        try {
            // for loading the class only we have 
            Class.forName("JDBC.Pqr");

        }
        catch ( ClassNotFoundException c ){
            c.printStackTrace();
            System.out.println("this is class not found exception");
        }
        catch ( Exception e ){
            e.printStackTrace();
            System.out.println("this is exception");
        }
        
        
        
    }
}
