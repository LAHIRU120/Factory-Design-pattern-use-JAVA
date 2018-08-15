/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.view.controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LAHIRU SASANKA
 */
public class HomeController implements Initializable {

    @FXML
    private JFXButton loadCustomerFormBtn;
    @FXML
    private JFXButton loadItemFormBtn;
    @FXML
    private JFXButton loadPlaceOrderFormBtn;
    @FXML
    private AnchorPane sidePanel;
    @FXML
    private JFXButton loadDashbord;
    @FXML
    private JFXButton close;
    @FXML
    private AnchorPane homePanel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadDashBord();
    }    

    @FXML
    private void customerFormLoad(ActionEvent event) {
        try {
            AnchorPane anchorPane=FXMLLoader.load(this.getClass().getResource("/lk/ijse/pos/view/Customer.fxml"));
            homePanel.getChildren().setAll(anchorPane);
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void itemFormLoad(ActionEvent event) {
        try {
            AnchorPane anchorPane=FXMLLoader.load(this.getClass().getResource("/lk/ijse/pos/view/Item.fxml"));
            homePanel.getChildren().setAll(anchorPane);
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void placeOrderFormLoad(ActionEvent event) {
        try {
            AnchorPane anchorPane=FXMLLoader.load(this.getClass().getResource("/lk/ijse/pos/view/PlaceOrder.fxml"));
            homePanel.getChildren().setAll(anchorPane);
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void dashbordFormLoad(ActionEvent event) {
        loadDashBord();
    }

    @FXML
    private void close(ActionEvent event) {
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }

    private void loadDashBord() {
        try {
            AnchorPane anchorPane=FXMLLoader.load(this.getClass().getResource("/lk/ijse/pos/view/Dashbord.fxml"));
            homePanel.getChildren().setAll(anchorPane);
        } catch (IOException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
