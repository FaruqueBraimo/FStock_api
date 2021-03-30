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
import stockapi.Stock_API.Models.Products;
import stockapi.Stock_API.Models.Providers;
import stockapi.Stock_API.Repository.CategoryRepository;
import stockapi.Stock_API.Repository.ProductRepository;
import stockapi.Stock_API.Repository.ProviderRepository;

/**
 *
 * @author faruq
 */
@RestController
@RequestMapping( value = "api")
@CrossOrigin("*")
public class ProductResouce {
    
  @Autowired
   private ProductRepository prodRep;     
    @Autowired
    private CategoryRepository cr;
    
    @Autowired
    private ProviderRepository provRep;
        
      @PostMapping("/saveProduct")
      public Products guardar(@RequestBody Products product){
       Category cat = cr.findByCategoryId(product.getCategory().getCategoryId());
       Providers providers = provRep.findByProviderId(product.getProvider().getProviderId());
       product.setCategory(cat);
       product.setProvider(providers);
       
       return prodRep.save(product);
        
        
        
      }
        
    @GetMapping("/products")
    public List<Products> listProducts(){
        return prodRep.findAll();
    }
    
    @GetMapping("products/{productId}")
    public Products findProduct(@PathVariable(value = "productId") UUID productId ) {
        
        return prodRep.findByProductId(productId);
    }
    
    @DeleteMapping("products/{productId}")
    public Products deleteProduct(@PathVariable(value = "productId") UUID productId) {
       Products product = prodRep.findByProductId(productId);
        
        prodRep.delete(product);
        return product;
    }
    
     @PutMapping("/updateProduct")
    public Products editar(@RequestBody  Products product){
        prodRep.save(product);
        return product;
    }
    
        
    
}
