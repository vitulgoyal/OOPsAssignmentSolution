package com.gl.classes;

import com.gl.constants.Constants;

public class TechDepartment extends SuperDepartment {
	
	
	public String getDepartmentName() {
		return Constants.Tech_Department.toString();
	}
	
	public String getTodaysWork() {
		return Constants.Complete_Coding.toString();
	}
	
	public String getWorkDeadline() {
		return Constants.Complete_By_EOD.toString();
	}
	
	public String getTechStackInformation() {
		return Constants.Core_Java.toString();
	}

}
