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
public class EmployeeList {
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();
    
    
    
    public Employee getEmployee(int i)
    {
        return employeeList.get(i);
    }
    
    public int getNumEmployees()
    {
        return employeeList.size();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

}
