package com.gl051.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


public class DatabaseContainer {
    private Connection conn = null;
    private String URL;
    private Properties prop; 
    private ResultSet rs = null;
    private Statement st = null;
    
    public DatabaseContainer(String url, Properties prop){
        this.URL = url;
        this.prop = prop;
    }
       
    public ResultSet ExecuteQuery(String sql){        
        
        OpenConnection();
        
        try{            
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException e){
            TakeCareOfException(e);
            return null;
        }        
    }
    
    public int ExecuteUpdate(String sql){
        
        OpenConnection();
        
        try{
            Statement stm = conn.createStatement();
            return stm.executeUpdate(sql);         
        } catch (SQLException e){
            TakeCareOfException(e);
            return -1; 
        }   
    }
    
    public void Disconnect(){
        //CloseConnection();
        try { if (rs != null) rs.close(); } catch (Exception e) {};
        try { if (st != null) st.close(); } catch (Exception e) {};
        try { if (conn != null) conn.close(); } catch (Exception e) {};
    }
    
    private void OpenConnection(){        
        try{
            if (conn == null || conn.isClosed())
                conn = DriverManager.getConnection(URL, prop);
        } catch(SQLException e){
            TakeCareOfException(e);
        }
    }
    
    private void TakeCareOfException(Exception e){
        System.out.println(e.getMessage());
        System.out.println(e.getStackTrace().toString());
    }

    
}

