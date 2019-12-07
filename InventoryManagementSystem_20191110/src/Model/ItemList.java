package Model;

import inventorymanagementsystem.InventoryManagementSystem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Item List
 */
public class ItemList 
{
    private ArrayList<Item> itemData = new ArrayList<Item>();
    private static ResultSet results = null;
    
    public ItemList()
    {
        try 
        {           
            DBConnect db = new DBConnect();
            results = db.selectQuery("select * from Item");

            while(results.next()) {
                itemData.add(new Item(results.getInt(1), results.getString(2), results.getString(3), results.getDouble(4)));
            }
          
            for(int i = 0; i < itemData.size(); i++)
            {
                System.out.println("Item: " + getItem(i).getKey() + ", " + getItem(i).getDescription() + ", " + getItem(i).getUOM() + ", " + getItem(i).getCostPerUOM());
            }
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(InventoryManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }


//These are initialized as (Item Number, Description, Unit of Measure, Cost in USD per unit of measure)
        //For instance, this first line is Item 1, which is a Chicken Cutlet, and is measured in Eaches (one cutlet), and it costs $0.67 per cutlet)
//        itemData.add(new Item(1, "Chicken Cutlet","Ea",0.67));
//        itemData.add(new Item(2, "Veal Cutlet","Ea",0.95));
//        itemData.add(new Item(3, "Marinara Sauce","Lb",0.50));
//        itemData.add(new Item(4, "Mozzarella Cheese Slice","Ea",0.10));
//        itemData.add(new Item(5, "Angel Hair Pasta","Lb",0.04));
//        itemData.add(new Item(6, "Alfredo Sauce","Lb",0.55));
    }

    /**
     * @return the itemData
     */
    public ArrayList<Item> getItemData() 
    {
        return itemData;
    }
    
    public void addItem(int key, String desc, String UOM, double cost)
    {
        itemData.add(new Item(key,desc,UOM,cost));
    }
    
    public Item getItem(int i)
    {
        return itemData.get(i);
    }
    
    public Item getItemByKey(int key)
    {
        Item returnItem = null;
        for(int i = 0; i < itemData.size();i++)
        {
            if(itemData.get(i).getKey() == key)
            {
                returnItem = getItem(i);    
            }
        }
        return returnItem;  //Might need to figure out how to throw exceptions. 
    }
    
    public int getSize()
    {
        return itemData.size();
    }
        
}
