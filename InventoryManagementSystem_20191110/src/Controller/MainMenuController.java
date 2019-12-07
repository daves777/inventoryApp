/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CurrentInventoryList;
import Model.DemandMultiplier;
import Model.ItemList;
import Model.ItemThresholdList;
import Model.Model;
import Model.PastSalesList;
import Model.ShoppingList;
import Model.SupplierList;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dsnyder
 */
public class MainMenuController implements Initializable {

    @FXML
    private Stage myStage;
    private Model model;
    
    @FXML
    private Label label;
    
    public void setModel(Model m)
    {
        model = m;
    }
    
    public void setStage(Stage stage)
    {
        myStage = stage;
    }
    
    @FXML
    private void handleLogOutButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Login.fxml"));
        Parent root = loader.load();
        
        LoginController lc = loader.getController();
        lc.setStage(myStage);
        lc.setModel(model);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
    }
    
    @FXML
    private void handlePurchasingButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/PurchasingMenu.fxml"));
        Parent root = loader.load();
        
        PurchasingMenuController pc = loader.getController();
        pc.setStage(myStage);
        pc.setModel(model);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
        
        
    }
    
    @FXML
    private void handleReceivingButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Receiving.fxml"));
        Parent root = loader.load();
        
        ReceivingController rc = loader.getController();
        rc.setStage(myStage);
        rc.setModel(model);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
    }
    
    @FXML
    private void handleCookButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Cook.fxml"));
        Parent root = loader.load();
        
        CookController cc = loader.getController();
        cc.setStage(myStage);
        cc.setModel(model);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
    }
    
    @FXML
    private void handleWaitStaffButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/WaitStaff.fxml"));
        Parent root = loader.load();
        
        WaitStaffController wsc = loader.getController();
        wsc.setStage(myStage);
        wsc.setModel(model);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
    }
    
    @FXML
    private void handleViewWorkersButton(ActionEvent event) throws IOException {
        //Implement once view worker button works
    }
    
    @FXML
    private void handleReceiverButton(ActionEvent event) throws IOException {
        //Implement once receiver button works
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
}
