/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bret
 */
public class CookController implements Initializable {

    private Stage myStage;
    private Model model;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/MainMenu.fxml"));
        Parent root = loader.load();
        
        MainMenuController mc = loader.getController();
        mc.setStage(myStage);
        mc.setModel(model);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
    }       
    
    @FXML
    private void handlePrepareOrderButton(ActionEvent event) throws IOException {
        //placeholder
    }
    
    @FXML
    private void handleCompleteOrderButton(ActionEvent event) throws IOException {
        //placeholder
    }
    
    @FXML
    private void handleLostDamagedIngredientsButton(ActionEvent event) throws IOException {
        //placeholder
    }
}
