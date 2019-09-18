package com.sales.salesmanagement.models;

public class SalesDto {

    private Integer id;
    private Integer itemId;
    private String itemName;
    private Integer storeId;
    private String storeName;
    private Integer cityId;
    private String cityName;
    private Integer stateId;
    private String stateName;
    private Double stockSold;
    private Double stockLeft;

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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Double getStockSold() {
        return stockSold;
    }

    public void setStockSold(Double stockSold) {
        this.stockSold = stockSold;
    }

    public Double getStockLeft() {
        return stockLeft;
    }

    public void setStockLeft(Double stockLeft) {
        this.stockLeft = stockLeft;
    }
}
