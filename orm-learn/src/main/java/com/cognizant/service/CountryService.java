package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.model.Country;
import com.cognizant.repository.CountryRepository;

@Service
public class CountryService {
	@Autowired
	CountryRepository countryRepository;

	@Transactional
	public List<Country> getAllCountries() {
		List<Country> findAll = new ArrayList<Country>();
		findAll = countryRepository.findAll();
		return findAll;
	}
}
