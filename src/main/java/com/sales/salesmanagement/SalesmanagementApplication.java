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

    public static void main(String[] args) {
        SpringApplication.run(SalesmanagementApplication.class, args);
    }

}
