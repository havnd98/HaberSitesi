/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author havnd
 */
public abstract class DBConnection {
    private Connection connection;
    
    public Connection connect(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/habersitesi","root","123");
            
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return this.connection;
    }
}
