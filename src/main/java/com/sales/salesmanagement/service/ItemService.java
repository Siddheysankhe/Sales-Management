package com.sales.salesmanagement.service;

import com.sales.salesmanagement.entities.Item;
import com.sales.salesmanagement.repos.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired ItemRepository itemRepository;

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }
}
