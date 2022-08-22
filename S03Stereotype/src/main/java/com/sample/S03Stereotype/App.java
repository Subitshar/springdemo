package com.sample.S03Stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.S03Stereotype.model.Instructor;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/sample/S03Stereotype/SpringConfig.xml");

		Instructor inst = (Instructor) springContainer.getBean("inst");
		System.out.println(inst);

	}
}
