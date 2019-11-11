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
        itemThresholdData.add(new ItemThresholds("Breaded Chicken Cutlet", 50.0));
        itemThresholdData.add(new ItemThresholds("Breaded Veal Cutlet", 50.0));
        itemThresholdData.add(new ItemThresholds("#10 Can Marianara Sauce", 25.0));
        itemThresholdData.add(new ItemThresholds("Mozzarella Cheese Slices, 1 lb", 10.0));
        itemThresholdData.add(new ItemThresholds("Angel Hair Pasta, 1lb", 40.0));
    }  

    /**
     * @return the itemThresholdData
     */
    public ArrayList<ItemThresholds> getItemThresholdData() 
    {
        return itemThresholdData;
    }
        
}
