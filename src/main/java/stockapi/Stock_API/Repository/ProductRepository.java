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

/**
 *
 * @author faruq
 */
public interface ProductRepository extends JpaRepository<Products, UUID>{
    
    @Query(value = "select * from Products where product_id =  ?1", nativeQuery = true) 
     Products findByProductId(UUID productId);
    
}
