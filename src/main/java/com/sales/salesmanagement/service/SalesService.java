package com.sales.salesmanagement.service;

import com.sales.salesmanagement.SalesmanagementApplication;
import com.sales.salesmanagement.entities.City;
import com.sales.salesmanagement.entities.Item;
import com.sales.salesmanagement.entities.Sales;
import com.sales.salesmanagement.entities.Store;
import com.sales.salesmanagement.models.SalesDto;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class SalesService {

    Map<Integer, Store> storeMap = SalesmanagementApplication.storeMap;
    Map<Integer, Item> itemMap = SalesmanagementApplication.itemMap;
    Map<Integer, City> cityMap = SalesmanagementApplication.cityMap;
    
    public List<SalesDto> getSalesByStore(Integer storeId) {
        List<Sales> salesList = SalesmanagementApplication.sales.stream().filter(sales ->  sales.getStoreId().equals(storeId) ).collect(Collectors.toList());

        List<SalesDto> salesDtoList = new ArrayList<>();
        for (Sales sale : salesList) {
            SalesDto salesDto = new SalesDto();
            salesDto.setId(sale.getId());
            salesDto.setItemId(sale.getItemId());
            salesDto.setItemName(itemMap.get(sale.getItemId()).getName());
            salesDto.setStoreId(sale.getStoreId());
            salesDto.setStoreName(storeMap.get(sale.getStoreId()).getName());
            salesDto.setStockSold(sale.getStockSold());
            salesDto.setStockLeft(sale.getStockAvailable());

            salesDtoList.add(salesDto);
        }
        return salesDtoList;
    }

    public List<SalesDto> getSalesByCity(Integer cityId) {
        List<Sales> salesList = SalesmanagementApplication.sales;
        return null;
    }

    public List<SalesDto> getSalesByState(Integer stateId) {
        return null;
    }

    public List<SalesDto> getSalesByCountry() {
        return null;
    }
}
