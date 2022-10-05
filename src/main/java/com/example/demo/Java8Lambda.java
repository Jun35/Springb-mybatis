package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class Java8Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		features.forEach(n -> System.out.println(n));
	}

}
