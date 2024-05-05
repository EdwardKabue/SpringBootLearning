package com.example.demo;

import com.example.demo.basic.BinarySearchImpl;
import com.example.demo.scope.PersonDAO;
import com.example.demo.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoXMLContextApplication {
	//Important questions to ask with Spring boot:
	//1. What are the beans?
	//2. What are the dependencies of a bean?
	//3. Where to search for beans? No need to define this. Package will be searched for.

	private static Logger LOGGER = LoggerFactory.getLogger(DemoXMLContextApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm()); //'QuickSortAlgorithm' is a dependency of the binary search.

		//Spring application context maintains all the beans.
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); //Creates the application context for plain Spring.
				//SpringApplication.run(DemoApplication.class, args);
		LOGGER.info("Beans loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

		XMLPersonDAO personDao = applicationContext.getBean(XMLPersonDAO.class);
		System.out.println(personDao);
		System.out.println(personDao.getXMLJdbcConnection());
//		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

//		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class); //All the beans and their dependencies are managed by Spring.
//		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

//		System.out.println(binarySearch);
//		System.out.println(binarySearch1);
//
//		int result = binarySearch.binarySearch(new int[] {12,4,5}, 5);
//		System.out.println(result);

        applicationContext.close(); //close the plain Spring application context.

//		LOGGER.info("{}", personDao);
//		LOGGER.info("{}", personDao.getJdbcConnection());

//		LOGGER.info("{}", personDao2);
//		LOGGER.info("{}", personDao.getJdbcConnection());

	}

}
