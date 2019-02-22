package com.rmgs.demo.repositories;

import com.rmgs.demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Title: CountryRepo.java
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
@Repository
public interface CountryRepo extends JpaRepository<Country, Integer> {


	@Query("SELECT country FROM Country country WHERE " +
			"country.name =:countryName ")
	public Country findByName(String countryName);

}
