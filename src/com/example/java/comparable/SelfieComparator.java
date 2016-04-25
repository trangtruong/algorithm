package com.example.java.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelfieComparator {
	public static void main(String[] args) {
		List<ExampleDTO> lists = Arrays.asList(new ExampleDTO(1, "name1"), new ExampleDTO(3, "name3"), new ExampleDTO(2, "name2"));
		
		Collections.sort(lists, new ExampleDTO());
		
		for(ExampleDTO dto : lists) {
			System.out.println(dto.toString());
		}
	}
}
