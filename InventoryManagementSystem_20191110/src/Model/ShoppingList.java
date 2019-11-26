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
            System.out.println("Item to Purchase: " + item.get(i).getDescription() + ", " + amountToPurchase);
        }         
        return amountToPurchase;
    }
    
    public String getItemToPurchase(int i)   
    {              
        double amountToPurchase = 0.0;
        String itemList = "";
        
        /*
        System.out.println("Current Inventory list size: "+currentInventory.size());
        System.out.println("Current Threshold list size: "+threshold.size());
        System.out.println("Current Item list size: "+item.size());
        */
        
        amountToPurchase = (currentInventory.get(i).getQuantity() - threshold.get(i).getThreshold()); 
        if(amountToPurchase < 0) 
        {      
            itemList = item.get(i).getDescription();
        }         
        return itemList;
    }
    
    public int getItemSize()
    {
        return item.size();
    }
}