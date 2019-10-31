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
public class AboutPanel extends JPanel implements ActionListener
{
    JButton backButton;
    JLabel credits;
    String text;
    MainMenuPanel main;
    InitialFrame  frame;
    
    public AboutPanel(InitialFrame jf)
    {
        
        frame = jf;
        
        //Text used to display the credits.  This could be done with multiple JLabels if we want it to have multiple lines.
        text = "Created by<br><br>Bret Easley<br>Daniel Snyder<br>David Lu<br><br>This project was created for IST311 in the Fall semester of 2019 as a main project under Professor Margaret Fisher.";
        
        //Setting up the JLabel to display the text in HTML style with center alignment.
        credits = new JLabel("<html> <div style='text-align: center;'>"+text+"</div> </html>");
        
        //Creating Back button
        backButton = new JButton("Back");
        
         //Border layout lets the back button be placed at the bottom of the frame without dealing with sizing
        setLayout(new BorderLayout(0,1));
        
        //Adding button, label, and listener.
        add(backButton,"South");
        add(credits,"Center");
        backButton.addActionListener(this);

    }
            
    @Override
    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();
        if (obj == backButton)
	{
            //When button is pressed, calls JFrame to change the panel to "Main"
            frame.changePanel("main");
	}
    }
    
}
