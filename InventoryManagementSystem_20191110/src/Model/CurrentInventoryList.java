package Model;

import inventorymanagementsystem.InventoryManagementSystem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Current Inventory List
 */
public class CurrentInventoryList 
{
    private ArrayList<CurrentInventory> currentInventoryData = new ArrayList<CurrentInventory>();
//    private static ResultSet results = null;
//    private ItemList allItems;
    
    public CurrentInventoryList() //Starting empty so that it can be initialized in Model.
    {
//        

    }   

    /**
     * @return the currentInventoryData
     */
    public ArrayList<CurrentInventory> getCurrentInventoryData() 
    {
        return currentInventoryData;
    }
    

    public void addItem(Item newItem, double quantity)
    {
        boolean inList = false; //Assume that item is not in list
        for(int i=0;i<currentInventoryData.size();i++) //Check entire array for an item with the same Key
        {
            if(newItem.getKey()==currentInventoryData.get(i).getItem().getKey())
            {
                inList = true; //If the key of the item equals the key of something within the list, change boolean to true
            }
        }
        
        if(inList == true) //If item is in the list, only increment/decrement the item already in list
        {
            adjustQuantity(newItem, quantity);
        }
        
        else //Otherwise, add new item in at expected quantity.
        {
            currentInventoryData.add(new CurrentInventory(newItem,quantity));
        }
    }
    
    public void adjustQuantity(Item item, double quantity) 
    {
        for(int i=0;i<currentInventoryData.size();i++) //Check entire array for an item with the same Key
        {
            //Find the item with the same key: When found, add quantity (which can be negative) to the current quantity
            if(item.getKey()==currentInventoryData.get(i).getItem().getKey()) 
            {
                System.out.print(item.getDescription()+" changed from "+currentInventoryData.get(i).getQuantity());
                currentInventoryData.get(i).setQuantity(currentInventoryData.get(i).getQuantity() + quantity);
                
                System.out.println(" to "+currentInventoryData.get(i).getQuantity());

            }
            else
            {
                //Implement Error window or something?  
            }
        }
    }
    
    public Item getItem(int key)
    {
        Item thisItem = new Item();
        
        for(int i=0;i<currentInventoryData.size();i++) //Check entire array for an item with the same Key
        {
            //Find the item with the same key: When found, add quantity (which can be negative) to the current quantity
            if(key == currentInventoryData.get(i).getItem().getKey()) 
            {
                thisItem = currentInventoryData.get(i).getItem();
            }
            else
            {

                //Implement Error window or something?  
            }
        }
        if(thisItem == null)
        {
//            System.out.println("This item does not exist in inventory! Please add a new item in the 'Create Item' Screen");
        }
        return thisItem;
    }
    
    public double queryQuantity(Item item)
    {
        double returnQuantity = 0;
        for(int i=0;i<currentInventoryData.size();i++)
        {
            if(item == currentInventoryData.get(i).getItem()) 
            {
                returnQuantity = currentInventoryData.get(i).getQuantity();
            }
        }
        return returnQuantity;
    }
    
    public int getSize()
    {
        return currentInventoryData.size();
    }
        
        
}
