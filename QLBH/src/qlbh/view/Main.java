/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlbh.view;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nctuan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var server = "TUANNC15\\SQLEXPRESS";
        var user = "sa";
        var passWord = "sa";
        var db = "FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041";
        var port = "1433";
        String dbURLSSL1 = "jdbc:sqlserver://TUANNC15\\SQLEXPRESS:1433;databaseName=FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041;encrypt=true;trustServerCertificate=true;user=sa;password=sa;";
        System.out.println(dbURLSSL1);
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbURLSSL1, user, passWord);
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Tên Driver: " + dm.getDriverName());
                System.out.println("Phiên bản Driver: " + dm.getDriverVersion());
                System.out.println("Tên Cơ sở dữ liệu: " + dm.getDatabaseProductName());
                System.out.println("Phiên bản Cơ sửo dữ liệu: " + dm.getDatabaseProductVersion());
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
