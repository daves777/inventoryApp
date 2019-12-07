package Model;

import java.util.ArrayList;


/**
 * Item Threshold List Class
 */
public class ItemThresholdList 
{
   
    private ArrayList<ItemThresholds> itemThresholdData = new ArrayList<ItemThresholds>();
    
    public ItemThresholdList()
    {


    }  
   
     public void addItem(Item newItem, double quantity)
    {
        boolean inList = false; //Assume that item is not in list
        for(int i=0;i<itemThresholdData.size();i++) //Check entire array for an item with the same Key
        {
            if(newItem.getKey()==itemThresholdData.get(i).getItem().getKey())
            {
                inList = true; //If the key of the item equals the key of something within the list, change boolean to true
            }
        }
        
        if(inList == true) //If item is in the list, only increment/decrement the item already in list
        {
            System.out.println("Item "+ newItem.getDescription() + " is already in list");
            adjustQuantity(newItem, quantity);
        }
        
        else //Otherwise, add new item in at expected quantity.
        {
            itemThresholdData.add(new ItemThresholds(newItem,quantity));
        }
    }
    
    public void adjustQuantity(Item item, double quantity) 
    {
        for(int i=0;i<itemThresholdData.size();i++) //Check entire array for an item with the same Key
        {
            //Find the item with the same key: When found, add quantity (which can be negative) to the current quantity
            if(item.getKey()==itemThresholdData.get(i).getItem().getKey()) 
            {
                itemThresholdData.get(i).setThreshold(itemThresholdData.get(i).getThreshold() + quantity);
            }
            else
            {
                System.out.println("This item does not exist in inventory! Please add a new item in the 'Create Item' Screen");
                //Implement Error window or something?  
            }
        }
    }
    
    public Item getItem(int key)
    {
        Item thisItem = new Item();
        
        for(int i=0;i<itemThresholdData.size();i++) //Check entire array for an item with the same Key
        {
            //Find the item with the same key: When found, add quantity (which can be negative) to the current quantity
            if(key == itemThresholdData.get(i).getItem().getKey()) 
            {
                thisItem = itemThresholdData.get(i).getItem();
            }
            else
            {
//                System.out.println("This item does not exist in inventory! Please add a new item in the 'Create Item' Screen");
                //Implement Error window or something?  
            }
        }
        return thisItem;
    }    
    /**
     * @return the itemThresholdData
     */
    public ArrayList<ItemThresholds> getItemThresholdData() 
    {
        return itemThresholdData;
    }
    
    public int getSize()
    {
        return itemThresholdData.size();
    }
        
}
