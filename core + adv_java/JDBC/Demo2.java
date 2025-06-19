package JDBC;

import java.sql.*;


public class Demo2 {

    private static final String url = "jdbc:mysql://localhost:3306/college_db" ; 
    private static final String user_name = "root" ; 
    private static final String password = "yash@2004" ; 


    public static void main(String[] args) {
        String query = "select * from students" ; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver") ; 
        }catch ( ClassNotFoundException e ){
            e.printStackTrace();
            System.out.println("this is class not found exception");
        }

        try{
            Connection con = DriverManager.getConnection(url, user_name, password) ; 
            Statement st = con.createStatement() ; 
            ResultSet rs = st.executeQuery(query) ; 

            while ( rs.next() ){
                String full_name = rs.getString("full_name") ; 
                System.out.println(full_name);
            }

            st.close();
            rs.close();
            con.close();

        }catch( SQLException e ){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
