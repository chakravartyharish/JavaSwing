package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	
	private JButton hellobutton;
	private JButton goodbyebutton;
	private TextPanel textPanel;
	
	
	public Toolbar() {
		hellobutton = new JButton("Hello");		
		goodbyebutton = new JButton("goodbye");
		
		
		hellobutton.addActionListener(this);
		goodbyebutton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 20 , 10));
		
		
		add(hellobutton);
		add(goodbyebutton);
		
	}

	public void setTextPanel(TextPanel textPanel) {
		
		this.textPanel = textPanel;
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton clicked = (JButton) e.getSource();
		
		if(clicked == hellobutton) {
			System.out.println("Hello");
			textPanel.appendText("Hello \n");			
		}
		if (clicked == goodbyebutton) {
			System.out.println("Goodbye");
			textPanel.appendText("Goodbye \n");
		}
		
		
	}

}
