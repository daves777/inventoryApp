package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 * Creates the Center Panel Class.
 *
 * @author dsnyder
 */
public class CenterPanel extends JPanel {

    private JTextField username;
    private JLabel untext;
    private JTextField password;
    private JLabel pwdtext;
    private JButton submitEntries;
    
    //JTextField username = new JTextField("Enter User Name: ", 20);
    //JPasswordField password = new JPasswordField("Enter Password: ", 20);
    

    public CenterPanel() {
        super();
        centerInitialSetup();
        
        setBackground(Color.WHITE); 
        
    }
    
    /**
     * Initial setup
    */
    public void centerInitialSetup() {
        //setLayout(new BorderLayout());
        BorderLayout centerLayout = new BorderLayout();
//        setLayout(centerLayout);
        
        
        setUntext(new JLabel("Enter Username: "));
        add(getUntext());
        setUsername(new JTextField(20));
        add(getUsername());
        setPwdtext(new JLabel("Enter Password: "));
        add(getPwdtext());
        setPassword(new JTextField(20));
        add(getPassword());
        setSubmitEntries(new JButton("Submit"));
        add(getSubmitEntries());
        setVisible(true);
        setFocusable(true);
        requestFocusInWindow();
    }

    /**
     * @return the username
     */
    public JTextField getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(JTextField username) {
        this.username = username;
    }

    /**
     * @return the untext
     */
    public JLabel getUntext() {
        return untext;
    }

    /**
     * @param untext the untext to set
     */
    public void setUntext(JLabel untext) {
        this.untext = untext;
    }

    /**
     * @return the password
     */
    public JTextField getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(JTextField password) {
        this.password = password;
    }

    /**
     * @return the pwdtext
     */
    public JLabel getPwdtext() {
        return pwdtext;
    }

    /**
     * @param pwdtext the pwdtext to set
     */
    public void setPwdtext(JLabel pwdtext) {
        this.pwdtext = pwdtext;
    }

    /**
     * @return the submitEntries
     */
    public JButton getSubmitEntries() {
        return submitEntries;
    }

    /**
     * @param submitEntries the submitEntries to set
     */
    public void setSubmitEntries(JButton submitEntries) {
        this.submitEntries = submitEntries;
    }
}
