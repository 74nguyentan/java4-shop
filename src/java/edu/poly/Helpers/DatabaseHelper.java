/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Helpers;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
       String connectionUrl ="jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=LuuDemo;User=sa;Password=songlong";
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       Connection con =DriverManager.getConnection(connectionUrl);
       return con;
    }

   
}
