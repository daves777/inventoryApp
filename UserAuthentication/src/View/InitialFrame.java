package View;

import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Creates the Initial Frame Class.
 *
 * @author dsnyder
 */
public class InitialFrame extends JFrame {

    private MainMenuPanel mainPanel;
    private AboutPanel aboutPanel;
    private LoginPanel loginPanel;
    private NavigationPanel navigationPanel;

    public InitialFrame() {
        super("User Authentication");
        
        mainPanel = new MainMenuPanel(this);
        aboutPanel = new AboutPanel(this);
        loginPanel = new LoginPanel(this);
        navigationPanel = new NavigationPanel(this);
        
        //------------------------------------------------------
        // Choose a Layout for JFrame and 
        // add Jpanel to JFrame according to layout    	
		getContentPane().setLayout(new BorderLayout());
                getContentPane().add(aboutPanel,"Center");
                getContentPane().add(loginPanel,"Center");
                getContentPane().add(navigationPanel,"Center");
                getContentPane().add(mainPanel,"Center");
                
                
                
                
        //------------------------------------------------------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (640, 480);
		setVisible(true);   
    }

    
    public MainMenuPanel getMMPanel()
    {
        return mainPanel;
    }
    
    public AboutPanel getAboutPanel()
    {
        return aboutPanel;
    }
    
    public LoginPanel getLoginPanel()
    {
        return loginPanel;
    }
    
    public NavigationPanel getNavPanel()
    {
        return navigationPanel;
    }
    
    
    public void changePanel(String panel)  //Changes visible panel depending on string given. 
        {
            getContentPane().removeAll();
            
            if(panel.equals("main"))
            {
                getContentPane().add(mainPanel,"Center");
            }
            
            if(panel.equals("about"))
            {
                getContentPane().add(aboutPanel,"Center");
            }
            
            if(panel.equals("login"))
            {
                getContentPane().add(loginPanel,"Center");
            }
            
            if(panel.equals("navigation"))
            {
                getContentPane().add(navigationPanel,"Center");
            }
            
            invalidate();
            validate();
            repaint();
        }
}

