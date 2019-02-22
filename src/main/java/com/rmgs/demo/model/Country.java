package com.rmgs.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>
 * Title: Country.java
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
 * @author <a href="mailto:ehabkamil2@gmail.com">Ehab kamil</a>
 * @version 1.0
 * @date 22/02/2019
 */

@Entity @Table(name = "COUNTRY") public class Country {


	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="COUNTRY_ID")
	private int id;

	@Column(name="NAME")
	private String name;

	@Column(name="CONTINENT")
	private String continent;

	@Column(name="POPULATION")
	private int population;

	@Column(name="LIFE_EXPECTANCY")
	private int lifeExpectancy;

	@Column(name="COUNTRY_LANGUAGE")
	private String CountryLanguage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public String getCountryLanguage() {
		return CountryLanguage;
	}

	public void setCountryLanguage(String countryLanguage) {
		CountryLanguage = countryLanguage;
	}

}
