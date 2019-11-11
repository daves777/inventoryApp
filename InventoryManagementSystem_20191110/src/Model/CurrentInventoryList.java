package Model;

import java.util.ArrayList;

/**
 * Current Inventory List
 */
public class CurrentInventoryList 
{
    private ArrayList<CurrentInventory> currentInventoryData = new ArrayList<CurrentInventory>();
    
    public CurrentInventoryList()
    {
        currentInventoryData.add(new CurrentInventory("Breaded Chicken Cutlet", 40.0));
        currentInventoryData.add(new CurrentInventory("Breaded Veal Cutlet", 35.0));
        currentInventoryData.add(new CurrentInventory("#10 Can Marianara Sauce", 8.0));
        currentInventoryData.add(new CurrentInventory("Mozzarella Cheese Slices, 1 lb", 8.0));
        currentInventoryData.add(new CurrentInventory("Angel Hair Pasta, 1lb", 60.0));
    }   

    /**
     * @return the currentInventoryData
     */
    public ArrayList<CurrentInventory> getCurrentInventoryData() 
    {
        return currentInventoryData;
    }
        
        
}
