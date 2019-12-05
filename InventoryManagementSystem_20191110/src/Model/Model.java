/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bret
 */
public class Model {
    private SupplierList allSuppliers;
    private EmployeeList allEmployees;
    private ItemList allItems;
    private CurrentInventoryList allInventory;
    private ItemThresholdList thresholds;
    private Menu fullMenu;
    
    private Meal mozzarellaChicken;
    private Meal chickenAlfredo;
    private ArrayList<CurrentInventory> mozzChickenIng;
    private ArrayList<CurrentInventory> alfredoIng;
    private ArrayList<Order> allOrders;
    
    public Model()
    {
        //adding one test employee with all permissions (Permissions not even implemented yet)
        allEmployees = new EmployeeList();
        allEmployees.addEmployee(new Employee("John","Smith","123 Fake St",new Date(1986,3,30),"JohnSmith","password"));
        allEmployees.addEmployee(new Employee("Bret","Easley","100 Cheater Lane",new Date(1986,3,30),"a","a"));
        
        allItems = new ItemList(); //Currently items are added in within constructor of ItemList.  Could be changed.
        
        allSuppliers = new SupplierList();
        allInventory = new CurrentInventoryList();
        
        
        
        //initializing inventory - likely to be replaced with adjustments inside program once working.  Ingredients are currently initialized in ItemList class
        allInventory.addItem(allItems.getItemByKey(1), 200); //200 chicken cutlets
        allInventory.addItem(allItems.getItemByKey(2), 100); //100 veal cutlets
        allInventory.addItem(allItems.getItemByKey(3), 300); //300lbs of Marinara Sauce
        allInventory.addItem(allItems.getItemByKey(4), 250); //250 slices of Mozz Cheese
        allInventory.addItem(allItems.getItemByKey(5), 450); //450lbs of Angel Hair Pasta
        allInventory.addItem(allItems.getItemByKey(6), 50);  //50lbs of Alfredo Sauce
        //-----------------------------------------------------------------------------------------------------------------------------------------------------
        
        thresholds = new ItemThresholdList();
              
        //initializing item thresholds - likely to be replaced with adjustments inside program once working.  Ingredients are currently initialized in ItemList class
        thresholds.addItem(allItems.getItemByKey(1), 250); //250 chicken cutlets
        thresholds.addItem(allItems.getItemByKey(2), 200); //200 veal cutlets
        thresholds.addItem(allItems.getItemByKey(3), 500); //500lbs of Marinara Sauce
        thresholds.addItem(allItems.getItemByKey(4), 300); //300 slices of Mozz Cheese
        thresholds.addItem(allItems.getItemByKey(5), 500); //500lbs of Angel Hair Pasta
        thresholds.addItem(allItems.getItemByKey(6), 40);  //40lbs of Alfredo Sauce
        
        //------------------------------Initializing menu and two meals for use in order testing------------------------------------------------------
        fullMenu = new Menu();
        mozzChickenIng = new ArrayList<CurrentInventory>();
        alfredoIng = new ArrayList<CurrentInventory>();    
     
        mozzChickenIng.add(new CurrentInventory(allInventory.getItem(1),1)); //Mozzarella Chicken - Add 1 chicken cutlet to ingredient list
        mozzChickenIng.add(new CurrentInventory(allInventory.getItem(3),0.5)); //Mozzarella Chicken - Add 0.5lb of Marinara to ingredient list
        mozzChickenIng.add(new CurrentInventory(allInventory.getItem(4),3)); //Mozzarella Chicken - Add 4 slices of Mozzarella Cheese to ingredient list.
       
        alfredoIng.add(new CurrentInventory(allInventory.getItem(1),1)); //Chicken Alfredo - Add 1 chicken cutlet to ingredient list
        alfredoIng.add(new CurrentInventory(allInventory.getItem(6),0.5)); //Chicken Alfredo - Add 0.5lb of Alfredo Sauce to ingredient list
        alfredoIng.add(new CurrentInventory(allInventory.getItem(5),1)); //Chicken Alfredo - Add 1lb of Angel Hair pasta to ingredient list.
        
        mozzarellaChicken = new Meal(1,"Mozzarella Chicken",mozzChickenIng);
        chickenAlfredo = new Meal(2,"Chicken Alfredo",alfredoIng);
        
        fullMenu.addMeal(mozzarellaChicken);
        fullMenu.addMeal(chickenAlfredo);  

        //---------------------------------------------------------------------------------------------------------------------------------------------
        
        allOrders = new ArrayList<Order>();
        
        //initializing some orders - These are for testing purposes within the system.
        allOrders.add(new Order(1,getMenu().getMeal(0),1,"Bret"));
        allOrders.add(new Order(2,getMenu().getMeal(1),3,"Daniel"));
        allOrders.add(new Order(3,getMenu().getMeal(1),2,"David"));
        //---------------------------------------------------------------------------
        
    }

    /**
     * @return the allSuppliers
     */
    public SupplierList getSupplierList() {
        return allSuppliers;
    }
    
    public EmployeeList getEmployeeList()
    {
        return allEmployees;
    }
    
    public Menu getMenu()
    {
        return fullMenu;
    }
    
    public ArrayList<Order> getOrders()
    {
        return allOrders;
    }
    
    public CurrentInventoryList getCurrentInventoryList()
    {
        return allInventory;
    }
    
    public ItemList getItemList()
    {
        return allItems;
    }
    
    public ItemThresholdList getItemThresholdList()
    {
        return thresholds;
    }
    
}
