package com.bjb.personal.upskill.java8.stream;

import java.util.stream.Stream;

import com.bjb.personal.upskill.java8.stream.model.Employee;

public class StreamEx2_StreamCreation_of {
	public static void main(String[] args) {
		Stream<Employee> streamOfEmployee = Stream.of(new Employee("Bijo","Jacob"),new Employee("Arun","VBN"),new Employee("Karthik","Ramamorthy"));
		streamOfEmployee.forEach(System.out::println);
	}
}


