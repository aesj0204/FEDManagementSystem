package food;

import java.util.Calendar;

public class DdayConverter {
	int year, month, day;
	
	public DdayConverter(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
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
