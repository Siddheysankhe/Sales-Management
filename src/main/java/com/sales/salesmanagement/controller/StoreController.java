package com.sales.salesmanagement.controller;

import com.sales.salesmanagement.entities.Store;
import com.sales.salesmanagement.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired StoreService storeService;

    @PostMapping("/add")
    public Store addStore(@RequestBody Store store) {
        return storeService.addStore(store);
    }
}
