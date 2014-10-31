/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mdeboer
 */
public class Lab1Demo {
    public static void main(String[] args) {
        List hobbyList = new ArrayList();
        hobbyList.add("Fishing");
        hobbyList.add("Golfing");
        hobbyList.add("Family");
        
        for(int i = 0; i < hobbyList.size(); i++){
            String answer = (String)hobbyList.get(i);
            System.out.println(answer);
        }
    }
}
