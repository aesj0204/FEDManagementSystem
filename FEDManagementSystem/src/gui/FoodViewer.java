package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import xms.FoodManager;
import java.util.Vector;
import food.FoodInput;

public class FoodViewer extends JPanel {
	
	WindowFrame frame;
	
	FoodManager foodManager;

	public FoodViewer(WindowFrame frame, FoodManager foodManager) {
		this.frame = frame;
		this.foodManager = foodManager;
		
		System.out.println("***" + foodManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Food Image");
		model.addColumn("Food Name");
		model.addColumn("Food Category");
		model.addColumn("Location");
		model.addColumn("Expiry Date");
		model.addColumn("D-Day");
		model.addColumn("Note");
		
		for(int i = 0; i < foodManager.size(); i++) {
			Vector row = new Vector();
			FoodInput fi = foodManager.get(i);
			row.add(fi.getImage());
			row.add(fi.getName());
			row.add(fi.getCategory());
			row.add(fi.getLocation());
			row.add(fi.getExpirydate());
			row.add(fi.getdDay());
			row.add(fi.getNote());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
