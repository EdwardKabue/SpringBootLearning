package com.example.demo;

import com.example.demo.basic.BinarySearchImpl;
import com.example.demo.properties.SomeExternalService;
import com.example.demo.scope.PersonDAO;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//Load the properties file reference
@PropertySource("classpath:app.properties")
public class DemoApplicationProperties {
	//Important questions to ask with Spring boot:
	//1. What are the beans?
	//2. What are the dependencies of a bean?
	//3. Where to search for beans? No need to define this. Package will be searched for.

	private static Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm()); //'QuickSortAlgorithm' is a dependency of the binary search.

		//Spring application context maintains all the beans.
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoApplication.class); //Creates the application context for plain Spring.
				//SpringApplication.run(DemoApplication.class, args);
		//PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
//		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
//		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class); //All the beans and their dependencies are managed by Spring.
//		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(service.returnServiceURL());

        applicationContext.close(); //close the plain Spring application context.
	}

}
