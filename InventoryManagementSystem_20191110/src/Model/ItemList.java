package Model;

import java.util.ArrayList;

/**
 * Item List
 */
public class ItemList 
{
    private ArrayList<Item> itemData = new ArrayList<Item>();
    
    public ItemList()
    {
        itemData.add(new Item("BrChixCut", "Breaded Chicken Cutlet"));
        itemData.add(new Item("BrVealCut", "Breaded Veal Cutlet"));
        itemData.add(new Item("CanMarinara", "#10 Can Marianara Sauce"));
        itemData.add(new Item("MonzChSl", "Mozzarella Cheese Slices, 1 lb"));
        itemData.add(new Item("AngelPasta", "Angel Hair Pasta, 1lb"));
    }

    /**
     * @return the itemData
     */
    public ArrayList<Item> getItemData() 
    {
        return itemData;
    }
        
}
