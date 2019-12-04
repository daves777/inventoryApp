package Controller;

import Model.ItemToPurchase;
import Model.Model;
import Model.PurchaseOrder;
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


public class PurchaseOrderController implements Initializable 
{
    private Stage myStage;
    private Model model;
    private ObservableList<ItemToPurchase> itemsToPurchase = FXCollections.observableArrayList();

    @FXML
    private TableView<PurchaseOrder> poTable;
    @FXML
    public TableColumn<PurchaseOrder, String> item;
    @FXML
    public TableColumn<PurchaseOrder, Double> quantity;
    @FXML
    TextField supplierText;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {

    }  
    
    public ObservableList transferData(ObservableList ol) 
    {
        setItemsToPurchase((ObservableList<ItemToPurchase>) ol);
        

        for(int i = 0; i < getItemsToPurchase().size(); i++)
        {
            System.out.println("Copied Item " + i + ": " + getItemsToPurchase().get(i).ItemProperty().getValue() + ", " + getItemsToPurchase().get(i).QuantityProperty().getValue() + ", " + getItemsToPurchase().get(i).SupplierProperty().getValue());
        }
        
        return getItemsToPurchase();
    }
    
    @FXML
    private void handleGoButton(ActionEvent event) throws IOException 
    {
        ObservableList<PurchaseOrder> itemsForPO = FXCollections.observableArrayList();
        for(int i = 0; i < getItemsToPurchase().size(); i++)
        {    
            if(getItemsToPurchase().get(i).SupplierProperty().getValue().compareTo(supplierText.getText()) == 0)
            {
                
                itemsForPO.add(new PurchaseOrder(getItemsToPurchase().get(i).ItemProperty().getValue(), getItemsToPurchase().get(i).QuantityProperty().getValue()));
                
            }
        }   
            
        for(int i = 0; i < itemsForPO.size(); i++)
        {
            System.out.println("PO Items: " + itemsForPO.get(i).ItemProperty().getValue() + ", " + itemsForPO.get(i).QuantityProperty().getValue());
        }
        item.setCellValueFactory(new PropertyValueFactory<PurchaseOrder,String>("Item"));
        quantity.setCellValueFactory(new PropertyValueFactory<PurchaseOrder,Double>("Quantity"));
        poTable.setItems(itemsForPO);
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
    
    public void setStage(Stage stage)
    {
        myStage = stage;
    }
    
    public void setModel(Model m)
    {
        model = m;
    }
    
    /**
     * @return the itemsToPurchase
     */
    public ObservableList<ItemToPurchase> getItemsToPurchase() {
        return itemsToPurchase;
    }

    /**
     * @param itemsToPurchase the itemsToPurchase to set
     */
    public void setItemsToPurchase(ObservableList<ItemToPurchase> itemsToPurchase) {
        this.itemsToPurchase = itemsToPurchase;
    }
    
}
