package JDBC;

import java.sql.*;


/*
 * import the package
 * load the register 
 * create a connection
 * create a statement 
 * execute the query
 * process the results 
 * close the connection
 */

public class DemoClass {
    public static void main(String[] args) {

        int user_id = 6 ; 
        String user_name = "yash jangid" ; 

        String url = "jdbc:mysql://localhost:3306/college_db";
        String uname = "root";
        String pass = "yash@2004";
        String query = "SELECT full_name, email, department, cgpa FROM students WHERE cgpa > 8.0";
        String query1 = "SELECT * FROM students" ; 
        String query2 = "INSERT INTO STUDENT VALUES (?,?)" ; 


        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection con = DriverManager.getConnection(url, uname, pass);
            // PreparedStatement st = con.prepareStatement(query2);

            // st.setInt(1, user_id);
            // st.setString(2, user_name);

            // // ResultSet rs = st.executeQuery(query2);
            // // ResultSetMetaData rsmd = rs.getMetaData() ; 
            // int count = st.executeUpdate() ; 
            // // int columnCount = rsmd.getColumnCount() ; 

            // // while (rs.next()) {
            // //     for ( int i = 1 ; i <= columnCount ; i ++){

            // //         String columnName = rsmd.getColumnName(i) ; 
            // //         String columnValue = rs.getString(i) ; 
            // //         System.out.println(columnName + ": " + columnValue);

            // //     }
            // //     System.out.println() ;
                
            // // }

            // st.close();
            // con.close();








            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);

            // Part 1: INSERT into table
            PreparedStatement insertStmt = con.prepareStatement("INSERT INTO students(id, full_name) VALUES (?,?)");
            insertStmt.setInt(1, user_id);
            insertStmt.setString(2, user_name);

            int count = insertStmt.executeUpdate();
            System.out.println(count + " row(s) inserted.");

            // Part 2: SELECT and display all
            Statement selectStmt = con.createStatement();
            ResultSet rs = selectStmt.executeQuery("SELECT * FROM students");

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = rsmd.getColumnName(i);
                    String columnValue = rs.getString(i);
                    System.out.print(columnName + ": " + columnValue + "  ");
                }
                System.out.println();
            }

            // Clean up
            insertStmt.close();
            selectStmt.close();
            con.close();





        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}