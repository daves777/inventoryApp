package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPanel extends JPanel implements ActionListener
{
    JButton backButton,submitButton;
    private JLabel instructions;
    JLabel username, password;
    JTextField usernameField, passwordField;

    MainMenuPanel main;
    InitialFrame frame;
    JPanel centerPanel;
    
    
    public LoginPanel(InitialFrame jf)
    {
        
        frame = jf;
              
        
        //Setting up the JLabel to display the text in HTML style with center alignment.
        instructions = new JLabel("Please log in using your credentials.");
        instructions.setHorizontalAlignment(JLabel.CENTER);
        
        //Creating Back button
        backButton = new JButton("Back");
        
        //Setting up Username and Password JLabels and fields
        username = new JLabel("Username");
        username.setHorizontalAlignment(JLabel.CENTER);
        password = new JLabel("Password");
        password.setHorizontalAlignment(JLabel.CENTER);
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        
        //Setting up Submit button
        submitButton = new JButton("Submit");
        
        
         //Border layout lets the back button be placed at the bottom of the frame without dealing with sizing
        setLayout(new BorderLayout(0,1));
        add(backButton,"South");
        
        //Adding button, labels, text fields, and listener. These are done in a separate panel to organize better
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(6,1));
        add(centerPanel,"Center");
        centerPanel.setBackground(Color.LIGHT_GRAY);
        centerPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,100));
        
        
        centerPanel.add(instructions);
        centerPanel.add(username);
        centerPanel.add(usernameField);
        centerPanel.add(password);
        centerPanel.add(passwordField);
        centerPanel.add(submitButton);
        
        submitButton.addActionListener(this);
        backButton.addActionListener(this);

    }
    
     public JButton getSubmitButton()
    {
        return submitButton;
    }
    
    public JTextField getPassword()
    {
        return passwordField;
    }
    
    public JTextField getUsername()
    {
        return usernameField;
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

    /**
     * @return the instructions
     */
    public JLabel getInstructions() {
        return instructions;
    }

    /**
     * @param instructions the instructions to set
     */
    public void setInstructions(JLabel instructions) {
        this.instructions = instructions;
    }
    
   
    
    
    
}
