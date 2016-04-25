package com.example.java.comparable;

import java.util.Comparator;

public class ExampleDTO implements Comparable<ExampleDTO>, Comparator<ExampleDTO>{
	private Integer id;
	private String name;
	
	public ExampleDTO() {}

	public ExampleDTO(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(ExampleDTO o) {
		return id.compareTo(o.id);
	}

	@Override
	public int compare(ExampleDTO o1, ExampleDTO o2) {
		return o1.id.compareTo(o2.id);
	}

	@Override
	public String toString() {
		return "ExampleDTO [id=" + id + ", name=" + name + "]";
	}
	
}
