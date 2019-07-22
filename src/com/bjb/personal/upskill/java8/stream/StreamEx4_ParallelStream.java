package com.bjb.personal.upskill.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx4_ParallelStream {
	public static void main(String[] args) {
		List<String> listOfNames = Arrays.asList("Bijo", "Arun", "Joshi", "Karthik");
		listOfNames.parallelStream().forEach(System.out::println);
	}
}
