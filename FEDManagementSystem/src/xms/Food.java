package xms;

public class Food {
	
	String foodname;
	String foodcategory;
	String location;
	String expirydate;
	String foodimage;
	String note;
	int dDay;
	
	public Food() {
	}
	
	public Food(String foodname, String foodcategory, String location, String expirydate, String foodimage) {
		this.foodname = foodname;
		this.foodcategory = foodcategory;
		this.location = location;
		this.expirydate = expirydate;
		this.foodimage = foodimage;
		
	}
	
	public Food(String foodname, String foodcategory, String location, String expirydate, String foodimage, String note) {
		this.foodname = foodname;
		this.foodcategory = foodcategory;
		this.location = location;
		this.expirydate = expirydate;
		this.foodimage = foodimage;
		this.note = note;
	}
	
	public String DDAY() {
		String[] expirydate_1 = expirydate.split("/");
		DdayConverter dday = new DdayConverter(expirydate_1[0], expirydate_1[1], expirydate_1[2]);
		dDay = dday.getDDay();
		if(dDay == 0) {
			return "D-Day";
		}
		else if(dDay > 0) {
			return "D-" + dDay;
		}
		else {
			return "D+" +Math.abs(dDay);
		}
	}
	
	public void printInfo() {
		System.out.println("foodname: " + this.foodname + " foodcategory: " + this.foodcategory + " location: " + this.location + " expirydate: " + this.expirydate + " foodimage: " + this.foodimage + " note: " + this.note + " D-Day: " + DDAY());
	}

}
