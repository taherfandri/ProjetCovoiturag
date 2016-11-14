package tpandroid.projetcovoiturage.Util;

import java.sql.*;
/*il me manque la base de donn�e dans le sch�ma du connexion*/
/*con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");*/
public class DBUtil {
	private static Connection con;
    public static Connection getConnection() {
        {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
            return con;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        }
    }
}
