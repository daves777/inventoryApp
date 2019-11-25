/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ItemToPurchase;
import Model.Meal;
import Model.Model;
import Model.Order;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bret
 */
public class WaitStaffController implements Initializable {

    private Stage myStage;
    private Model model;
    private ObservableList<Order> allOrders;
    
    @FXML private TableView<Order> orderTable;
    @FXML public TableColumn<Order, String> serverColumn;
    @FXML public TableColumn<Order, String> tableColumn;
    @FXML public TableColumn<Order, String> mealColumn;
    @FXML public TableColumn<Order, String> statusColumn;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }
    
    
    public void setModel(Model m)
    {
        model = m;
        allOrders = FXCollections.observableArrayList(model.getOrders());
        
        
        serverColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("server"));
        tableColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("table"));
        mealColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("meal"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<Order, String>("status"));
        
        
        orderTable.setItems(allOrders);


        
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
    private void handlePlaceNewOrderButton(ActionEvent event) throws IOException {
        //placeholder
    }
    
    @FXML
    private void handleEditOrderButton(ActionEvent event) throws IOException {
        //placeholder
    }
    
    @FXML
    private void handlePickUpCompletedOrderButton(ActionEvent event) throws IOException {
        //placeholder
    }
    
    @FXML
    private void handlePayForOrderButton(ActionEvent event) throws IOException {
        //placeholder
    }    
    
}
