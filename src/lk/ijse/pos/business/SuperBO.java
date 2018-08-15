/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business;

import java.util.ArrayList;
import lk.ijse.pos.dto.SuperDTO;

/**
 *
 * @author LAHIRU SASANKA
 */
public interface SuperBO {
    
    public boolean add(SuperDTO superDTO) throws Exception;
    
    public boolean update(SuperDTO dto)throws Exception;
    
    public boolean delete(String key)throws Exception;
    
    public SuperDTO search(String key)throws Exception;
    
    public ArrayList<SuperDTO> getAll()throws Exception;
}
