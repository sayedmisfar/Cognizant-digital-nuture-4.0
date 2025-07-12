package com.cognizant.springlearn.service;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import com.cognizant.springlearn.model.Country;

@Service
public class CountryService {

    public Country getCountry(String code) {
        BeanFactory factory = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = (List<Country>) factory.getBean("countryList");
        return countries.stream()
            .filter(c -> c.getCode().equalsIgnoreCase(code))
            .findFirst()
            .orElse(null);
    }
}
