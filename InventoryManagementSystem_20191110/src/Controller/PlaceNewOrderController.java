/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bret
 */
public class PlaceNewOrderController implements Initializable {

    private Stage myStage;
    private Model model;
    private ObservableList<Meal> allMeals;
    
    @FXML private TableView<Meal> mealTable;
    @FXML public TableColumn<Meal, String> keyColumn;
    @FXML public TableColumn<Meal, String> descriptionColumn;
    @FXML public TextField tableNumber;
    
    
    public void setModel(Model m)
    {        
        model = m;
        refreshTable();      
    }
    
    public void setStage(Stage stage)
    {
        myStage = stage;
    }
    
    public void refreshTable()
    {
        mealTable.getItems().clear();
        
        allMeals = FXCollections.observableArrayList(model.getMenu().getFullMenu());
        
        keyColumn.setCellValueFactory(new PropertyValueFactory<Meal, String>("key"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<Meal, String>("description"));
        
        
        mealTable.setItems(allMeals);
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
    private void handleBackButton(ActionEvent event) throws IOException {
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
    private void handlePlaceOrderButton(ActionEvent event) throws IOException {
        if(mealTable.getSelectionModel().getSelectedItem()!= null) //If item in table is selected
        {
            model.getOrders().add(new Order(6,mealTable.getSelectionModel().getSelectedItem(),tryParse(tableNumber.getText()),model.getCurrentUser().getFirstName()));
        }
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/WaitStaff.fxml"));
        Parent root = loader.load();
        
        WaitStaffController wsc = loader.getController();
        wsc.setStage(myStage);
        wsc.setModel(model);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
    }     

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //to do
    }
    
}
