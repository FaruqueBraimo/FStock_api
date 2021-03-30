/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockapi.Stock_API.Repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import stockapi.Stock_API.Models.Products;
import stockapi.Stock_API.Models.Providers;

/**
 *
 * @author faruq
 */
public interface ProviderRepository extends JpaRepository<Providers, UUID>{
    
      @Query(value = "select * from Providers where provider_id =  ?1", nativeQuery = true) 
     Providers findByProviderId(UUID providerId);
}
