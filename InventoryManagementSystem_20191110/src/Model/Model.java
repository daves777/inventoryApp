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
    
    private EmployeeList allEmployees;
    private ItemList allItems;
    private CurrentInventoryList allInventory;
    private Menu fullMenu;
    
    private Meal mozzarellaChicken;
    private Meal chickenAlfredo;
    private ArrayList<CurrentInventory> mozzChickenIng;
    private ArrayList<CurrentInventory> alfredoIng;
    
    public Model()
    {
        //adding one test employee with all permissions (Permissions not even implemented yet)
        allEmployees = new EmployeeList();
        allEmployees.addEmployee(new Employee("John","Smith","123 Fake St",new Date(1986,3,30),"JohnSmith","password"));
        
        allItems = new ItemList(); //Currently items are added in within constructor of ItemList.  Could be changed.
        
        allInventory = new CurrentInventoryList();
        
        
        //initializing inventory - likely to be replaced with adjustments inside program once working.  Ingredients are currently initialized in ItemList class
        allInventory.addItem(allItems.getItemByKey(1), 200); //200 chicken cutlets
        allInventory.addItem(allItems.getItemByKey(2), 100); //100 veal cutlets
        allInventory.addItem(allItems.getItemByKey(3), 300); //300lbs of Marinara Sauce
        allInventory.addItem(allItems.getItemByKey(4), 250); //250 slices of Mozz Cheese
        allInventory.addItem(allItems.getItemByKey(5), 500); //500lbs of Angel Hair Pasta
        allInventory.addItem(allItems.getItemByKey(6), 50);  //50lbs of Alfredo Sauce
        //-----------------------------------------------------------------------------------------------------------------------------------------------------
        
        
        
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
        chickenAlfredo = new Meal(2,"Chicken Alfredo",mozzChickenIng);
        
        fullMenu.addMeal(mozzarellaChicken);
        fullMenu.addMeal(chickenAlfredo);
        //---------------------------------------------------------------------------------------------------------------------------------------------
        
    }
    
    public EmployeeList getEmployeeList()
    {
        return allEmployees;
    }
}
