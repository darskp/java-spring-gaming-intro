package com.example.demo.springintro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
};

//Address - firstLine & city
record Address(String VillageName, String city) {
};

record PersonFulldetails(Person Person, Address Address, String emailId) {
};

@Configuration
public class HelloWorldConfig {

	@Bean
	public String name() {
		return "Darshan";
	}

	@Bean
	public int age() {
		return 20;
	}

	// custom object
	@Bean
	public Person Person() {
		Person p1 = new Person("Darshan", 21);
		return p1;
	}

	@Bean
	public Address myAddress() {
		return new Address("H", "K");
	}

	@Bean
	public Person Person1() {
		return new Person(name(), age());
	}

	// adding bean names in parameter - to creating new bean using other existing
	// beans which are managed by spring frame work
	@Bean
	public Person Person2(String name, int age) {
		return new Person(name, age);
	}

	@Bean(name = "retrivePersondetails") // change default bean name
	public PersonFulldetails PersonFulldetails1() {
		return new PersonFulldetails(Person1(), new Address("H", "K"), "Dk@gmail.com");
	}

}
