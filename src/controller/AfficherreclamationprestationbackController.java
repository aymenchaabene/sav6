/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.reclamation_prestation;
import entities.reclamation_produit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
import org.controlsfx.control.textfield.TextFields;
import service.ajouter_reclamation_prestation;
import service.ajouter_reclamation_produit;

/**
 * FXML Controller class
 *
 * @author chabene
 */
public class AfficherreclamationprestationbackController implements Initializable {
    
     @FXML
    private ListView<reclamation_prestation> viewprestation;
    @FXML
    private AnchorPane pane1;
    
      @FXML private TextField  searchField;

    /**
     * Initializes the controller class.
     */
      
      void filterEventsList(String oldValue, String newValue) {
        ajouter_reclamation_prestation qs = new ajouter_reclamation_prestation();
        ObservableList<reclamation_prestation> filteredList = FXCollections.observableArrayList();
        if (searchField.getText() == null || (newValue.length() < oldValue.length()) || newValue == null) {
            viewprestation.setItems(qs.show());

        } else {

            newValue = newValue.toUpperCase();

            for (reclamation_prestation q : viewprestation.getItems()) {

                String filtertitre = q.getNom();

                if (filtertitre.toUpperCase().contains(newValue)) {
                    filteredList.add(q);
                }

            }
            viewprestation.setItems(filteredList);

        }
    } 
      
      
      
      
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ajouter_reclamation_prestation ap = new ajouter_reclamation_prestation();
        viewprestation.getItems().clear();
     viewprestation.setItems(ap.getAllprestation());
     
     
     ajouter_reclamation_prestation qs = new ajouter_reclamation_prestation();
        TextFields.bindAutoCompletion(searchField, qs.show());
        searchField.textProperty().addListener(new javafx.beans.value.ChangeListener<String>() {
            
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                filterEventsList((String) oldValue,(String) newValue);
            }
    
    });
    }   

     @FXML
    private void ItemSelected(MouseEvent event) {
      int item= viewprestation.getSelectionModel().getSelectedItem().getId_reclamation_prestation();
      
      ajouter_reclamation_prestation ap = new ajouter_reclamation_prestation();
      if (ap.getEtat1(item)==false)
      {
      ap.modifierReclamationPrestation(item);
    
       viewprestation.setItems(ap.getAllprestation());
        Notifications notificationBuilder = Notifications.create()
              .title("réclamation validée")
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
      notificationBuilder.show();}
      else
      {  Notifications notificationBuilder = Notifications.create()
              .title("réclamation déjà validée")
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
      notificationBuilder.show();}
      
      
        
        
    }
}