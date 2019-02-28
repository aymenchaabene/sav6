/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connection.conDB;
import entities.reclamation_produit;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import service.ajouter_reclamation_produit;

/**
 * FXML Controller class
 *
 * @author chabene
 */
public class MesreclamationsController implements Initializable {
    
    
     Connection cnx = conDB.getInstance().getCnx();
    

    
    @FXML
    private ListView<reclamation_produit> view;
 
    @FXML
    private AnchorPane pane;
   
    
    
     
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
     ajouter_reclamation_produit ap = new ajouter_reclamation_produit();
     view.setItems(ap.getAll(1));
     
     
   
    }

  
        
        
    }

  
    
    
    

