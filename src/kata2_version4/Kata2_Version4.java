package kata2_version4;

import java.util.Iterator;
import java.util.Map;



public class Kata2_Version4 {

    public static void main(String[] args) {
        
        int [] data = {1, 2, 9, 8, 6, 3, 7, 1, 8, 1, 2, 7, 8, 6, 7};
        String [] data2 = {"laura", "susana", "pepe", "roberto", "laura", "alejandro", "carlos", "pepe", "mario"};
        
        Histogram meta_histogram = new Histogram(data2);
        
        Map<Integer, Integer> histogram =  meta_histogram.getHistogram();
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        } 
    }
   
}
