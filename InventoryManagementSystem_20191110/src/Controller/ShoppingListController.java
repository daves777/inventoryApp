package Controller;

import Model.ItemToPurchase;
import Model.Model;
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
 * Shopping List Controller class
 *
 */
public class ShoppingListController implements Initializable {
    
    private Stage myStage;
    private Model model;
  
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
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
       
    }    

    public void setModel(Model m)
    {
        model = m;
    }
    
    public void setStage(Stage stage)
    {
        myStage = stage;
    }
    
}
