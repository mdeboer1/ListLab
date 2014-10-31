/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab3;

import java.util.*;

/**
 *
 * @author mdeboer1
 */
public class Lab3Demo {
    public static void main(String[] args) {
        List objList = new ArrayList();
        Employee emp1 = new Employee("DeBoer", "Mark", "555-55-5555");
        Employee emp2 = new Employee("DeBoer", "Anna", "333-33-3333");
        Dog dog1 = new Dog("Mia", 00001);
        objList.add(emp1);
        objList.add(emp2);
        objList.add(dog1);
        
        for (int i = 0; i < objList.size(); i++){
            if (i <= 1){
                // Cast the first two indexs in the List to employee.
                Employee emp = (Employee)objList.get(i);
                System.out.println(emp.getLastName());
            }
            else {
                Dog dog = (Dog)objList.get(i);
                System.out.println(dog.getName());
            }
        }
    }
    
}
