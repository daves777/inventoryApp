package Model;

import java.util.ArrayList;

public class DemandMultiplier 
{

    private ArrayList<PastSales> pastSales;
    private double totalSales = 0.00;
    private double currentSales = 0.00;
    private double multiplier = 0.00;

    public DemandMultiplier(PastSalesList psl) 
    {

        pastSales = psl.getPastSalesData();
        currentSales = psl.getPastSalesData().get(3).getSales();
    }
    
    public double averageSales()
    {
       for(int i=0;i<3;i++)
       {
            totalSales = totalSales + pastSales.get(i).getSales();
       }
       return totalSales / 3.0;
    }
    
    public double calculateMultiplier()
    {
        multiplier = currentSales / averageSales();
        return multiplier;
    }
    
    public String averageSalesText()
    {
       for(int i=0;i<3;i++)
       {
            totalSales = totalSales + pastSales.get(i).getSales();
       }
       return Double.toString(totalSales / 3.0);
    }
    
    public String calculateMultiplierText()
    {
        multiplier = currentSales / averageSales();
        return Double.toString(multiplier);
    }
}
