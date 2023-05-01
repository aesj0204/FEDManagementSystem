package food;

import java.util.Scanner;

public class Food {

	protected FoodKind kind = FoodKind.EdSpecified;
	protected String foodname;
	protected String foodcategory;
	protected String location;
	protected String expirydate;
	protected String foodimage;
	protected String note;
	protected int dDay;
	
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
		DdayConverter dday = new DdayConverter(Integer.parseInt(expirydate_1[0]), Integer.parseInt(expirydate_1[1]), Integer.parseInt(expirydate_1[2]));
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
	
	public FoodKind getKind() {
		return kind;
	}

	public void setKind(FoodKind kind) {
		this.kind = kind;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getFoodcategory() {
		return foodcategory;
	}

	public void setFoodcategory(String foodcategory) {
		this.foodcategory = foodcategory;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public String getFoodimage() {
		return foodimage;
	}

	public void setFoodimage(String foodimage) {
		this.foodimage = foodimage;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getdDay() {
		return dDay;
	}

	public void setdDay(int dDay) {
		this.dDay = dDay;
	}
	
	public void printInfo() {
		System.out.println("Food Name: " + this.foodname + " Food Category: " + this.foodcategory + " Location: " + this.location + " Expiry Date: " + this.expirydate + " Food Image: " + this.foodimage + " Note: " + this.note + " D-Day: " + DDAY());
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Food Name: ");
		String foodname = input.next();
		this.setFoodname(foodname);
		
		System.out.print("Food Category: ");
		String foodcategory = input.next();
		this.setFoodcategory(foodcategory);
		
		System.out.print("Location: ");
		String location = input.next();
		this.setLocation(location);
		
		System.out.print("Expiry Date: ");
		String expirydate = input.next();
		this.setExpirydate(expirydate);
		
		System.out.print("Food Image: ");
		String foodimage = input.next();
		this.setFoodimage(foodimage);
		
		input.nextLine();
		
		System.out.print("Note: ");
		String note = input.nextLine();
		this.setNote(note);
	}

}
