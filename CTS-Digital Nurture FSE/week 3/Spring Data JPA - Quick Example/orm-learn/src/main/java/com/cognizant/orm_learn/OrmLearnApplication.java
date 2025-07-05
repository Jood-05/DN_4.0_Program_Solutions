

package com.cognizant.orm_learn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    // 🔧 Logger for debug/info logs
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    // 🔧 Static reference to service
    private static CountryService countryService;

    public static void main(String[] args) {
        LOGGER.info("Start of Main");

        // 🚀 Start Spring context and get service bean
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        // ✅ Call test method
        testGetAllCountries();

        LOGGER.info("End of Main");
    }

    // 📦 Test method to call service
    private static void testGetAllCountries() {
        LOGGER.info("Start testGetAllCountries");

        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);

        LOGGER.info("End testGetAllCountries");
    }
}
