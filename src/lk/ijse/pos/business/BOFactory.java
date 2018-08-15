/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business;

import lk.ijse.pos.business.custom.impl.CustomerBOImpl;
import lk.ijse.pos.business.custom.impl.ItemBOImpl;

/**
 *
 * @author LAHIRU SASANKA
 */
public class BOFactory {
   public enum BOTypes{
       CUSTOMER,ITEM;
   }
   
   private static BOFactory bOFactory;

    public BOFactory() {
    }
    public static BOFactory getInstance(){
        if (bOFactory==null) {
            bOFactory= new BOFactory();
        }
        return bOFactory;
    }
   
    public SuperBO getBO(BOTypes bOTypes){
        switch(bOTypes){
            case CUSTOMER: return new CustomerBOImpl();
            case ITEM:  return new ItemBOImpl();
            default:return  null;
        }
    }
}
