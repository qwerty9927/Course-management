package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MySQLConnect {
    private String user = "root";
    private String password="";
    private String url="jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=UTF-8";
    private Connection conn = null;
    private Statement st = null;

    public void Connect()
    {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void disConnect()
    { 
        try{
            st.close();
            conn.close();
        }catch (SQLException E){}
    }
    
    public ResultSet executeQuery(String sql)
    {
        ResultSet rs = null;
        try {
            Connect();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Error!");
            Logger.getLogger(MySQLConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public boolean executeUpdate(String sql)
    {
        try {
            Connect();
            st = conn.createStatement();
            if(st.executeUpdate(sql) == 1){
                disConnect();
                return true;
            }
            disConnect();
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public Connection getConnection()
    {
        Connect();
        return conn;
    }
    public boolean isConnected()
    {
        if (conn==null){
        } 
        else {
            return true;
        }
        return false;
    }
}
/*
 * @author KhanhPham
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
