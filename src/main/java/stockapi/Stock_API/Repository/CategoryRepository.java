/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockapi.Stock_API.Repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import stockapi.Stock_API.Models.Category;

/**
 *
 * @author faruq
 */

public interface CategoryRepository extends JpaRepository<Category, Integer>{
  
  @Query(value = "select * from Category where category_Id =  ?1", nativeQuery = true) 
  Category findByCategoryId(UUID categoryId);
    
}
