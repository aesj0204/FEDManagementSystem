package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FoodViewer extends JFrame {

	public FoodViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Food Image");
		model.addColumn("Food Name");
		model.addColumn("Food Category");
		model.addColumn("Location");
		model.addColumn("Expiry Date");
		model.addColumn("D-Day");
		model.addColumn("Note");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(700, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
