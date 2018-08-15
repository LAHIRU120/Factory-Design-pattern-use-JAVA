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
import lk.ijse.pos.business.BOFactory;
import lk.ijse.pos.business.custom.CustomerBO;
import lk.ijse.pos.business.custom.impl.CustomerBOImpl;
import lk.ijse.pos.dto.CustomerDTO;

/**
 * FXML Controller class
 *
 * @author LAHIRU SASANKA
 */
public class CustomerController implements Initializable {

    @FXML
    private JFXTextField customerIDText;
    @FXML
    private JFXTextField customerNameText;
    @FXML
    private JFXTextField customerAddressText;
    @FXML
    private JFXTextField customerSalaryText;
    @FXML
    private TableView<CustomerDTO> customerTable;
    @FXML
    private JFXButton customerSerachBtn;
    @FXML
    private JFXButton customerRemoveBtn;
    @FXML
    private JFXButton customerUpdateBtn;
    @FXML
    private JFXButton customerViewBtn;
    @FXML
    private JFXButton customerAddBtn;
    @FXML
    private AnchorPane root;

    /**
     * Initializes the controller class.
     */
    private  CustomerBO customerBO;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        customerBO= (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);
    }    

    @FXML
    private void customerSeachID(ActionEvent event) {
        
    }

    @FXML
    private void customerRemove(ActionEvent event) {
        
    }

    @FXML
    private void cusomterUpdate(ActionEvent event) {
        
    }

    @FXML
    private void customerView(ActionEvent event) {
        
    }

    @FXML
    private void customerAdd(ActionEvent event) {
        try {
            String cid= customerIDText.getText();
            String name= customerNameText.getText();
            String address= customerAddressText.getText();
            double salary=Double.parseDouble(customerSalaryText.getText());
            CustomerDTO customer = new CustomerDTO(cid, name, address, salary);
            boolean isAdded=customerBO.add(customer);
            if (isAdded) {
                Alert alert=new Alert(Alert.AlertType.INFORMATION,"Added",ButtonType.OK);
                alert.show();
                getAllCustomer();
            } else {
                Alert alert=new Alert(Alert.AlertType.ERROR,"Added Fail",ButtonType.OK);
                alert.show();
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getAllCustomer() {
        
    }
    
    
}
