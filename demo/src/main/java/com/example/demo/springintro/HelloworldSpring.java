package com.example.demo.springintro;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloworldSpring {

	public static void main(String[] args) {

		// Launch a Spring context - configure the things that we want Spring to manage
		var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		// Retrieve the beans managed by Spring
		// bean name - Calling the name as an attribute - case sensitive
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("Person"));
		System.out.println(context.getBean("myAddress"));

		var arr = Arrays.stream(context.getBeanDefinitionNames());
		arr.forEach(System.out::println);

		// Calling the class name - better if we have only one custom object that class
		// defined in your Spring context - if we have multiple, it gives an exception -
		// multiple bean instances found
		// Bean Name Ambiguity
		System.out.println(context.getBean(Address.class));
//        System.out.println(context.getBean(Person.class));

		System.out.println("Person-1 " + context.getBean("Person1"));
		System.out.println("Person-2 " + context.getBean("Person2"));
		System.out.println(context.getBean("retrivePersondetails"));

	}
}
