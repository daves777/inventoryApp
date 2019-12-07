/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CurrentInventory;
import Model.CurrentInventoryList;
import Model.Model;
import Model.Order;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bret
 */
public class CookController implements Initializable {

    private Stage myStage;
    private Model model;
    private ObservableList<Order> allOrders;
    
    @FXML private TableView<Order> orderTable;
    @FXML public TableColumn<Order, String> serverColumn;
    @FXML public TableColumn<Order, String> tableColumn;
    @FXML public TableColumn<Order, String> mealColumn;
    @FXML public TableColumn<Order, String> statusColumn;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setModel(Model m)
    {
        model = m;
        refreshTable();
    }
    
    public void refreshTable()
    {
        orderTable.getItems().clear();
        
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
    private void handlePrepareOrderButton(ActionEvent event) throws IOException {
        //Function - if an item is selected on the table, change it's status to preparing to inform wait staff that the meal is being made.  If no selection is made, do nothing (Or possibly put an error window)
        if(orderTable.getSelectionModel().getSelectedItem()!= null) //If item in table is selected
        {
            if(orderTable.getSelectionModel().getSelectedItem().getStatus() == "In Queue") //If said item is of the status "In Queue"
            {
                orderTable.getSelectionModel().getSelectedItem().setStatus("Preparing"); //Change it's status to "Preparing"
                refreshTable();
            }
            else
            {
                System.out.println("Only items in queue can be prepared!");
            }
        }
        
        else
        {
            System.out.println("Please select an item from the list!");
            //Could place an error window here - 
        }
        
    }
    
    @FXML
    private void handleCompleteOrderButton(ActionEvent event) throws IOException {
        //Function - if an item is selected on the table, change it's status to Completed to inform wait staff that the meal is ready for pickup.
        //Also remove the expected ingredients needed for the meal. If no selection is made, do nothing (Or possibly put an error window)
        
        if(orderTable.getSelectionModel().getSelectedItem()!= null)
        {
            if(orderTable.getSelectionModel().getSelectedItem().getStatus()=="Preparing")
            {
                orderTable.getSelectionModel().getSelectedItem().setStatus("Complete");
                ArrayList<CurrentInventory> mealIngredients = new ArrayList<CurrentInventory>();
                mealIngredients = orderTable.getSelectionModel().getSelectedItem().getMealType().getIngredientList();
            
                for(int i = 0;i<orderTable.getSelectionModel().getSelectedItem().getMealType().getIngredientList().size();i++)
                { 
                    model.getCurrentInventoryList().adjustQuantity(mealIngredients.get(i).getItem(), mealIngredients.get(i).getQuantity()*-1);
                }
                
            refreshTable();
            }
            else
            {
                System.out.println("Please select an item that is in the 'preparing' status");
                //Could place an error window here
            }
        }
        else
        {
            System.out.println("Please select an item from the list!");
            //Could place an error window here
        }
    }
    
    @FXML
    private void handleLostDamagedIngredientsButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/AdjustIngredients.fxml"));
        Parent root = loader.load();
        
        AdjustIngredientsController mc = loader.getController();
        mc.setStage(myStage);
        mc.setModel(model);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
    }
}
