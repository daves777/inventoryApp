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
import Model.ItemToPurchase;
import Model.Model;
import Model.PastSalesList;
import Model.ShoppingList;
import Model.SupplierList;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
 * @author dsnyder
 */
public class PurchasingMenuController implements Initializable {

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
    private TableView<ItemToPurchase> shopTable;
    @FXML
    private TableColumn<ItemToPurchase, String> Item;
    @FXML
    private TableColumn<ItemToPurchase, Double> Quantity;
    @FXML
    private TableColumn<ItemToPurchase, String> Supplier;
    
    @FXML
    private void handleGenerateShoppingListButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/ShoppingList.fxml"));
        Parent root = loader.load();
        
        ShoppingListController rc = loader.getController();
        rc.setStage(myStage);
        rc.setModel(model);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
        
        CurrentInventoryList cil = new CurrentInventoryList();
        ItemList it = new ItemList();
        ItemThresholdList itl = new ItemThresholdList();
        PastSalesList psl = new PastSalesList();
        SupplierList sl = new SupplierList();
        
        DemandMultiplier dm = new DemandMultiplier(psl);
        String multiplier = dm.calculateMultiplierText();
        System.out.println("Multiplier: " + multiplier);

        ShoppingList shop = new ShoppingList(dm, cil, itl, it, sl);

        
//        shopTable.setItems(shop.getItemToPurchaseData());

//        TableColumn item = new TableColumn("Item");
//        TableColumn quantity = new TableColumn("Quantity");
//        TableColumn supplier = new TableColumn("Supplier");
//        
//        shopTable.getColumns().addAll(item, quantity, supplier);
//        
//        item.setCellValueFactory(new PropertyValueFactory<ItemToPurchase,String>("Item"));
//        quantity.setCellValueFactory(new PropertyValueFactory<ItemToPurchase,Double>("quantity"));
//        supplier.setCellValueFactory(new PropertyValueFactory<ItemToPurchase,String>("supplier"));
//        
//        shopTable.setItems((ObservableList) shop.getItemToPurchaseData());
    }
    
    @FXML
    private void handleMainMenuButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/MainMenu.fxml"));
        Parent root = loader.load();
        
        MainMenuController mc = loader.getController();
        mc.setStage(myStage);
        mc.setModel(model);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
    }    
    
}
