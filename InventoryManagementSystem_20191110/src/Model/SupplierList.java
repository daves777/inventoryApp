package Model;

import inventorymanagementsystem.InventoryManagementSystem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


/**
 * Supplier List Class
 */
public class SupplierList 
{
    private static ResultSet supplierResults = null;
    private ArrayList<Supplier> supplierData = new ArrayList<Supplier>();
    private ObservableList<Supplier> suppliers = FXCollections.observableArrayList();
    
    public SupplierList()
    {
        try 
        {
            DBConnect db = new DBConnect();
            supplierResults = db.selectQuery("select * from Supplier");

            while(supplierResults.next()) {
                getSuppliers().add(new Supplier(getSupplierResults().getString(2)));
                getSupplierData().add(new Supplier(getSupplierResults().getString(2)));
            }
            
            for(int i = 0; i < suppliers.size(); i++)
            {
                System.out.println(getSuppliers().get(i).getSupplier().getValue());
                System.out.println(getSupplierData().get(i).getSupplier().getValue());
            }
     
        } catch (SQLException ex) 
        {
            Logger.getLogger(InventoryManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
//        supplierData.add(new Supplier(1, "Restaurant Store"));
//        supplierData.add(new Supplier(2, "Restaurant Depot"));
//        supplierData.add(new Supplier(3, "Sysco"));
    }  

    /**
     * @return the supplierData
     */
    public ArrayList<Supplier> getSupplierData() 
    {
        return supplierData;
    }

    /**
     * @return the supplierResults
     */
    public static ResultSet getSupplierResults() {
        return supplierResults;
    }

    /**
     * @param aSupplierResults the supplierResults to set
     */
    public static void setSupplierResults(ResultSet aSupplierResults) {
        supplierResults = aSupplierResults;
    }

    /**
     * @return the suppliers
     */
    public ObservableList<Supplier> getSuppliers() {
        return suppliers;
    }

    /**
     * @param suppliers the suppliers to set
     */
    public void setSuppliers(ObservableList<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
        
}
