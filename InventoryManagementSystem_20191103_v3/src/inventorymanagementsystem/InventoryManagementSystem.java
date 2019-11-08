/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem;

import Controller.LoginController;
import Controller.SplashScreenController;
import Model.CurrentInventory;
import Model.Item;
import Model.ItemThresholds;
import Model.Supplier;
import Model.PastSales;
import Model.EmployeeList;
import Model.Employee;
import Model.Model;
import java.util.ArrayList;
import java.util.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author dsnyder
 */
public class InventoryManagementSystem extends Application 
{
    
    private ObservableList<Item> itemData = FXCollections.observableArrayList();
    private ObservableList<ItemThresholds> itemThresholdData = FXCollections.observableArrayList();
    private ObservableList<Supplier> supplierData = FXCollections.observableArrayList();
    private ObservableList<PastSales> pastSalesData = FXCollections.observableArrayList();
    private ObservableList<CurrentInventory> currentInventoryData = FXCollections.observableArrayList();
    //private PastSales pastSalesData2 = new PastSales();
    private ArrayList<PastSales> pastSalesData2 = new ArrayList<PastSales>();
    private Model model = new Model();
    
    public InventoryManagementSystem()
    {
        itemData.add(new Item("BrChixCut", "Breaded Chicken Cutlet"));
        itemData.add(new Item("BrVealCut", "Breaded Veal Cutlet"));
        itemData.add(new Item("CanMarinara", "#10 Can Marianara Sauce"));
        itemData.add(new Item("MonzChSl", "Mozzarella Cheese Slices, 1 lb"));
        itemData.add(new Item("AngelPasta", "Angel Hair Pasta, 1lb"));
        itemThresholdData.add(new ItemThresholds("Breaded Chicken Cutlet", 50.0));
        itemThresholdData.add(new ItemThresholds("Breaded Veal Cutlet", 50.0));
        itemThresholdData.add(new ItemThresholds("#10 Can Marianara Sauce", 25.0));
        itemThresholdData.add(new ItemThresholds("Mozzarella Cheese Slices, 1 lb", 10.0));
        itemThresholdData.add(new ItemThresholds("Angel Hair Pasta, 1lb", 40.0));
        supplierData.add(new Supplier("RS", "Restaurant Store"));
        supplierData.add(new Supplier("RD", "Restaurant Depot"));
        supplierData.add(new Supplier("SYS", "Sysco"));
        pastSalesData.add(new PastSales("October", 2016, 4544.87));
        pastSalesData.add(new PastSales("October", 2017, 4632.98));
        pastSalesData.add(new PastSales("October", 2018, 4712.34));
        pastSalesData.add(new PastSales("October", 2019, 4745.99));
        currentInventoryData.add(new CurrentInventory("Breaded Chicken Cutlet", 40.0));
        currentInventoryData.add(new CurrentInventory("Breaded Veal Cutlet", 35.0));
        currentInventoryData.add(new CurrentInventory("#10 Can Marianara Sauce", 8.0));
        currentInventoryData.add(new CurrentInventory("Mozzarella Cheese Slices, 1 lb", 8.0));
        currentInventoryData.add(new CurrentInventory("Angel Hair Pasta, 1lb", 60.0));
        
        
        pastSalesData2.add(new PastSales("October", 2016, 4544.87));
        pastSalesData2.add(new PastSales("October", 2017, 4632.98));
        pastSalesData2.add(new PastSales("October", 2018, 4712.34));
        pastSalesData2.add(new PastSales("October", 2019, 4745.99));
        
        for(int i=0;i<3;i++)
        {
            double total=0;
            System.out.println(pastSalesData.get(i).getSales().doubleValue());
//            total = total + pastSalesData.get(i).getSales().doubleValue();
//            System.out.println(total);
        }
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/SplashScreen.fxml"));
        Parent root = loader.load();
        
        SplashScreenController ssc = loader.getController();
        ssc.setModel(model);
        ssc.setStage(stage);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * @return the itemData
     */
    public ObservableList<Item> getItemData() {
        return itemData;
    }

    /**
     * @return the itemThresholdData
     */
    public ObservableList<ItemThresholds> getItemThresholdData() {
        return itemThresholdData;
    }

    /**
     * @return the currentInventoryData
     */
    public ObservableList<CurrentInventory> getCurrentInventoryData() {
        return currentInventoryData;
    }

    /**
     * @return the supplierData
     */
    public ObservableList<Supplier> getSupplierData() {
        return supplierData;
    }

    /**
     * @return the pastSalesData
     */
    public ObservableList<PastSales> getPastSalesData() {
        return pastSalesData;
    }

    /**
     * @return the pastSalesData2
     */
    public ArrayList<PastSales> getPastSalesData2() {
        return pastSalesData2;
    }

    /**
     * @param pastSalesData2 the pastSalesData2 to set
     */
    public void setPastSalesData2(ArrayList<PastSales> pastSalesData2) {
        this.pastSalesData2 = pastSalesData2;
    }
    
}
