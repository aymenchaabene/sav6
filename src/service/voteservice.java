/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import connection.conDB;
import entities.vote;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chabene
 */
public class voteservice {
    
    Connection cnx;
    
    public voteservice() throws SQLException {
       cnx = conDB.getInstance().getCnx();
       
        
    }

     public void ajouterAlaBaseVote(vote v)throws SQLException  {
  
             
              try {
                int  a=v.getNote();
            
             String req = "INSERT INTO `vote`(`note`) VALUES (?) ";
             PreparedStatement pstm = cnx.prepareStatement(req);
           
             pstm.setInt(1,v.getNote());
         if(a<=3){
             pstm.executeUpdate();
         }} catch (SQLException ex) {
             Logger.getLogger(voteservice.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    }
     

   
          public int nbrVote() throws SQLException
      { 
          int sr=0;
        Statement st = cnx.createStatement();
            String myStatement = "SELECT COUNT(*) FROM vote ";
            ResultSet rs = st.executeQuery(myStatement);
            int num = 0;
            while(rs.next()){
                num = (rs.getInt(1));
            }
            return num;
      }
         
       public int nbrVote1() throws SQLException
      {
       Statement st = cnx.createStatement();
            String myStatement = "SELECT COUNT(*) FROM vote WHERE note=1 ";
            ResultSet rs = st.executeQuery(myStatement);
            int num = 0;
            while(rs.next()){
                num = (rs.getInt(1));
            }
            return num;
      }
       public int nbrVote2() throws SQLException
      {
         Statement st = cnx.createStatement();
            String myStatement = "SELECT COUNT(*) FROM vote WHERE note=2";
            ResultSet rs = st.executeQuery(myStatement);
            int num = 0;
            while(rs.next()){
                num = (rs.getInt(1));
            }
            return num;
      }
        public int nbrVote3() throws SQLException
      {
         Statement st = cnx.createStatement();
            String myStatement = "SELECT COUNT(*) FROM vote WHERE note=3 ";
            ResultSet rs = st.executeQuery(myStatement);
            int num = 0;
            while(rs.next()){
                num = (rs.getInt(1));
            }
            return num;
      }
         public int nbrVote0() throws SQLException
      {
       Statement st = cnx.createStatement();
            String myStatement = "SELECT COUNT(*) FROM vote WHERE note=0 ";
            ResultSet rs = st.executeQuery(myStatement);
            int num = 0;
            while(rs.next()){
                num = (rs.getInt(1));
            }

            return num;
      }

   public  ArrayList<vote> getAllVotes() throws SQLException {
       ArrayList<vote> retour = new ArrayList<>();
       Statement stm = cnx.createStatement();
        String req = "SELECT * FROM vote";
        ResultSet resultat = stm.executeQuery(req);
        while(resultat.next()){
            int idvote= resultat.getInt(1);

           int note= resultat.getInt(4);
           retour.add(new vote(idvote,note));
            
        }
            
        return retour;
    }

    
    
}

