package tools;
class mobile {
    String brand ; 
    int price ; 
    static String name ; 
    // the static variable is been shared by all the objects 


    static {
        name = "APPLE" ; 
    }

    public void show () {
        System.out.println( brand + price + name );
    }

    public mobile (){
        brand = "" ; 
        price = 200 ; 
        System.out.println("i am in contructor ");

        AdvCalc obj = new AdvCalc() ; 
        int totalPrice = obj.div(price, price) ; 
        System.out.println(totalPrice);

    }
}



public class strings {
    public static void main(String[] args) {
        String name = new String("yash jangid") ; 
        System.out.println("hello" + name);
        System.out.println(name.charAt(8));
        System.out.println(name.length());

        String name2 = "yash" ; 
        System.out.println(name2);

        String s1 = "Yash" ; 
        String s2 = "Yash" ; 
        System.out.println(s1 == s2);


        StringBuffer sb = new StringBuffer("yash") ; 
        sb.append(" jangid") ;

        sb.append(s2) ; 
        sb.delete(7, 9) ;
        // this is mutable 
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(sb.substring(4));



        StringBuilder sbb = new StringBuilder() ; 


        // string buffer is thread safe but string builder is not thread safe 


        // now what is static mean in the java program 


        mobile mb = new mobile() ; 
        System.out.println(mb.name);
        System.out.println(mobile.name);

    }
}
