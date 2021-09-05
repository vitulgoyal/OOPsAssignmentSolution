package com.gl.classes;

import com.gl.constants.Constants;

public class SuperDepartment {
	
	public String getDepartmentName() {
		return Constants.Super_Department.toString();
	}
	
	public String getTodaysWork() {
		return Constants.NO_Work.toString();
	}
	
	public String getWorkDeadline() {
		return Constants.NIL.toString();
	}
	
	public String isTodayAHoliday() {
		return Constants.NO_Holiday.toString();
	}
	

}
