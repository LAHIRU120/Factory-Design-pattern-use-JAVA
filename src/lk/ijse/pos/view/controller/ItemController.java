/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.view.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.pos.dto.ItemDTO;

/**
 * FXML Controller class
 *
 * @author LAHIRU SASANKA
 */
public class ItemController implements Initializable {

    @FXML
    private JFXTextField itemIDText;
    @FXML
    private JFXTextField itemNameText;
    @FXML
    private JFXTextField itemQtyText;
    @FXML
    private JFXTextField itemPriceText;
    @FXML
    private TableView<ItemDTO> itemTable;
    @FXML
    private JFXButton itemSerchBtn;
    @FXML
    private JFXButton itemRemoveBtn;
    @FXML
    private JFXButton itemUpdateBtn;
    @FXML
    private JFXButton itemViewBtn;
    @FXML
    private JFXButton itemAddBtn;
    @FXML
    private AnchorPane root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void itemIDSearch(ActionEvent event) {
        
    }

    @FXML
    private void itemRemove(ActionEvent event) {
        
    }

    @FXML
    private void itemUpdate(ActionEvent event) {
        
    }

    @FXML
    private void itemView(ActionEvent event) {
        
    }

    @FXML
    private void itemAdd(ActionEvent event) {
        
    }
}
