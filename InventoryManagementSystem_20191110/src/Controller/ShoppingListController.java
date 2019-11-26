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
 * Shopping List Controller class
 *
 */
public class ShoppingListController implements Initializable {

    private Stage myStage;
    private Model model;
    private final ObservableList<ItemToPurchase> itemsToPurchase = FXCollections.observableArrayList();
    
    @FXML
    private TableView<ItemToPurchase> shopTable;
    @FXML
    public TableColumn<ItemToPurchase, String> item;
    @FXML
    public TableColumn<ItemToPurchase, Double> quantity;
    @FXML
    public TableColumn<ItemToPurchase, String> supplier;
    @FXML
    TextField multiplierText;
    @FXML
    TextField inputItem;
    @FXML
    TextField inputQuantity;
    @FXML
    TextField inputSupplier;

    /**
     * Initializes the controller class.
     */
    
    public void setModel(Model m)
    {
        model = m;
        
        CurrentInventoryList cil = model.getCurrentInventoryList();
        ItemList it = model.getItemList();
        ItemThresholdList itl = model.getItemThresholdList();
        PastSalesList psl = new PastSalesList();
        SupplierList sl = new SupplierList();
        
        DemandMultiplier dm = new DemandMultiplier(psl);
        String multiplier = dm.calculateMultiplierText();
        multiplierText.setText(multiplier);
        System.out.println("Multiplier: " + multiplier);

        ShoppingList shop = new ShoppingList(it, cil, itl); 
        
        for(int i = 0; i < 4; i++)
        {
            getItemsToPurchase().add(new ItemToPurchase(shop.getItemToPurchase(i), shop.calculateAmountToPurchase(i), ""));
        }
        
        item.setCellValueFactory(new PropertyValueFactory<ItemToPurchase,String>("Item"));
        quantity.setCellValueFactory(new PropertyValueFactory<ItemToPurchase,Double>("Quantity"));
        supplier.setCellValueFactory(new PropertyValueFactory<ItemToPurchase,String>("Supplier"));
       
        shopTable.setItems(getItemsToPurchase());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
           
    }  
        
    @FXML
    private void handleBackButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/PurchasingMenu.fxml"));
        Parent root = loader.load();
        
        PurchasingMenuController rc = loader.getController();
        rc.setStage(myStage);
        rc.setModel(model);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
    }
    
    @FXML
    private void handleDeleteButton(ActionEvent event) throws IOException {
       ObservableList<ItemToPurchase> itemSelected, allItems;
       allItems = shopTable.getItems();
       itemSelected = shopTable.getSelectionModel().getSelectedItems();
       
       itemSelected.forEach(allItems::remove);
    }  
    
    
    @FXML
    private void handleAddButton(ActionEvent event) throws IOException {       
        getItemsToPurchase().add(new ItemToPurchase(inputItem.getText(), Double.parseDouble(inputQuantity.getText()), inputSupplier.getText()));
        shopTable.setItems(getItemsToPurchase());
        inputItem.clear();
        inputQuantity.clear();
        inputSupplier.clear();
    }
    
    @FXML
    private void handleEditButton(ActionEvent event) throws IOException {
       ObservableList<ItemToPurchase> itemSelected;
       inputItem.setText(shopTable.getSelectionModel().getSelectedItem().ItemProperty().getValue());
       inputQuantity.setText(shopTable.getSelectionModel().getSelectedItem().QuantityProperty().getValue().toString());
       inputSupplier.setText(shopTable.getSelectionModel().getSelectedItem().SupplierProperty().getValue());
    }
    
    @FXML
    private void handleUpdateButton(ActionEvent event) throws IOException {
        ObservableList<ItemToPurchase> itemSelected, allItems;
        allItems = shopTable.getItems();
        itemSelected = shopTable.getSelectionModel().getSelectedItems();
        itemSelected.forEach(allItems::remove);
       
        getItemsToPurchase().add(new ItemToPurchase(inputItem.getText(), Double.parseDouble(inputQuantity.getText()), inputSupplier.getText()));
        shopTable.setItems(getItemsToPurchase());
        inputItem.clear();
        inputQuantity.clear();
        inputSupplier.clear();
    }
    
    @FXML
    private void handleCompleteButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/PurchaseOrder.fxml"));
        Parent root = loader.load();
        
        PurchaseOrderController rc = loader.getController();
        rc.setStage(myStage);
        rc.setModel(model);
        
        Scene scene = new Scene(root);
        
        myStage.setScene(scene);
        myStage.show();
  
        rc.transferData(getItemsToPurchase());
       
    }
          
    
    
    public void setStage(Stage stage)
    {
        myStage = stage;
    }

    /**
     * @return the itemsToPurchase
     */
    public ObservableList<ItemToPurchase> getItemsToPurchase() {
        return itemsToPurchase;
    }
      
}
