package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FormPanel extends JPanel{
	
	private JLabel nameLabel;
	private JLabel occupationLabel;
	private TextField nameField;
	private TextField occupationField;
	private JButton okbtn;
	
	public FormPanel() {
		Dimension dim = getPreferredSize(); 
		dim.width = 250;
		System.out.println(dim);
		setPreferredSize(dim);
		
		nameLabel = new JLabel("Name: ");
		occupationLabel = new JLabel("Occupation: ");
		nameField = new TextField(10);
		occupationField = new TextField(10);
		
		okbtn = new JButton("OK");		
		
		
		Border innerBorder = BorderFactory.createTitledBorder("Add Person");
		Border outerBorder = BorderFactory.createEmptyBorder(15,15,15,15);
	
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
	}
}
