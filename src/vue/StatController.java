/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import connection.conDB;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import service.ajouter_reclamation_produit;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author chabene
 */
public class StatController implements Initializable {
Connection cnx = conDB.getInstance().getCnx();
@FXML
    private BarChart<String,Integer> bar_chart;
    @FXML
    private Button btn_load;
    
    @FXML
    private void LoadChart(ActionEvent event) throws SQLException {
        String query="SELECT prenom, COUNT(*) FROM reclamation_prestation GROUP BY nom  ";
        XYChart.Series<String,Integer> series=new XYChart.Series<>();
        ResultSet rs=cnx.createStatement().executeQuery(query);
        while (rs.next())
                    {            
                           series.getData().add(new XYChart.Data<>(rs.getString(1),rs.getInt(2)));
                          bar_chart.getData().add(series);
                    }
        
    
    
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }
  
}
