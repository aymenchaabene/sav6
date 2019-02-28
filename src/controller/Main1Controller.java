/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.reclamation_prestation;
import entities.reclamation_produit;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
import sav6.mailer;
import service.ajouter_reclamation_prestation;
import service.ajouter_reclamation_produit;

/**
 * FXML Controller class
 *
 * @author chabene
 */
public class Main1Controller implements Initializable {
    
    @FXML private TextField txt_nom1;
    @FXML private TextField  txt_prenom1;
    @FXML private TextField  txt_num1;
    @FXML private TextField  txt_e_mail1;
    @FXML private TextField  txt_nom_prestataire1;
    @FXML private TextArea  txt_description1;

    /**
     * Initializes the controller class.
     */
    
    
    @FXML
    private void ajouterreclamationprestation(ActionEvent event) 
       throws SQLException {
        

        int mai=0;


                   if(!txt_e_mail1.getText().contains("@"))
                       mai++;
                   if(!txt_e_mail1.getText().contains("."))
                       mai++;
             
                   if((mai==0))
                    {
      

        
         String nom = txt_nom1.getText();
         String prenom =txt_prenom1.getText();
         int num =Integer.parseInt(txt_num1.getText());           
         String e_mail =txt_e_mail1.getText();
         String nom_prestataire =txt_nom_prestataire1.getText();
         String description = txt_description1.getText();

       
        
        reclamation_prestation r = new reclamation_prestation(nom,prenom,num,e_mail,nom_prestataire,description,1);
        ajouter_reclamation_prestation gr = new ajouter_reclamation_prestation();
        gr.ajouterreclamationprestation(r,1);
        
     
       
        Notifications notificationBuilder = Notifications.create()
              .title("réclamation ajoutée")
              .text("succés")
              .graphic(null)
              .hideAfter(Duration.seconds(5))
              .position(Pos.TOP_RIGHT)
              .onAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
System.out.println("clicked on notification");             
             }
              });
      notificationBuilder.show();
           
           
      
          mailer.sendMail(txt_e_mail1.getText(),"réclamation recu","succes");
           
           //send sms ajout
//SMS smstut=new SMS();
//                    String s=txt_num.getText();
//      smstut.SendSMS("Aymen101", "azerty159","Réservation recu ","+21620685653", "https://bulksms.vsms.net/eapi/submission/send_sms/2/2.0");

                 
      
      
       }
                   else {
           
                          
                           if(mai!=0){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erreur d'incription");
		alert.setHeaderText("email invalid");
		alert.setContentText("L'adresse mail doit contenir un . et un @!");
		alert.showAndWait();}
                           
       }

       }
       
      //  getAll(event);
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
