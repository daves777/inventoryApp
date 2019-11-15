package Model;

import java.util.ArrayList;

/**
 * Current Inventory List
 */
public class CurrentInventoryList 
{
    private ArrayList<CurrentInventory> currentInventoryData = new ArrayList<CurrentInventory>();
    
    public CurrentInventoryList() //Starting empty so that it can be initialized in Model.
    {
        
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
        
        if(inList = true) //If item is in the list, only increment/decrement the item already in list
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
                currentInventoryData.get(i).setQuantity(currentInventoryData.get(i).getQuantity() + quantity);
            }
            else
            {
                System.out.println("This item does not exist in inventory! Please add a new item in the 'Create Item' Screen");
                //Implement Error window or something?  
            }
        }
    }
        
        
}
