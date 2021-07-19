
package Electricity;

import java.sql.*;

public class conn{
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
             c =DriverManager.getConnection("jdbc:mysql:///Electricity_Bill","root","");

//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","niks@1913");
            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}