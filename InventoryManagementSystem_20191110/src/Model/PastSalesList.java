package Model;

import java.util.ArrayList;


/**
 * Past Sales List Class
 */
public class PastSalesList 
{
    private ArrayList<PastSales> pastSalesData = new ArrayList<PastSales>();
    
    public PastSalesList()
    {
        pastSalesData.add(new PastSales("October", 2016, 4544.87));
        pastSalesData.add(new PastSales("October", 2017, 4632.98));
        pastSalesData.add(new PastSales("October", 2018, 4712.34));
        pastSalesData.add(new PastSales("October", 2019, 4745.99));
    }    

    /**
     * @return the pastSalesData
     */
    public ArrayList<PastSales> getPastSalesData() 
    {
        return pastSalesData;
    }
        
}
