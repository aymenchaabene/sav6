/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import entities.vote;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import service.voteservice;

/**
 * FXML Controller class
 *
 * @author chabene
 */
public class VoteController implements Initializable {

    @FXML
    private AnchorPane pane;
    @FXML
    private RadioButton ajt0;
    @FXML
    private RadioButton ajt1;
    @FXML
    private RadioButton ajt2;
    @FXML
    private RadioButton ajt3;
    @FXML
    private Button valider;
    @FXML
    private ToggleGroup voteNote;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void valider(ActionEvent event) {
        
    
   
        RadioButton radio =(RadioButton)voteNote.getSelectedToggle();
       if(this.voteNote.getSelectedToggle().equals(this.ajt1)){
            try {
                vote a =new vote(1);
                voteservice af=new voteservice(); 
                af.ajouterAlaBaseVote(a);
            } catch (SQLException ex) {
                Logger.getLogger(VoteController.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       if(this.voteNote.getSelectedToggle().equals(this.ajt0)){
            try {
                vote a =new vote(0);
                voteservice af=new voteservice(); 
                af.ajouterAlaBaseVote(a);
            } catch (SQLException ex) {
                Logger.getLogger(VoteController.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       if(this.voteNote.getSelectedToggle().equals(this.ajt2)){
            try {
                vote a =new vote(2);
                voteservice af=new voteservice(); 
                af.ajouterAlaBaseVote(a);
            } catch (SQLException ex) {
                Logger.getLogger(VoteController.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       if(this.voteNote.getSelectedToggle().equals(this.ajt3)){
            try {
                vote a =new vote(3);
                voteservice af=new voteservice(); 
                af.ajouterAlaBaseVote(a);
            } catch (SQLException ex) {
                Logger.getLogger(VoteController.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        
   
    }

    }
    

