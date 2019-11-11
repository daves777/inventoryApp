package Model;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Item To Purchase List
 */
public class ItemToPurchaseList 
{
    private ArrayList<ItemToPurchase> itemsToPurchase = new ArrayList<ItemToPurchase>();
    private ObservableList<ItemToPurchase> itemToPurchaseData = FXCollections.observableArrayList();
    
    public ItemToPurchaseList()
    {
        
    }

    /**
     * @return the itemsToPurchase
     */
    public ArrayList<ItemToPurchase> getItemsToPurchase() {
        return itemsToPurchase;
    }

    /**
     * @param itemsToPurchase the itemsToPurchase to set
     */
    public void setItemsToPurchase(ArrayList<ItemToPurchase> itemsToPurchase) {
        this.itemsToPurchase = itemsToPurchase;
    }

    /**
     * @return the itemToPurchaseData
     */
    public ObservableList<ItemToPurchase> getItemToPurchaseData() {
        return itemToPurchaseData;
    }

    /**
     * @param itemToPurchaseData the itemToPurchaseData to set
     */
    public void setItemToPurchaseData(ObservableList<ItemToPurchase> itemToPurchaseData) {
        this.itemToPurchaseData = itemToPurchaseData;
    }
    
}
