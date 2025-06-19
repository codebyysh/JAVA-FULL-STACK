package JDBC;
import java.sql.*;


public class Demo {


    // credentials for connection con = drivermanager.getconnection
    private static final String url = "jdbc:mysql://localhost:3306/college_db" ; 
    private static final String user_name = "root" ; 
    private static final String password = "yash@2004" ; 


    public static void main(String[] args) {


        String query = "SELECT * FROM students" ; 

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user_name, password) ; 
            Statement st = con.createStatement() ; 

            ResultSet rs = st.executeQuery(query) ; 

            int j = 2 ;
            while( rs.next() ){
                for ( int i= 1 ; i <= 4 ; i ++ ){
                    System.out.println(rs.getString(i)) ;

                }
                
            }

            rs.close();
            st.close(); 
            con.close();

        }catch ( Exception e ){
            e.printStackTrace();
            System.out.println("no sql exception here");
        }

        


        
    }
}
