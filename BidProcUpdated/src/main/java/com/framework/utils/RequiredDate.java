package com.framework.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class RequiredDate {
	public static String calcReqDate(int days) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		//Getting current date
		Calendar cal = Calendar.getInstance();
		//Displaying current date in the desired format
		System.out.println("Current Date: "+sdf.format(cal.getTime()));
		   
		//Number of Days to add
	     cal.add(Calendar.DAY_OF_MONTH, days);  
		//Date after adding the days to the current date
		String newDate = sdf.format(cal.getTime());  
		//Displaying the new Date after addition of Days to current date
		System.out.println("Date after Addition: "+newDate);
		
		return newDate;
	}

}
