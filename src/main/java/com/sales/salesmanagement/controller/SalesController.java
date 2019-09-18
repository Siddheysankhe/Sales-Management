package com.sales.salesmanagement.controller;

import com.sales.salesmanagement.entities.Sales;
import com.sales.salesmanagement.models.SalesDto;
import com.sales.salesmanagement.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired SalesService salesService;

    @GetMapping("/store/{storeId}")
    public List<SalesDto> getSalesByStore(@PathVariable("storeId") Integer storeId) {
        return salesService.getSalesByStore(storeId);
    }

    @GetMapping("/city/{cityId}")
    public List<SalesDto> getSalesByCity(@PathVariable("cityId") Integer cityId) {
        return salesService.getSalesByCity(cityId);
    }

    @GetMapping("/state/{stateId}")
    public List<SalesDto> getSalesByState(@PathVariable("stateId") Integer stateId) {
        return salesService.getSalesByState(stateId);
    }

    @GetMapping("/country")
    public List<SalesDto> getSalesByCountry() {
        return salesService.getSalesByCountry();
    }
}
