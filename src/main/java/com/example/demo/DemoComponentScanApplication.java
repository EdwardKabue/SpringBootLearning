package com.example.demo;

import com.example.componentscan.ComponentDAO;
import com.example.demo.basic.BinarySearchImpl;
import com.example.demo.scope.PersonDAO;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@ComponentScan("com.example.componentscan")
public class DemoComponentScanApplication {
	//Important questions to ask with Spring boot:
	//1. What are the beans?
	//2. What are the dependencies of a bean?
	//3. Where to search for beans? No need to define this. Package will be searched for.

	private static Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm()); //'QuickSortAlgorithm' is a dependency of the binary search.

		//Spring application context maintains all the beans.
//		ApplicationContext applicationContext = SpringApplication.run(DemoComponentScanApplication.class, args);
//		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
//
//
//		LOGGER.info("{}", componentDAO);

	}

}
