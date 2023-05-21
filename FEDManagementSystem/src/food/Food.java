package food;

import java.util.Scanner;

public abstract class Food implements FoodInput {

	protected FoodKind kind = FoodKind.EdSpecified;
	protected String name;
	protected String category;
	protected String location;
	protected String expirydate;
	protected String image;
	protected String note;
	protected int dDay;
	
	public Food() {
	}
	
	public Food(FoodKind kind) {
		this.kind = kind;
	}
	
	public Food(String name, String category, String location, String expirydate, String image) {
		this.name = name;
		this.category = category;
		this.location = location;
		this.expirydate = expirydate;
		this.image = image;
		
	}
	
	public Food(String name, String category, String location, String expirydate, String image, String note) {
		this.name = name;
		this.category = category;
		this.location = location;
		this.expirydate = expirydate;
		this.image = image;
		this.note = note;
	}
	
	public Food(FoodKind kind, String name, String category, String location, String expirydate, String image, String note) {
		this.kind = kind;
		this.name = name;
		this.category = category;
		this.location = location;
		this.expirydate = expirydate;
		this.image = image;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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
		//if()
		this.expirydate = expirydate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
	
	public abstract void printInfo();
	
	public void setFoodName(Scanner input) {
		System.out.print("Food Name: ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setFoodCategory(Scanner input) {
		System.out.print("Food Category: ");
		String category = input.next();
		this.setCategory(category);
	}
	
	public void setFoodLocation(Scanner input) {
		System.out.print("Location: ");
		input.nextLine();
		String location = input.nextLine();
		this.setLocation(location);
	}
	
	public void setFoodExpirydate(Scanner input) {
		System.out.print("Expiry Date: ");
		String expirydate = input.next();
		this.setExpirydate(expirydate);
	}
	
	public void setFoodImage(Scanner input) {
		System.out.print("Food Image: ");
		String image = input.next();
		this.setImage(image);
	}
	
	public void setFoodNote(Scanner input) {
		System.out.print("Note: ");
		input.nextLine();
		String note = input.nextLine();
		this.setNote(note);
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case EdSpecified:
			skind = "ED O";
			break;
		case EdNotSpecified:
			skind = "ED X";
			break;
		default:
		}
		return skind;
	}

}
