package com.framework.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TryDate {
	
	public static void main(String[] args) throws ParseException {
		
		String dt = "2021-01-01";  // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		
		Date date = new Date();
		int date2 = date.getDate();
		
//		Calendar currentDate = Calendar.getInstance();
//		currentDate.setTime(sdf.parse(dt));
//		currentDate.add(Calendar.DATE, 2);  // number of days to add
//		dt = sdf.format(currentDate);  // dt is now the new date
		
		System.out.println(date2);
		
	}

}
