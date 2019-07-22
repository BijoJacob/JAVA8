package com.bjb.personal.upskill.java8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Ex. Stream Creation Example with Arrays.stream()
 */

public class StreamEx1_StreamCreation_Array {

	public static void main(String[] args) {
		String[] names = new String[] { "Bijo", "Arun", "Joshi", "Karthik" };
		Stream<String> streamOfNames = Arrays.stream(names);
		streamOfNames.forEach(System.out::println);

	}

}
