package com.rmgs.demo.controllers;

import com.rmgs.demo.model.Country;
import com.rmgs.demo.repositories.CountryRepo;
import com.rmgs.demo.test.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Title: CountryController.java
 * </p>
 *
 * <p>
 * Description:
 * </p>
 *
 * <p>
 * Copyright: Copyright(c) Ehab Kamil, 2019
 * </p>
 *
 * @author <a href="mailto:ehabkamil2@gmail.com">Ehab Kamil</a>
 * @version 1.0
 * @date 22/02/2019
 */
@RestController
public class CountryController {

	@Autowired private CountryRepo countryRepo;

	@RequestMapping(value = "/{countryName}", method = RequestMethod.GET)
	public Object getCountry(@PathVariable String countryName) throws Exception {
		Country returneCountry = getCountryRepo().findByName(countryName);
		if (returneCountry != null) {
			return getCountryRepo().findByName(countryName);
		} else {
			return Constants.INVALID_COUNTRY_CODE;
		}

	}

	public CountryRepo getCountryRepo() {
		return countryRepo;
	}

	public void setCountryRepo(CountryRepo countryRepo) {
		this.countryRepo = countryRepo;
	}
}
