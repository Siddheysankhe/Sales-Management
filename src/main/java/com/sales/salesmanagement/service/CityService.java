package com.sales.salesmanagement.service;

import com.sales.salesmanagement.entities.City;
import com.sales.salesmanagement.repos.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired CityRepository cityRepository;

    public City addCity(final City city) {
        return cityRepository.save(city);
    }
}
