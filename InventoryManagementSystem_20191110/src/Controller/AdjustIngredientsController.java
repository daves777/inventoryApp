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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bret
 */
public class AdjustIngredientsController implements Initializable {

    
    private Stage myStage;
    private Model model;
    
    @FXML public TextField itemNumber;
    @FXML public TextField description;
    @FXML public TextField uom;
    @FXML public TextField quantity;
    @FXML public TextField cost;
    
    
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
    
    public static Integer tryParse(String text) {
    try {
    return Integer.parseInt(text);
  } catch (NumberFormatException e) {
    System.out.println(text+"Is not an integer!");
    return 0;
  }
}

    
    
    @FXML
    private void handleItemNumberUpdated(ActionEvent event) throws IOException {
        boolean itemFound = false;
        for(int i = 0;i<model.getItemList().getSize();i++)
        {
            if(model.getItemList().getItem(i).getKey()==tryParse(itemNumber.getText()))
            {
                description.setText(model.getItemList().getItem(i).getDescription());
                uom.setText(model.getItemList().getItem(i).getUOM());
                itemFound = true;
                quantity.requestFocus();
            }
        }
        
        if(itemFound == false)
        {
            itemNumber.clear();
            description.setText("N/A");
            uom.setText("N/A");
            quantity.clear();
        }   
    }
    
    
    @FXML
    private void handleClearButton(ActionEvent event) throws IOException {
        itemNumber.clear();
        description.setText("N/A");
        uom.setText("N/A");
        quantity.clear();
        
        
    }
    
    @FXML
    private void handleSubmitButton(ActionEvent event) throws IOException {
        model.getCurrentInventoryList().adjustQuantity(model.getItemList().getItemByKey(tryParse(itemNumber.getText())), tryParse(quantity.getText()));
        itemNumber.clear();
        description.setText("N/A");
        uom.setText("N/A");
        quantity.clear();
    }
    
    
   
    
    
}
