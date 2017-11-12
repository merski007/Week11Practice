package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mjmersenski
 */
public class Startup {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(4);
        numberList.add(3);
        
        // not sorted
        for(int x : numberList){
            System.out.println(x);
        }
        
        // sorted in numeric order
        Collections.sort(numberList);
        System.out.println("---------------");
        for(int x : numberList){
            System.out.println(x);
        }
        
        // sorted in reverse numeric order
        Collections.sort(numberList, Collections.reverseOrder());
        System.out.println("---------------");
        for(int x : numberList){
            System.out.println(x);
        }
        
        // find index
        int index = numberList.indexOf(1);
        System.out.println("---------------");
        System.out.println(index);
        
    }            
    
}
