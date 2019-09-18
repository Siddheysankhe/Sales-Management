package com.sales.salesmanagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer itemId;

    private Integer storeId;

    private Double stockSold;

    private Double stockAvailable;

    public Sales(Integer id, Integer itemId, Integer storeId, Double stockSold, Double stockAvailable) {
        this.id = id;
        this.itemId = itemId;
        this.storeId = storeId;
        this.stockSold = stockSold;
        this.stockAvailable = stockAvailable;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Double getStockSold() {
        return stockSold;
    }

    public void setStockSold(Double stockSold) {
        this.stockSold = stockSold;
    }

    public Double getStockAvailable() {
        return stockAvailable;
    }

    public void setStockAvailable(Double stockAvailable) {
        this.stockAvailable = stockAvailable;
    }
}
