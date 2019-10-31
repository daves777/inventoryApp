package Controller;

import Model.Model;
import View.View;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Creates the Controller Class
 *
 * @author Dan Snyder
 */
public class Controller 
{
    private Model model;
    private View view;
    
    public Controller(Model m, View v) 
    {
        this.model = m;
        this.view = v;
        checkUsernamePassword();
    }
    
    private void checkUsernamePassword() 
    {
        getView().getInf().getLoginPanel().getSubmitButton().addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                if (getView().getInf().getLoginPanel().getUsername().getText() != null && getView().getInf().getLoginPanel().getPassword().getText() != null)
                {
                    if (getModel().getUserData().getUserName().equals(getView().getInf().getLoginPanel().getUsername().getText()) && 
                        getModel().getUserData().getPassword().equals(getView().getInf().getLoginPanel().getPassword().getText()))
                    {
                        System.out.println("Success");
                        System.out.println(getModel().getUserData().getUserName() + ", " + getModel().getUserData().getPassword());
                        System.out.println(getView().getInf().getLoginPanel().getUsername().getText() + ", " + getView().getInf().getLoginPanel().getPassword().getText());
                        getView().getInf().changePanel("navigation");
                    }                   
                    else
                    {
                        System.out.println("Try Another User Name and Password");
                        System.out.println(getModel().getUserData().getUserName() + ", " + getModel().getUserData().getPassword());
                        System.out.println(getView().getInf().getLoginPanel().getUsername().getText() + ", " + getView().getInf().getLoginPanel().getPassword().getText());
                        getView().getInf().getLoginPanel().getInstructions().setText("The Username or Password was not found.  Please try again.");
                        getView().getInf().getLoginPanel().getUsername().setText("");
                        getView().getInf().getLoginPanel().getPassword().setText("");
                    }
                }
                else
                {
                    System.out.println("Please enter a valid user name and password");
                }
            }
        }
        );
    }
    

    /**
     * @return the model
     */
    public Model getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(Model model) {
        this.model = model;
    }

    /**
     * @return the view
     */
    public View getView() {
        return view;
    }

    /**
     * @param view the view to set
     */
    public void setView(View view) {
        this.view = view;
    }
}
