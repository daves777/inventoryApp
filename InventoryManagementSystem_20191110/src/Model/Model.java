/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Bret
 */
public class Model {
    
    private EmployeeList allEmployees;
    
    public Model()
    {
        allEmployees = new EmployeeList();
        allEmployees.addEmployee(new Employee("John","Smith","123 Fake St",new Date(1986,3,30),"JohnSmith","password"));
    }
    
    public EmployeeList getEmployeeList()
    {
        return allEmployees;
    }
}
