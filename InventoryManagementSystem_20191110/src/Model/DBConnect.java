package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect 
{
   private static Connection conn = null;
   private static Statement stmt = null;
   private static ResultSet results = null;
    
   public DBConnect() throws SQLException
   {
       
   }
   
   public static void createConnection()throws SQLException
   {
       conn = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryManagementSystem", "Group4", "Group4");
       System.out.println("Connection Created");
   }
   

    public ResultSet selectQuery(String query) throws SQLException   {
       try
        {
            createConnection();
            stmt = conn.createStatement();
            results = stmt.executeQuery(query);

//            results.close();
//            stmt.close();
        }
       catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
       return results;
    }
   
   public static void runQuery(String query) throws SQLException
    {
        try
        {
            createConnection();
            stmt = conn.createStatement();
            stmt.execute(query); 
            stmt.close();       
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
}

