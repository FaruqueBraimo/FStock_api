/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockapi.Stock_API.Resources;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stockapi.Stock_API.Models.Customers;
import stockapi.Stock_API.Repository.CustomerRepository;

/**
 *
 * @author faruq
 */
@RestController
@RequestMapping( value = "api")
@CrossOrigin("*")
public class CustomerResource {
    
   @Autowired
    private CustomerRepository cr;
   
    
    @PostMapping("/saveCustomer")
    public Customers guardar(@RequestBody Customers customer){
        return cr.save(customer);
    }
    
    @GetMapping("/customers")
    public List<Customers> listAllCustomers(){
        return cr.findAll();
    }
    
    @GetMapping("customers/{customerId}")
    public Customers findCustmer(@PathVariable(value = "customerId") UUID customerId ) {
        
        return cr.findByCustomerId(customerId);
    }
    
    @DeleteMapping("customers/{customerId}")
    public Customers deleteCustomer(@PathVariable(value = "customerId") UUID customerId) {
       Customers cat = cr.findByCustomerId(customerId);
        
        cr.delete(cat);
        return cat;
    }
    
     @PutMapping("/updateCustomer")
    public Customers editar(@RequestBody  Customers customer){
        cr.save(customer);
        return customer;
    }
    
   

    
}
