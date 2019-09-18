package com.sales.salesmanagement;

import com.sales.salesmanagement.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SalesmanagementApplication {

    public static final Map<Integer, State> stateMap = new HashMap<>();
    public static final Map<Integer, City> cityMap = new HashMap<>();
    public static final Map<Integer, Store> storeMap = new HashMap<>();
    public static final Map<Integer, Item> itemMap = new HashMap<>();
    public static final List<Sales> sales = new ArrayList<>();
    public static final List<Price> prices = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(SalesmanagementApplication.class, args);
    }

    @PostConstruct
    public void init() {
//        stateMap.put(1, new State(1, "Maharashtra"));
//        stateMap.put(2, new State(2, "Karnataka"));
//        stateMap.put(3, new State(3, "Andhra Pradesh"));
//        stateMap.put(4, new State(4, "Goa"));
//
//        cityMap.put(1, new City(1, "Mumbai", 1));
//        cityMap.put(2, new City(2, "Pune", 1));
//        cityMap.put(3, new City(3, "Nagpur", 1));
//        cityMap.put(4, new City(4, "Bangalore", 2));
//        cityMap.put(5, new City(5, "Mysore", 2));
//        cityMap.put(6, new City(6, "Hyderabad", 3));
//
//        storeMap.put(1, new Store(1, "Andheri(W)", "Andheri(W)", 1));
//        storeMap.put(2, new Store(2, "CSMT", "CSMT", 1));
//        storeMap.put(3, new Store(3, "Virar", "Virar", 1));
//        storeMap.put(4, new Store(4, "Bandra", "Bandra", 1));
//        storeMap.put(5, new Store(5, "Hinjewadi", "Hinjewadi", 2));
//        storeMap.put(6, new Store(6, "Kharadi", "Kharadi", 2));
//        storeMap.put(7, new Store(7, "Magarpatta", "Magarpatta", 2));
//        storeMap.put(8, new Store(8, "Ambazari", "Ambazari", 3));
//        storeMap.put(9, new Store(9, "Futala", "Futala", 3));
//        storeMap.put(10, new Store(10, "HSR", "HSR", 4));
//        storeMap.put(11, new Store(11, "Indiranagar", "Indiranagar", 4));
//        storeMap.put(12, new Store(12, "Koramangala", "Koramangala", 4));
//        storeMap.put(13, new Store(13, "Bellandur", "Bellandur", 4));
//        storeMap.put(14, new Store(14, "Palace", "Palace", 5));
//        storeMap.put(15, new Store(15, "Hill View", "Hill View", 5));
//        storeMap.put(16, new Store(16, "Gachiobowli", "Gachiobowli", 6));
//        storeMap.put(17, new Store(17, "Cyber City", "Cyber City", 6));
//
//        itemMap.put(1, new Item(1, "Sandwich", ItemType.FOOD));
//        itemMap.put(2, new Item(2, "Poha", ItemType.FOOD));
//        itemMap.put(3, new Item(3, "Vada Pav", ItemType.FOOD));
//        itemMap.put(4, new Item(4, "Burger", ItemType.FOOD));
//        itemMap.put(5, new Item(5, "Tea", ItemType.BEVERAGE));
//        itemMap.put(6, new Item(6, "Coffee", ItemType.BEVERAGE));
//        itemMap.put(7, new Item(7, "Bottled water", ItemType.BEVERAGE));
//
//        Integer id = 1;
//        for (Integer cityId : cityMap.keySet()) {
//            for (Integer itemId : itemMap.keySet()) {
//                prices.add(new Price(id, itemId, cityId, 100.0));
//                id++;
//            }
//        }
//
//        id = 1;
//        for (Integer storeId : storeMap.keySet()) {
//            for (Integer itemId : itemMap.keySet()) {
//                sales.add(new Sales(id, itemId, storeId, 0.0, 10.0));
//                id++;
//            }
//        }
//        System.out.println("Data created");
    }
}
