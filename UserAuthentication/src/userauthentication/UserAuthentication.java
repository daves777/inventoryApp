package userauthentication;

import Controller.Controller;
import Model.Model;
import View.View;



/**
 *
 * @author dsnyder
 */
public class UserAuthentication {

    public static void main(String[] args)
    {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
    }
    
}
