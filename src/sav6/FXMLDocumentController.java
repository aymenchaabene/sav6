/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sav6;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author chabene
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane rootpane;
    
    @FXML
    private Label label;
    
    
  
    
    @FXML
    private void front(ActionEvent event) throws IOException {
              
   AnchorPane pane =FXMLLoader.load(getClass().getResource("/vue/front.fxml"));
   rootpane.getChildren().setAll(pane);
    }
    
     @FXML
    private void back(ActionEvent event) throws IOException {
              
   AnchorPane pane =FXMLLoader.load(getClass().getResource("/vue/back.fxml"));
   rootpane.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
        
    }
    
     
       
    

