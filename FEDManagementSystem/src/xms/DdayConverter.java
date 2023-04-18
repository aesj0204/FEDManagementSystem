package xms;

import java.util.Calendar;

public class DdayConverter {
	int year, month, day;
	
	DdayConverter(String year, String month, String day){
		this.year = Integer.parseInt(year);
		this.month = Integer.parseInt(month);
		this.day = Integer.parseInt(day);
	}
	
	public int getDDay() {
		Calendar today = Calendar.getInstance();
		Calendar d_day = Calendar.getInstance();
		d_day.set(this.year,  this.month-1, this.day);
		
		long l_dday = d_day.getTimeInMillis()/(24 * 60 * 60 * 1000);
		long l_today = today.getTimeInMillis()/(24 * 60 * 60 * 1000);
		
		long substract = l_dday - l_today;
		return (int)substract;
	}
	
}
