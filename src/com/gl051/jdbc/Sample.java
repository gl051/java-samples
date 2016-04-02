package com.gl051.jdbc;

import com.gl051.ISample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Sample implements ISample {

	@Override
	public String getDescription() {
		return "Connecting and querying a database via JDBC driver";
	}

	@Override
	public void run() {
		testDirectApis();
		testDatabaseContainer();
	}
	
	private static void testDirectApis() {
        String url = "jdbc:postgresql://hit-gianluca/gl051";
        
        // Set properties you need
        Properties props = new Properties();
        props.setProperty("user","gianluca");
        props.setProperty("password","moore4040");
        
        // Establish a connection using the try-with-resource to manage automatically 
        // the close of the connection (Java 7 and up)
        try (Connection conn = DriverManager.getConnection(url, props)) {
            System.out.println("Connected to database.");

            // Create Statement
            Statement stm = conn.createStatement();
            
            // Execute a query
            ResultSet res = stm.executeQuery("SELECT * from pandi.tb01");            
            
            // Process the result set
            String colName, colZipCode;
            while (res.next()){
                colName = res.getString(2);
                colZipCode = res.getString(3);
                System.out.println(colName + " - ZIP CODE: " + colZipCode);
            }
                        
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        // The close of the connection is not required anymore
    }
    
  
    private static void testDatabaseContainer(){
        
        String url = "jdbc:postgresql://hit-gianluca/gl051";
        
        // Set all the properties you need
        Properties props = new Properties();
        props.setProperty("user","gianluca");
        props.setProperty("password","moore4040");
        
        DatabaseContainer dbcontainer = new DatabaseContainer(url, props);
        int iVal = dbcontainer.ExecuteUpdate("delete from pandi.tb01 where id > 10");
        System.out.println("Deleted records:  " + iVal);
        iVal = dbcontainer.ExecuteUpdate("insert into pandi.tb01 values(11, 'taylor', '21007')");
        System.out.println("Inserted records:  " + iVal);
        
        dbcontainer.Disconnect();
        try (ResultSet res = dbcontainer.ExecuteQuery("select * from pandi.tb01")){
            while(res.next()){
                System.out.println(res.getString("zipcode"));
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
