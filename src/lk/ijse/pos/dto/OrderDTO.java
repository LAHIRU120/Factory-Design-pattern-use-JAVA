/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.dto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author LAHIRU SASANKA
 */
public class OrderDTO extends SuperDTO implements Serializable{
    private String id;
    private String orderDate;
    private String customerId;
    private ArrayList<OrderDetailDTO> orderDetailList;

    public OrderDTO() {
    }

    public OrderDTO(String id, String orderDate, String customerId, ArrayList<OrderDetailDTO> orderDetailList) {
        this.id = id;
        this.orderDate = orderDate;
        this.customerId = customerId;
        this.orderDetailList = orderDetailList;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the orderDetailList
     */
    public ArrayList<OrderDetailDTO> getOrderDetailList() {
        return orderDetailList;
    }

    /**
     * @param orderDetailList the orderDetailList to set
     */
    public void setOrderDetailList(ArrayList<OrderDetailDTO> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    
    
}
