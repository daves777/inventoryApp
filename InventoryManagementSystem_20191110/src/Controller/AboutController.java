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
public class AboutController implements Initializable {

    @FXML
    private Stage myStage;
    private Model model;
    
    public void setStage(Stage stage)
    {
        myStage = stage;
    }
    public void setModel(Model m)
    {
        model = m;
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
