/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockapi.Stock_API.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stockapi.Stock_API.Entity.Roles;
import stockapi.Stock_API.Models.Providers;
import stockapi.Stock_API.Repository.RoleRepository;

/**
 *
 * @author faruq
 */
@RestController
@RequestMapping( value = "api")
@CrossOrigin("*")
public class RoleResource {
 
    @Autowired
    private RoleRepository rp;
    
    
       @PostMapping("/saveRole")
      public Roles guardar(@RequestBody  Roles role){
        return rp.save(role);
      }
        
    
    
    
    
    
    
    
}
