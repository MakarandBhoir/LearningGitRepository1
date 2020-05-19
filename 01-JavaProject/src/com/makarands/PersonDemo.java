package com.makarands;

public class PersonDemo {
	public static void main(String[] args) {
		Person ram = new Person("Ram", 36, 70.5);
		System.out.println("Name: "+ram.getPersonName());
		System.out.println("Score: "+ram.getPersonScore());
	}
}