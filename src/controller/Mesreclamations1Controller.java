/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connection.conDB;
import entities.reclamation_prestation;
import entities.reclamation_produit;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import service.ajouter_reclamation_prestation;
import service.ajouter_reclamation_produit;

/**
 * FXML Controller class
 *
 * @author chabene
 */
public class Mesreclamations1Controller implements Initializable {
    
     Connection cnx = conDB.getInstance().getCnx();
     
     @FXML
    private ListView<reclamation_prestation> view1;
 
    @FXML
    private AnchorPane pane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       ajouter_reclamation_prestation ap = new ajouter_reclamation_prestation();
     view1.setItems(ap.getAll1(1));
    }    
    
}
