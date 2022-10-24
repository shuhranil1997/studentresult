/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectorPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author yash
 */
public class ConnectionProvider {
    public static  Connection getcon(){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management", "root", "");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
           return null; 
        }
    }
    public static void main(String [] args){
        getcon();
    }
}
