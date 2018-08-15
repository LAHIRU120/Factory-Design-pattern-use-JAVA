/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.view.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.dto.ItemDTO;

/**
 * FXML Controller class
 *
 * @author LAHIRU SASANKA
 */
public class PlaceOrderController implements Initializable {

    @FXML
    private JFXComboBox<String> customerIDCmb;
    @FXML
    private JFXTextField customerNameText;
    @FXML
    private JFXTextField orderIDText;
    @FXML
    private JFXTextField orderDateText;
    @FXML
    private JFXTextField itemNameRText;
    @FXML
    private JFXComboBox<String> itemIDCmb;
    @FXML
    private JFXTextField itemPriceText;
    @FXML
    private JFXTextField itemStockText;
    @FXML
    private JFXTextField itemCustomerSelectQty;
    @FXML
    private JFXTextField totalText;
    @FXML
    private JFXButton clearItemBtn;
    @FXML
    private JFXButton canselOrderBtn;
    @FXML
    private JFXButton saveBtn;
    @FXML
    private TableView<?> itemSelectTable;
    @FXML
    private AnchorPane root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void clearItemTable(ActionEvent event) {
    }

    @FXML
    private void canselOrder(ActionEvent event) {
    }

    @FXML
    private void saveOrder(ActionEvent event) {
    }


    @FXML
    private void selectCustomer(MouseEvent event) {
        
    }

    @FXML
    private void itemSelect(MouseEvent event) {
        
    }
    
    private void loadCustomerIds() {
        
    }

    private void loadItemcodes() {
        
    }
    

    @FXML
    private void selectCustomerID(ActionEvent event) {
        
    }

    @FXML
    private void itemCodeSelectID(ActionEvent event) {
        
    }

    @FXML
    private void customerSelctQty(KeyEvent event) {
        
    }
    
}
