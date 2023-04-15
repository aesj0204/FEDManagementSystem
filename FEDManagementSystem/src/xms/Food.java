package xms;

public class Food {
	
	String name;
	String foodcategory;
	String location;
	String expirydate;
	String foodimage;
	String note;
	
	public Food() {
	}
	
	public Food(String foodname, String foodcategory, String location, String expirydate, String foodimage, String note) {
		this.name = foodname;
		this.foodcategory = foodcategory;
		this.location = location;
		this.expirydate = expirydate;
		this.foodimage = foodimage;
		this.note = note;
	}
	
	public void printInfo() {
		System.out.println("foodname: " + this.name + " foodcategory: " + this.foodcategory + " location: " + this.location + " expirydate: " + this.expirydate + " foodimage: " + this.foodimage + " note: " + this.note);
	}

}
