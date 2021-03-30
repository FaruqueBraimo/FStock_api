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
import stockapi.Stock_API.Models.Category;
import stockapi.Stock_API.Models.Providers;
import stockapi.Stock_API.Repository.ProviderRepository;

/**
 *
 * @author faruq
 */
@RestController
@RequestMapping( value = "api")
@CrossOrigin("*")
public class ProviderResouce {
    
    @Autowired
    private ProviderRepository provRep;
    
      @PostMapping("/saveProvider")
      public Providers guardar(@RequestBody Providers provider){
        return provRep.save(provider);
      }
        
    @GetMapping("/providers")
    public List<Providers> listProviders(){
        return provRep.findAll();
    }
    
    @GetMapping("providers/{providerId}")
    public Providers findProvider(@PathVariable(value = "providerId") UUID providerId ) {
        
        return provRep.findByProviderId(providerId);
    }
    
    @DeleteMapping("providers/{providerId}")
    public Providers deleteProvider(@PathVariable(value = "providerId") UUID providerId) {
       Providers providers = provRep.findByProviderId(providerId);
        
        provRep.delete(providers);
        return providers;
    }
    
     @PutMapping("/updateProvider")
    public Providers editar(@RequestBody  Providers provider){
        provRep.save(provider);
        return provider;
    }
    
        
        
    }
    
    
    
    

