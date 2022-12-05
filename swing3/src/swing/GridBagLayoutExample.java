package swing;

import java.awt.Button;  
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
  
import javax.swing.*;  
public class GridBagLayoutExample extends JFrame{  
    public static void main(String[] args) {  
            GridBagLayoutExample a = new GridBagLayoutExample(); 
                       
            a.setSize(300, 300);  
            a.setPreferredSize(a.getSize());  
            a.setVisible(true);  
            a.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        }  
        public GridBagLayoutExample() {  
        	
            GridBagConstraints gbc = new GridBagConstraints();  
             
            setTitle("GridBag Layout Example");  
            GridBagLayout layout = new GridBagLayout();
            setLayout(layout); 
             
    
		    gbc.fill = GridBagConstraints.HORIZONTAL;
//		    boolean shouldWeightX = false;
//			if (shouldWeightX) {
//                gbc.weightx = 0.5;
//}
		    gbc.weightx = 0.1;
//		    gbc.gridwidth = 2;  
		    gbc.gridx = 0; 
		    gbc.gridy = 0;
		    this.add(new Button("Button One"), gbc);
		     
		        		
// 		    gbc.fill = GridBagConstraints.HORIZONTAL;   		    		   
 		    gbc.gridx = 1;  
 		    gbc.gridy = 0; 
 		    
 		    this.add(new Button("Button two"), gbc);  
   
		     	    
// 		    gbc.fill = GridBagConstraints.HORIZONTAL;  
		    gbc.gridx = 2;  
		    gbc.gridy = 0;  
		    this.add(new Button("Button Three"), gbc); 
		    
		    
//		    gbc.fill = GridBagConstraints.HORIZONTAL;  
		   
		    gbc.gridx = 0;  
		    gbc.gridy = 1;  
		    gbc.ipady = 40; 
		    this.add(new Button("Button Four"), gbc);
		    
		    
//		    gbc.fill = GridBagConstraints.HORIZONTAL;
		    gbc.gridwidth = 2;
		    gbc.gridx = 1;  
		    gbc.gridy = 2;
		    gbc.ipady = 0;
		    gbc.anchor = GridBagConstraints.PAGE_END;
		    gbc.weighty = 0.5;
    		this.add(new Button("Button Five"), gbc);  
    		
    		this.pack();
    		 
           
            
      
        }  
      
      
}  