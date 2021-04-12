/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockapi.Stock_API.Models;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author faruq
 */
@Entity
public class Customers {
    
    @Id
    @GeneratedValue
    private UUID  customerId; 
    private String name;
    private int phone;

    /**
     * @return the customerId
     */
    public UUID getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

}
