package Model;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Shopping List Class
 */
public class ShoppingList 
{
    private double demandMultiplier;
    private ArrayList<CurrentInventory> currentInventory;
    private ArrayList<ItemThresholds> threshold;
    private ArrayList<Item> item;
    private ArrayList<Supplier> supplier;
    
    
    
    private ObservableList<ItemToPurchase> itemToPurchaseData = FXCollections.observableArrayList();
    
    public ShoppingList(DemandMultiplier dm, CurrentInventoryList cil, ItemThresholdList itl, ItemList it, SupplierList sl)
    {
        demandMultiplier = dm.calculateMultiplier();
        currentInventory = cil.getCurrentInventoryData();
        threshold = itl.getItemThresholdData();
        item = it.getItemData();
        supplier = sl.getSupplierData();
        
        calculateAmountToPurchase();
    }
       
//    public ObservableList calculateAmountToPurchase()
    public void calculateAmountToPurchase()
         
    {  
        
        for(int i=0;i<currentInventory.size();i++)
        {
            double amountToPurchase = 0.0;
            amountToPurchase = currentInventory.get(i).getQuantity() - (threshold.get(i).getThreshold() * demandMultiplier); 
            if(amountToPurchase > 0) 
            {
                amountToPurchase = (amountToPurchase * -1);
                getItemToPurchaseData().add(new ItemToPurchase(item.get(i).getItem(), amountToPurchase, ""));
                System.out.println("Item to Purchase: " + item.get(i).getItem() + ", " + amountToPurchase);
            } 
        }
//        return itemToPurchaseData;
    }

    /**
     * @return the itemToPurchaseData
     */
    public ObservableList<ItemToPurchase> getItemToPurchaseData() 
    {
        return itemToPurchaseData;
    }

    /**
     * @param itemToPurchaseData the itemToPurchaseData to set
     */
    public void setItemToPurchaseData(ObservableList<ItemToPurchase> itemToPurchaseData) {
        this.itemToPurchaseData = itemToPurchaseData;
    }
}
