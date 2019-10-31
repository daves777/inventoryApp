package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

public class MainMenuPanel extends JPanel implements ActionListener 
{
    JButton about, login;
    InitialFrame _mjf;
    JLabel gameTitle;
    
    
    public MainMenuPanel(InitialFrame mjf)
    {
        //Construct main menu with other panels
        _mjf = mjf;
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        this.setOpaque(false);
        add(Box.createRigidArea(new Dimension(0,40)));
        
        //Font Styles
        Font boldSmall = new Font("Serif", Font.BOLD, 12);
        Font title = new Font("Serif", Font.BOLD, 35);
        
        //Title Label
        gameTitle = new JLabel("Inventory Management System");
        add(gameTitle);
        Font myFont = title;
        gameTitle.setFont(myFont);
        gameTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0,90)));

        //Login JButton
        login = new JButton("Login");
        add(login);
        login.setFont(boldSmall);
        login.setAlignmentX(Component.CENTER_ALIGNMENT);
        login.addActionListener(this);
        add(Box.createRigidArea(new Dimension(0,20)));
        
        //About JButton
        about = new JButton("About");
        add(about);
        about.setFont(boldSmall);
        about.setAlignmentX(Component.CENTER_ALIGNMENT);
        about.addActionListener(this);
        add(Box.createRigidArea(new Dimension(0,30)));
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object obj = e.getSource();
        if(obj == about)  //Credits button calls JFrame to change panel to "About"
        {
            _mjf.changePanel("about");
        }
        
        if(obj == login) //Instructions button calls JFrame to change panel to "Login"
        {
            _mjf.changePanel("login");
        }
        

     
        
    }
    
    
    
}
