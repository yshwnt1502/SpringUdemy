package com.yashwant.springmvcpractise;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;
	private int age;
	private String relation;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favouriteLang;
	private LinkedHashMap<String, String> favLang;
	private String[] operatingSystem;

	public Person() {
		super();
		countryOptions = new LinkedHashMap<>();
		favLang = new LinkedHashMap<>();
		favLang.put("Java", "Java");
		favLang.put("C++", "C++");
		favLang.put("Python", "Python");
		favLang.put("Angular Js", "Angular Js");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IN", "India");
		countryOptions.put("DN", "Denmark");
		countryOptions.put("CH", "China");
		countryOptions.put("US", "United States");

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String reltion) {
		this.relation = reltion;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public LinkedHashMap<String, String> getFavLang() {
		return favLang;
	}

//	public void setFavLang(List<String> favLang) {
//		this.favLang = favLang;
//	}

	public String getFavouriteLang() {
		return favouriteLang;
	}

	public void setFavouriteLang(String favouriteLang) {
		this.favouriteLang = favouriteLang;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
