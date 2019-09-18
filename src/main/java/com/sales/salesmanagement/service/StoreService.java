package com.sales.salesmanagement.service;

import com.sales.salesmanagement.entities.Store;
import com.sales.salesmanagement.repos.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    @Autowired StoreRepository storeRepository;

    public Store addStore(Store store) {
        return storeRepository.save(store);
    }
}
