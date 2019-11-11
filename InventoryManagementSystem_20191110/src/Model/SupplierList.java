package Model;

import java.util.ArrayList;


/**
 * Supplier List Class
 */
public class SupplierList 
{
    private ArrayList<Supplier> supplierData = new ArrayList<Supplier>();
    
    public SupplierList()
    {
        supplierData.add(new Supplier("RS", "Restaurant Store"));
        supplierData.add(new Supplier("RD", "Restaurant Depot"));
        supplierData.add(new Supplier("SYS", "Sysco"));
    }  

    /**
     * @return the supplierData
     */
    public ArrayList<Supplier> getSupplierData() 
    {
        return supplierData;
    }
        
}
