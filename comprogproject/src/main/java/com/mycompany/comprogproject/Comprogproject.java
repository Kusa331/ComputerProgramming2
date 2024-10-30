/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comprogproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author xxTitoNELxx
 */
public class Comprogproject {

    public static Connection conn(){
        try{
            String url = "jdbc:mysql://localhost:3306/residentregistrationform";
            String user = "admin";
            String password = "1234";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            }catch(SQLException|ClassNotFoundException e){
                JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
