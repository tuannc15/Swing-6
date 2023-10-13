/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nctuan
 */
public class DBConnect {

    public static final String HOSTNAME = "TUANNC15\\SQLEXPRESS";
    public static final String PORT = "1433";
    public static final String DBNAME = "PTPM_FINALLY_JAVA_SOF203";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "sa";

    /**
     * Get connection to MSSQL Server
     *
     * @return Connection
     */
    public static Connection getConnection() {

        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME + ";encrypt=true;trustServerCertificate=true;";

        try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conn = DriverManager.getConnection(dbURLSSL, user, passWord);
            return DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
        
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            System.out.println("Kết nối CSDL không thành công");
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public static void main(String[] args) {
        Connection conn=getConnection();
        if (conn!=null) {
            System.out.println("Kết nối CSDL thành công");
        }
               
    }
}
