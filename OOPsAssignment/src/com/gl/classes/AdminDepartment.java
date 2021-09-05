package com.gl.classes;

import com.gl.constants.Constants;

public class AdminDepartment extends SuperDepartment {
	
	
	public String getDepartmentName() {
		return Constants.Admin_Department.toString();
		
	}
	
	public String getTodaysWork() {
		return Constants.Doc_Submission.toString();
	}
	
	public String getWorkDeadline() {
		return Constants.Complete_By_EOD.toString();
	}

}
