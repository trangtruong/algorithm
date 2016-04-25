package com.algorithm.demo.employee;

import java.util.Arrays;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private int boss;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee() {}
	public Employee(Integer id, String name, int boss) {
		this.id = id;
		this.name = name;
		this.boss = boss;
	}
	
	public static class EmployeeBuilder {
		private int id;
		private String name;
		private int boss;
		public EmployeeBuilder id(int id) {
			this.id = id;
			return this;
		}
		public EmployeeBuilder name(String name) {
			this.name = name;
			return this;
		}
		public EmployeeBuilder boss(int boss) {
			this.boss = boss;
			return this;
		}
		
		public Employee build() {
			return new Employee(id, name, boss); 
		}
		
		public List<Employee> buildBossDefaults() {
			return Arrays.asList(new Employee(2, "A", 0), new Employee(3, "B", 0));
		}
		
		public List<Employee> buildDefaults() {
			return Arrays.asList(new Employee(4, "C", 2), new Employee(5, "D", 2) , new Employee(6, "E", 3), new Employee(7, "F", 3), new Employee(8, "G", 3));
		}
		
		public List<Employee> buildDefaults(int boss) {
			if (boss == 2) {
				return Arrays.asList(new Employee(4, "C", 2), new Employee(5, "D", 2));
			}
			else {
				return Arrays.asList(new Employee(6, "E", 3), new Employee(7, "F", 3), new Employee(8, "G", 3));
			}
		}
	}
}
