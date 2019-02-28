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
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import service.voteservice;

/**
 * FXML Controller class
 *
 * @author chabene
 */
public class AffichernoteController implements Initializable {

    @FXML
    private TableView<?> tableauvote;
    @FXML
    private TableColumn<?, ?> columlnote;
    @FXML
    private Label result0;
    @FXML
    private Label result1;
    @FXML
    private Label result2;
    @FXML
    private Label result3;
    @FXML
    private Label result;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        voteservice vf;
        
        int res;
                        
                        //----------------resultatVotes------------------//
                        try {
                            vf =new voteservice();
                            res = vf.nbrVote();
                            String resu= Integer.toString(res);
                            result.setText(resu);
                        } catch (SQLException ex) {
                            Logger.getLogger(AffichernoteController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        //----------------resultatNotes0------------------//
                        
                        try {
                            vf =new voteservice();
                            res = vf.nbrVote0();
                            String resu= Integer.toString(res);
                            result0.setText(resu);
                        } catch (SQLException ex) {
                            Logger.getLogger(AffichernoteController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        //----------------resultatNotes1------------------//
                        
                        try {
                            vf =new voteservice();
                            res = vf.nbrVote1();
                            String resu= Integer.toString(res);
                            result1.setText(resu);
                        } catch (SQLException ex) {
                            Logger.getLogger(AffichernoteController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        //----------------resultatNotes2------------------//
                        
                        try {
                            vf =new voteservice();
                            res = vf.nbrVote2();
                            String resu= Integer.toString(res);
                            result2.setText(resu);
                        } catch (SQLException ex) {
                            Logger.getLogger(AffichernoteController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        //----------------resultatNotes3------------------//
                        
                        try {
                            vf =new voteservice();
                            res = vf.nbrVote3();
                            String resu= Integer.toString(res);
                            result3.setText(resu);
                        } catch (SQLException ex) {
                            Logger.getLogger(AffichernoteController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                         //----------------afficherVotes------------------//
                        
                        try{
                            
                            vf= new voteservice();

                        } catch (SQLException ex) {
                            Logger.getLogger(AffichernoteController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
               
                        
                    
                        
                        
        
    }    
    
}
