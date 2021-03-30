/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockapi.Stock_API.Resources;

import java.util.List;
import java.util.UUID;
import stockapi.Stock_API.Models.Category;
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
import stockapi.Stock_API.Repository.CategoryRepository;

/**
 *
 * @author faruq
 */
@RestController
@RequestMapping( value = "api")
@CrossOrigin("*")
public class CategoryResource {
    
    @Autowired
    private CategoryRepository cr;
    
    
    @PostMapping("/saveCategory")
    public Category guardar(@RequestBody Category category){
        return cr.save(category);
    }
    
    @GetMapping("/categories")
    public List<Category> listCategories(){
        return cr.findAll();
    }
    
    @GetMapping("categories/{categoryId}")
    public Category findCategory(@PathVariable(value = "categoryId") UUID categoryId ) {
        
        return cr.findByCategoryId(categoryId);
    }
    
    @DeleteMapping("categories/{categoryId}")
    public Category deleteCategory(@PathVariable(value = "categoryId") UUID categoryId) {
       Category cat = cr.findByCategoryId(categoryId);
        
        cr.delete(cat);
        return cat;
    }
    
     @PutMapping("/updateCategory")
    public Category editar(@RequestBody  Category category){
        cr.save(category);
        return category;
    }
    
   

    
}
