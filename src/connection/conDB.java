/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chabene
 */
public class conDB {
     private static conDB instance;
    private Connection cnx ;
    
     final String url = "jdbc:mysql://127.0.0.1/esprit";
    final String login = "root";
    final String password = "";

    private conDB(){
       try {    
           cnx = DriverManager.getConnection(url, login, password);
           System.out.println("connexion établie!!!!");
       } catch (SQLException ex) {
           Logger.getLogger(conDB.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    public Connection getCnx() {
        return cnx;
    }

    public static  conDB getInstance(){
        if(instance==null)
        instance = new conDB();
        return instance;
    }
}
