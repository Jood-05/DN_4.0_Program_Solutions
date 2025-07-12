package com.cognizant.spring2.config;


import com.cognizant.spring2.model.Country;
import com.cognizant.spring2.model.CountryList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.core.io.ClassPathResource;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBContext;
import java.util.List;

@Configuration
public class CountryConfig {

	@Bean
	public List<Country> countryList() throws Exception {
	    JAXBContext context = JAXBContext.newInstance(CountryList.class);
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    CountryList list = (CountryList) unmarshaller.unmarshal(
	        new ClassPathResource("country.xml").getInputStream()
	    );
	    return list.getCountries();
	}
}
