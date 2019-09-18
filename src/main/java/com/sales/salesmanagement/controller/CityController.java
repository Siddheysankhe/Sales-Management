package com.sales.salesmanagement.controller;

import com.sales.salesmanagement.entities.City;
import com.sales.salesmanagement.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired CityService cityService;

    @PostMapping("/add")
    public City addCity(@RequestBody final City city){
        return cityService.addCity(city);
    }
}
