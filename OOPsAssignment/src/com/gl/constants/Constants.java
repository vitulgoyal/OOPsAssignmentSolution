package com.gl.constants;

public enum Constants {
	
	Super_Department("Super Department"),
	Admin_Department("Admin Department"),
	HR_Department("HR Department"),
	Tech_Department("Tech Department"),
	NO_Work("No Work as of now"),
	NO_Holiday("Today is not a holiday"),
	Doc_Submission("Complete your documents Submission"),
	Complete_By_EOD("Complete by EOD"),
	Fill_Worksheet("Fill today’s worksheet and mark your attendance"),
	Team_Lunch("Team Lunch"),
	NIL("nil"),
	Complete_Coding("Complete coding of module 1"),
	Core_Java("Core Java");
		
	private final String text;

    /**
     * @param text
     */
    Constants(final String text) {
        this.text = text;
    }

    
    @Override
    public String toString() {
		return text;
    }

}
