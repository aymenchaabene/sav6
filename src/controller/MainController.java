/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.teknikindustries.bulksms.SMS;
import sav6.mailer;
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
import service.ajouter_reclamation_produit;

/**
 * FXML Controller class
 *
 * @author chabene
 */
public class MainController implements Initializable {
    
    
    @FXML private TextField txt_nom;
    @FXML private TextField  txt_prenom;
    @FXML private TextField  txt_num;
    @FXML private TextField  txt_e_mail;
    @FXML private TextField  txt_nom_produit;
    @FXML private TextArea  txt_description;

    /**
     * Initializes the controller class.
     */
    
    
    
    
   @FXML
    private void ajouterreclamationproduit(ActionEvent event) 
       throws SQLException {

          
        
        int mai=0;
   

       
      
           
        
                       if(!txt_e_mail.getText().contains("@"))
                       mai++;
                       if(!txt_e_mail.getText().contains("."))
                       mai++;
                   
              
                       
              

               
                   
         String nom = txt_nom.getText();
         String prenom =txt_prenom.getText();
         int num =Integer.parseInt(txt_num.getText());           
         String e_mail =txt_e_mail.getText();
         String nom_produit =txt_nom_produit.getText();
         String description = txt_description.getText();

       
        if((mai==0))
           { 
           

        reclamation_produit r = new reclamation_produit(nom,prenom,num,e_mail,nom_produit,description,1);
        ajouter_reclamation_produit gr = new ajouter_reclamation_produit();
        gr.ajouterreclamationproduit(r,1);
        
      //  notification ajout
       
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
           
      
      
      //mail ajout
      
      
      mailer.sendMail(txt_e_mail.getText(),"réclamation recu","succes");
      
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
     


    

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
}    
    
    }
