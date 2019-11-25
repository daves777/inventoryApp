/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Bret
 */
public class Menu {
    private ArrayList<Meal> meals = new ArrayList<Meal>();
  
    
    public Menu()
    {
    }
    
    public void addMeal(Meal newMeal)
    {
        boolean isAlreadyMeal = false;
        for(int i = 0; i<mealCount();i++)
        {
            if(getMeal(i).getDescription() == newMeal.getDescription())
            {
                isAlreadyMeal = true;
            }
        }
        
        if(isAlreadyMeal == true)
        {
            System.out.println("This meal is already on the menu!");
        }
        else
        {
            meals.add(newMeal);
        }
    }

    
    public void removeMeal(Meal removeMeal)
    {
        for(int i = 0; i<mealCount();i++)
        {
            if(getMeal(i).getDescription() == removeMeal.getDescription())
            {
                meals.remove(meals.get(i));
            }
        }
    }
        
    public int mealCount()
    {
        return meals.size();
    }
    
    public Meal getMeal(int i)
    {
        return meals.get(i);
    }
    
    public ArrayList<Meal> getFullMenu()
    {
        return meals;
    }
            

    void addMeal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
