/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockapi.Stock_API.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author faruq
 */
@Entity
public class Products {

    @Id
    @GeneratedValue
    private UUID  productId;
    private String name;
    private int quantity;
    private int price_buy;
    private int price_Payd;
    private String description;
    @JsonFormat(pattern="yyyy/MM/dd")
    private LocalDate createdAt;
    private int grosso;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;
    
    private LocalDate expiress;
    private String Reference;
    private int stockBreack;
    @GeneratedValue
    private int codigo;
    @ManyToOne
    @JoinColumn(name = "providerId")
    private Providers provider;
    
   
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
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price_buy
     */
    public int getPrice_buy() {
        return price_buy;
    }

    /**
     * @param price_buy the price_buy to set
     */
    public void setPrice_buy(int price_buy) {
        this.price_buy = price_buy;
    }

    /**
     * @return the price_Payd
     */
    public int getPrice_Payd() {
        return price_Payd;
    }

    /**
     * @param price_Payd the price_Payd to set
     */
    public void setPrice_Payd(int price_Payd) {
        this.price_Payd = price_Payd;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the createdAt
     */
    public LocalDate getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the grosso
     */
    public int getGrosso() {
        return grosso;
    }

    /**
     * @param grosso the grosso to set
     */
    public void setGrosso(int grosso) {
        this.grosso = grosso;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the expiress
     */
    public LocalDate getExpiress() {
        return expiress;
    }

    /**
     * @param expiress the expiress to set
     */
    public void setExpiress(LocalDate expiress) {
        this.expiress = expiress;
    }

    /**
     * @return the Reference
     */
    public String getReference() {
        return Reference;
    }

    /**
     * @param Reference the Reference to set
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * @return the stockBreack
     */
    public int getStockBreack() {
        return stockBreack;
    }

    /**
     * @param stockBreack the stockBreack to set
     */
    public void setStockBreack(int stockBreack) {
        this.stockBreack = stockBreack;
    }

    /**
     * @return the provider
     */
    public Providers getProvider() {
        return provider;
    }

    /**
     * @param provider the provider to set
     */
    public void setProvider(Providers provider) {
        this.provider = provider;
    }

    /**
     * @return the productId
     */
    public UUID getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
