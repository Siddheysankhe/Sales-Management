package com.sales.salesmanagement.controller;

import com.sales.salesmanagement.entities.Item;
import com.sales.salesmanagement.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired ItemService itemService;

    @PostMapping("/add")
    public Item addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }
}
