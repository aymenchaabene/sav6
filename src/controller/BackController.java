/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author chabene
 */
public class BackController implements Initializable {
    
    @FXML
    private AnchorPane pane1;
     @FXML
    private AnchorPane pane;
    
    
     @FXML
    public void afficherbackreclamationproduit(ActionEvent event) throws IOException {
       
   AnchorPane pane1 =FXMLLoader.load(getClass().getResource("/vue/afficherreclamationproduitback.fxml"));
   pane.getChildren().setAll(pane1);
    }
    
    @FXML
    public void afficherbackreclamationprestation(ActionEvent event) throws IOException {
       
   AnchorPane pane1 =FXMLLoader.load(getClass().getResource("/vue/afficherreclamationprestationback.fxml"));
   pane.getChildren().setAll(pane1);
    }
    
      @FXML
    public void affichernote(ActionEvent event) throws IOException {
       
   AnchorPane pane1 =FXMLLoader.load(getClass().getResource("/vue/affichernote.fxml"));
   pane.getChildren().setAll(pane1);
    }
    
     @FXML
    public void afficherstat(ActionEvent event) throws IOException {
       
   AnchorPane pane1 =FXMLLoader.load(getClass().getResource("/vue/stat.fxml"));
   pane.getChildren().setAll(pane1);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
