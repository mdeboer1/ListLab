/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setlab;

import java.util.*;

/**
 *
 * @author mdeboer1
 */
public class Demo1 {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        
        Car car1 = new Car("Honda", 001);
        Car car2 = new Car("Honda", 002);
        Car car3 = new Car("Honda", 001);
        
        list.add(car1);
        list.add(car2);
        list.add(car3);
        
        //This loop shows the List holds three cars
        for (Car car : list){
            System.out.println(car.getMake());
        }
        
        // Convert List to Set
        Set<Car> set = new HashSet<>(list);
        
        /* This loop shows that with overridden .equals and .hashSet, the 
           duplicates vins in car1 and car2 make them duplicates and the 
           duplicate object is deleted.
        */
        for (Car car : set){
            System.out.println(car.getMake() + " " + car.getVin());
        }
    }
}
