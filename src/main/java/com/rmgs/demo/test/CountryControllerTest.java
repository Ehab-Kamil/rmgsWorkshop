package com.rmgs.demo.test;

import com.rmgs.demo.controllers.CountryController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <p>
 * Title: CountryControllerTest.java
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
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CountryControllerTest {

	@Autowired
	CountryController countryController;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void contextLoaded() throws Exception {
		assertThat(countryController).isNotNull();
	}

	@Test
	public void verfiyCountryDoNotExist() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:8080/"+"ASDASD", String.class)).contains(Constants.INVALID_COUNTRY_CODE);
	}

	public CountryController getCountryController() {
		return countryController;
	}

	public void setCountryController(CountryController countryController) {
		this.countryController = countryController;
	}
}
