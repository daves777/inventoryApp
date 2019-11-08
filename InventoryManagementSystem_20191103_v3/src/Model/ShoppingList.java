package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Shopping List Class
 */
public class ShoppingList 
{
    private double currentInventory;
    private double threshold;
    private double demandMultiplier;
    private String item;
    private double quantity;
    private double supplier;
    private ObservableList<ItemToPurchase> itemToPurchaseData = FXCollections.observableArrayList();
    
    public ShoppingList()
    {
        
    }
       
    public void calculateAmountToPurchase()
    {  
        for(int i=0;i<5;i++)
        {
            double amountToPurchase = 0;
            amountToPurchase = currentInventory - (threshold * demandMultiplier); 
            if(amountToPurchase < 0) 
            {
                amountToPurchase = (amountToPurchase * -1) + 5;
                //itemToPurchaseData.add(new Item(item, amountToPurchase, supplier));
            } 
        }
    }
}
