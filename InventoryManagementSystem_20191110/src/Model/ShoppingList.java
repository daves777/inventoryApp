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

    public ShoppingList(ItemList it, CurrentInventoryList cil, ItemThresholdList itl)
    {
        currentInventory = cil.getCurrentInventoryData();
        threshold = itl.getItemThresholdData();
        item = it.getItemData();
    }
       
    public double calculateAmountToPurchase(int i)   
    {              
        double amountToPurchase = 0.0;
        
        amountToPurchase = (currentInventory.get(i).getQuantity() - threshold.get(i).getThreshold()); 
        if(amountToPurchase < 0) 
        {
            amountToPurchase = ((amountToPurchase * -1) + 5);        
            System.out.println("Item to Purchase: " + item.get(i).getItem() + ", " + amountToPurchase);
        }         
        return amountToPurchase;
    }
    
    public String getItemToPurchase(int i)   
    {              
        double amountToPurchase = 0.0;
        String itemList = "";
        amountToPurchase = (currentInventory.get(i).getQuantity() - threshold.get(i).getThreshold()); 
        if(amountToPurchase < 0) 
        {      
            itemList = item.get(i).getItem();
        }         
        return itemList;
    }
}