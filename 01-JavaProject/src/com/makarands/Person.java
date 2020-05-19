package com.makarands;

public class Person {
	private String personName;
	private Integer personAge;
	private Double personScore;
	
	public Person() {}
	public Person(String personName, Integer personAge, Double personScore) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personScore = personScore;
	}
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Integer getPersonAge() {
		return personAge;
	}
	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}
	public Double getPersonScore() {
		return personScore;
	}
	public void setPersonScore(Double personScore) {
		this.personScore = personScore;
	}
}
