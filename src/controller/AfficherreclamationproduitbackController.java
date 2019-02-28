/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
import javafx.scene.control.TextArea;
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
public class AfficherreclamationproduitbackController implements Initializable {
    
     @FXML
    private ListView<reclamation_produit> viewproduit;
    @FXML
    private AnchorPane pane1;
    
      @FXML private TextField  searchField;

    /**
     * Initializes the controller class.
     */
      
      
     void filterEventsList(String oldValue, String newValue) {
        ajouter_reclamation_produit qs = new ajouter_reclamation_produit();
        ObservableList<reclamation_produit> filteredList = FXCollections.observableArrayList();
        if (searchField.getText() == null || (newValue.length() < oldValue.length()) || newValue == null) {
            viewproduit.setItems(qs.show());

        } else {

            newValue = newValue.toUpperCase();

            for (reclamation_produit q : viewproduit.getItems()) {

                String filtertitre = q.getNom();

                if (filtertitre.toUpperCase().contains(newValue)) {
                    filteredList.add(q);
                }

            }
            viewproduit.setItems(filteredList);

        }
    } 
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ajouter_reclamation_produit ap = new ajouter_reclamation_produit();
     viewproduit.setItems(ap.getAllproduit());
     
     
ajouter_reclamation_produit qs = new ajouter_reclamation_produit();
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
      int item= viewproduit.getSelectionModel().getSelectedItem().getId_reclamation_produit();
      
      ajouter_reclamation_produit ap = new ajouter_reclamation_produit();
      if (ap.getEtat(item)==false)
      {
      ap.modifierReclamationProduit(item);
       viewproduit.setItems(ap.getAllproduit());
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
