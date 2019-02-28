/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import connection.conDB;
import entities.reclamation_produit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author chabene
 */
public class ajouter_reclamation_produit {
    
    Connection cnx = conDB.getInstance().getCnx();
      private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;
    
    
    
    public void ajouterreclamationproduit(reclamation_produit r,int id) {       
          try {
                     String nom=null;
              String prenom=null;
             PreparedStatement psstm = cnx.prepareStatement("select nom , prenom from user where id=?");
             psstm.setInt(1, id);
             ResultSet set= psstm.executeQuery();
             while(set.next())
             {
                  nom=set.getString("nom");
                  prenom=set.getString("prenom");
                 
             }
             String req = "INSERT INTO `reclamation_produit`( `nom`,`prenom`,`num`,`e_mail`,`nom_produit`,`description`,id_user) VALUES (?,?,?,?,?,?,?)";
             PreparedStatement pstm = cnx.prepareStatement(req);
             
              pstm.setString(1, nom);
             pstm.setString(2, prenom);
             pstm.setInt(3, r.getNum());
             pstm.setString(4, r.getE_mail());
             pstm.setString(5, r.getNom_produit());
             pstm.setString(6, r.getDescription());
             pstm.setInt(7, id);
             pstm.executeUpdate();
         } catch (SQLException ex) {
              System.err.println(ex.getMessage());
         }
    } 
    
    
public ObservableList<reclamation_produit> getAll(int id) {
        ObservableList<reclamation_produit> l = FXCollections.observableArrayList();

        try {
            Statement st = cnx.createStatement();

            String req = "select * from reclamation_produit where id_user='"+id+"'";

            ResultSet rs = st.executeQuery(req); //retourne un résulat

            while (rs.next()) {
                reclamation_produit c = new reclamation_produit();
                c.setId_reclamation_produit(rs.getInt(1));
                c.setNom(rs.getString(2));
                c.setPrenom(rs.getString(3));
                c.setNum(rs.getInt(4));
                c.setE_mail(rs.getString(5));
                c.setNom_produit(rs.getString(6));
                c.setDescription(rs.getString(7));
                c.setÉtat(rs.getBoolean(8));
               
                l.add(c);
            }

            return l;
        } catch (SQLException ex) {
            System.out.println("erreur" + ex.getMessage());
            return null;
        }
    }


public ObservableList<reclamation_produit> getAllproduit() {
        ObservableList<reclamation_produit> l = FXCollections.observableArrayList();

        try {
            Statement st = cnx.createStatement();

            String req = "select * from reclamation_produit";

            ResultSet rs = st.executeQuery(req); //retourne un résulat

            while (rs.next()) {
                reclamation_produit c = new reclamation_produit();
                c.setId_reclamation_produit(rs.getInt(1));
                c.setNom(rs.getString(2));
                c.setPrenom(rs.getString(3));
                c.setNum(rs.getInt(4));
                c.setE_mail(rs.getString(5));
                c.setNom_produit(rs.getString(6));
                c.setDescription(rs.getString(7));
                c.setÉtat(rs.getBoolean(8));
               
                l.add(c);
            }

            return l;
        } catch (SQLException ex) {
            System.out.println("erreur" + ex.getMessage());
            return null;
        }
    }

public boolean getEtat(int id)
{ boolean etat=false;
      try {
             
        
             PreparedStatement pstm = cnx.prepareStatement("select `état` from reclamation_produit WHERE `id_reclamation_produit`=?");
             
             pstm.setInt(1,id);
             
               ResultSet rs = pstm.executeQuery(); //retourne un résulat

            while (rs.next()) {
               etat=rs.getBoolean("état");
            }
         } catch (SQLException ex) {
              System.err.println(ex.getMessage());
         }
      return etat;
}
   public void modifierReclamationProduit(int id) {       
          try {

             String req = "UPDATE `reclamation_produit` SET `état`=1 WHERE `id_reclamation_produit`=?";
             PreparedStatement pstm = cnx.prepareStatement(req);
             
             pstm.setInt(1,id);
             
             pstm.executeUpdate();

                 
         } catch (SQLException ex) {
              System.err.println(ex.getMessage());
         }
    }
   
   
   public List<String> nameList(){
         String req = "select nom from reclamation_produit" ;
         List<String> list = new ArrayList<>();
          try {
            ste=connection.conDB.getInstance().getCnx().createStatement();
            
            rs=ste.executeQuery(req);
            while(rs.next())
                list.add(rs.getString(1));
              }
         catch (SQLException ex) {
            Logger.getLogger(ajouter_reclamation_produit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public ObservableList<reclamation_produit> show(){
        String req = "select nom, prenom, num, e_mail, nom_produit, description from reclamation_produit" ;
      ObservableList<reclamation_produit> list = FXCollections.observableArrayList();
        try {
           ste=connection.conDB.getInstance().getCnx().createStatement();
            
            rs=ste.executeQuery(req);
            while(rs.next())
            {
           list.add(new reclamation_produit(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(reclamation_produit.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
   
    }
    
    
    

