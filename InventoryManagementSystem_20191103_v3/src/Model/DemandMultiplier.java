package Model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import inventorymanagementsystem.InventoryManagementSystem;
import java.util.ArrayList;

/**
 * Demand Multiplier Class
 */
public class DemandMultiplier 
{
    //private double last3YearSales = inventorymanagementsystem.InventoryManagementSystem.getPastSalesData().get(0).doubleValue();
    //private double last3YearSales = inventorymanagementsystem.InventoryManagementSystem.getPastSalesData2().get(0).getSales().doubleValue();
    private double last3YearSales;
    private double last2YearSales;
    private double lastYearSales;
    private double currentSales;
    private ArrayList<PastSales> pastSales = new ArrayList<PastSales>();
   
    public DemandMultiplier()
    {
        
    }
    
    
    public double averagePastSales()
    {
        
        double total = 0;
        for(int i=0;i<3;i++)
        {
            
            //total = total + inventorymanagementsystem.InventoryManagementSystem.getPastSalesData2().get(i).getSales();
        
        }
        return total/3;
        //return ((last3YearSales + last2YearSales + lastYearSales) / 3);
    }
    
    public double calculateMultiplier()
    {
        return currentSales / averagePastSales();
    }
}
