package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Terboh
 */
public class NavigationPanel extends JPanel implements ActionListener
{
    JButton reportsButton,cookButton,waitstaffButton,receiverButton,backButton;
    JLabel instructions;
    
    MainMenuPanel main;
    InitialFrame frame;
    JPanel centerPanel;
    
    
    public NavigationPanel(InitialFrame jf)
    {
        
        frame = jf;
              
        
        //Setting up the JLabel to display the text in HTML style with center alignment.
        instructions = new JLabel("Please select a role");
        instructions.setHorizontalAlignment(JLabel.CENTER);
        instructions.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,20));
       
        
        //Creating Back button
        backButton = new JButton("Back");
        reportsButton = new JButton("Reports");
        cookButton = new JButton("Cook");
        waitstaffButton = new JButton("Wait Staff");
        receiverButton = new JButton("Receiver");
              
        
         //Border layout lets the back button be placed at the bottom of the frame and instructions up top without dealing with sizing
        setLayout(new BorderLayout(0,1));
        add(backButton,"South");
        add(instructions,"North");
        
        //Adding button, labels, text fields, and listener. These are done in a separate panel to organize better
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2,2));
        add(centerPanel,"Center");
        centerPanel.setBackground(Color.LIGHT_GRAY);
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,100));
        centerPanel.add(reportsButton);
        centerPanel.add(cookButton);
        centerPanel.add(waitstaffButton);
        centerPanel.add(receiverButton);
        
        
        
        reportsButton.addActionListener(this);
        cookButton.addActionListener(this);
        waitstaffButton.addActionListener(this);
        receiverButton.addActionListener(this);
        backButton.addActionListener(this);

    }
    
            
    @Override
    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource(); //CHANGE PANELS DEPENDING ON WHAT BUTTON IS CLICKED
        if (obj == backButton)
	{
            //When button is pressed, calls JFrame to change the panel to "Main"
            frame.changePanel("main");
	}
        
        if (obj == reportsButton)
	{
            //When button is pressed, calls JFrame to change the panel to "Main"
            frame.changePanel("reports");
	}
        
        if (obj == cookButton)
	{
            //When button is pressed, calls JFrame to change the panel to "Main"
            frame.changePanel("main");
	}
        
        if (obj == waitstaffButton)
	{
            //When button is pressed, calls JFrame to change the panel to "Main"
            frame.changePanel("main");
	}
        
        if (obj == receiverButton)
	{
            //When button is pressed, calls JFrame to change the panel to "Main"
            frame.changePanel("main");
	}

    }
    
   
    
    
    
}
