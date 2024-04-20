package com.example.demo;

import com.example.componentscan.ComponentDAO;
import com.example.demo.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
public class DemoCDIApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(DemoCDIApplication.class);

    public static void main(String[] args) {
        //BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm()); //'QuickSortAlgorithm' is a dependency of the binary search.

        //Spring application context maintains all the beans.
//        ApplicationContext applicationContext = SpringApplication.run(DemoCDIApplication.class, args);
//        SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
//
//
//        LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
    }

}
