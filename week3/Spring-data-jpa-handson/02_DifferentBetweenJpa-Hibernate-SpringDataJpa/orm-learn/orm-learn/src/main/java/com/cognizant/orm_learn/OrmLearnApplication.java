package com.cognizant.orm_learn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryRepository countryRepository;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnApplication.class, args);

        countryRepository =
                context.getBean(CountryRepository.class);

        testSearchCountry();

        testSearchCountryStartingWith();
    }
    private static void testSearchCountry() {

        List<Country> countryList =
                countryRepository
                        .findByNameContainingOrderByNameAsc("ou");

        for (Country country : countryList) {
            System.out.println(country);
        }
    }


//    private static void testSearchCountry() {
//
//        LOGGER.info("Start");
//
//        List<Country> countryList =
//                countryRepository
//                        .findByNameContainingOrderByNameAsc("ou");
//
//        for (Country country : countryList) {
//            LOGGER.info("Country: {}", country);
//        }
//
//        LOGGER.info("End");
//    }

    private static void testSearchCountryStartingWith() {

        LOGGER.info("Start");

        List<Country> countryList =
                countryRepository
                        .findByNameStartingWith("Z");

        for (Country country : countryList) {
            LOGGER.info("Country: {}", country);
        }

        LOGGER.info("End");
    }
}