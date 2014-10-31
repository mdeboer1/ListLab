/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab2;

import java.util.*;

/**
 *
 * @author mdeboer1
 */
public class Lab2Demo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("DeBoer", "Mark", "555-55-5555");
        Employee emp2 = new Employee("DeBoer", "Anna", "333-33-3333");
        Employee emp3 = new Employee("Smith", "John", "111-11-1111");
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        
        for (Employee emp : employeeList){
            System.out.println(emp.getLastName() + ", " + emp.getFirstName());
        }
    }
}
