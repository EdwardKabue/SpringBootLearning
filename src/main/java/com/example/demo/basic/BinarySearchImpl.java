package com.example.demo.basic;

//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



//@Component marks a class a bean for Spring boot
//@Scope determines the scope of a bean. Can be either singleton, prototype, request or session.
@Component
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Better way of defining a bean's scope.
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //@Autowired marks a class as a dependency for Spring boot.
    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    //    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
//        super();
//        this.sortAlgorithm = sortAlgorithm;
//    }


    public int binarySearch(int [] numbers, int numberToSearchFor){
        int[] sortedNumbers = sortAlgorithm.sort(numbers); //The interface 'SortAlgorithm' has made it possible to loosely couple the sorting functionality.
        System.out.println(sortAlgorithm);

        return 3;
    }

//    @PostConstruct
//    public void postConstruct(){
//        logger.info("postConstruct");
//    }
//
//    @PreDestroy
//    public void preDestroy(){
//        logger.info("preDestroy");
//    }
}
