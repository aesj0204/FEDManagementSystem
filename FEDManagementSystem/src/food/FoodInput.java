package food;

import java.util.Scanner;

public interface FoodInput {
	
	public String getName();
	
	public void setName(String foodname);
	
	public String getCategory();
	
	public void setCategory(String foodcategory);
	
	public String getLocation();
	
	public void setLocation(String location);
	
	public String getExpirydate();
	
	public void setExpirydate(String expirydate);
	
	public String getImage();
	
	public void setImage(String foodimage);
	
	public String getNote();
	
	public void setNote(String note);
	
	public int getdDay();
	
	public void setdDay(int dDay);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setFoodName(Scanner input);
	
	public void setFoodCategory( Scanner input);
	
	public void setFoodLocation( Scanner input);
	
	public void setFoodExpirydate(Scanner input);
	
	public void setFoodImage(Scanner input);
	
	public void setFoodNote(Scanner input);

}
