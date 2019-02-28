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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author chabene
 */
public class FrontController implements Initializable {
    
    @FXML
    private AnchorPane rootpane;
 
    

    
    @FXML
    public void lancerajout(ActionEvent event) throws IOException {
       
   AnchorPane pane =FXMLLoader.load(getClass().getResource("/vue/Main.fxml"));
   rootpane.getChildren().setAll(pane);
    }
    
    @FXML
    public void lancerajout1(ActionEvent event) throws IOException {
       
   AnchorPane pane =FXMLLoader.load(getClass().getResource("/vue/Main1.fxml"));
   rootpane.getChildren().setAll(pane);
    }
    

    
    @FXML
    public void lanceraffichage(ActionEvent event) throws IOException {
       
   AnchorPane pane =FXMLLoader.load(getClass().getResource("/vue/mesreclamations.fxml"));
   rootpane.getChildren().setAll(pane);
    }
    
     @FXML
    public void lanceraffichage1(ActionEvent event) throws IOException {
       
   AnchorPane pane =FXMLLoader.load(getClass().getResource("/vue/mesreclamations1.fxml"));
   rootpane.getChildren().setAll(pane);
    }
    
   @FXML
    public void donnernote(ActionEvent event) throws IOException {
       
   AnchorPane pane =FXMLLoader.load(getClass().getResource("/vue/vote.fxml"));
   rootpane.getChildren().setAll(pane);
    }
     
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
    
}
