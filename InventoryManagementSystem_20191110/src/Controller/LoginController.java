/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.EmployeeList;
import Model.Model;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dsnyder
 */
public class LoginController implements Initializable {

    @FXML
    private TextField usernameField;
    
    @FXML
    private PasswordField passwordField;
    
    @FXML
    private Model model;
    
    @FXML
    private Stage myStage;
    
    @FXML
    private void handleSubmitButton(ActionEvent event) throws IOException 
    {
        authenticatePassword();
    }
    
    @FXML
    private void handleEnterButton(ActionEvent event) throws IOException 
    {
        authenticatePassword();
    }
    
    public void authenticatePassword() throws IOException
    {
        for(int i = 0;i < model.getEmployeeList().getNumEmployees();i++)
        {
            if(model.getEmployeeList().getEmployee(i).getUsername().equals(usernameField.getText()))
            {
                System.out.println("username accepted: "+usernameField.getText());
                if(model.getEmployeeList().getEmployee(i).getPassword().equals(passwordField.getText()))
                {
                    System.out.println("password accepted: "+passwordField.getText());
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/MainMenu.fxml"));
                    Parent root = loader.load();

                    MainMenuController mmc = loader.getController();
                    mmc.setModel(model);
                    mmc.setStage(myStage);

                    Scene scene = new Scene(root);

                    myStage.setScene(scene);
                    myStage.show();
                }
                else
                {
                    System.out.println("incorrect password: "+passwordField.getText());
                }                    
            }   
            else
            {
              System.out.println(usernameField.getText()+" - No such user found");
            }
        }
    }
    
    public void setModel(Model m)
    {
        model = m;
    }
    
    public void setStage(Stage stage)
    {
        myStage = stage;
    }
    
    @FXML
    private void handleBackButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/SplashScreen.fxml"));
        Parent root = loader.load();
        
        SplashScreenController ssc = loader.getController();
        ssc.setModel(model);
        ssc.setStage(myStage);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO
    }
}
