package com.gl.main;

import com.gl.classes.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AdminDepartment adminDept = new AdminDepartment();
		System.out.println("\nWelcome to " + adminDept.getDepartmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		
		
		HRDepartment hrDept = new HRDepartment();
		System.out.println("\nWelcome to " + hrDept.getDepartmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());
		
		
		
		TechDepartment techDept = new TechDepartment();
		System.out.println("\nWelcome to " + techDept.getDepartmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());

	}

}
