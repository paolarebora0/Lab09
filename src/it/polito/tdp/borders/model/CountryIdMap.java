package it.polito.tdp.borders.model;

import java.util.HashMap;
import java.util.Map;

public class CountryIdMap {

	private Map<Integer, Country> map;
	
	public CountryIdMap() {
		map = new HashMap<Integer, Country>();
	}

	public Country get(int cCode) {
		return map.get(cCode);
	}
	
	public Country get(Country country) {
		return country;
	}
	
}
