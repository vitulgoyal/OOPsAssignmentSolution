package com.gl.classes;

import com.gl.constants.Constants;

public class HRDepartment extends SuperDepartment{
	
	
	public String getDepartmentName() {
		return Constants.HR_Department.toString();
	}
	
	public String getTodaysWork() {
		return Constants.Fill_Worksheet.toString();
	}
	
	public String getWorkDeadline() {
		return Constants.Complete_By_EOD.toString();
	}
	
	public String doActivity() {
		return Constants.Team_Lunch.toString();
	}
	

}
