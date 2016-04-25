package com.algorithm.demo.employee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindBoss {
	public static void main(String[] args) {
		Employee.EmployeeBuilder builder = new Employee.EmployeeBuilder();
		List<Employee> bosses = builder.buildBossDefaults();//assumtion
		
		Map<Integer, List<Employee>> result = new HashMap<>();
		
		//Find 2 employees that has same boss.
		int index = 1;
		for (Employee boss : bosses) {
			List<Employee> employees = builder.buildDefaults(boss.getId());
			
			for (int i = 0; i < employees.size()-1; i++) { //combination
				for (int j = i+1; j < employees.size(); j++) {
					result.put(index, Arrays.asList(employees.get(i), employees.get(j)));
					index++;
				}
			}
		}
		
		for (Map.Entry<Integer, List<Employee>> rest : result.entrySet()) {
			System.out.print(rest.getKey() + ":");
			
			for (Employee combine : rest.getValue()) {
				System.out.print(combine.getId());
			}
			System.out.println("");
		}
	}
}
