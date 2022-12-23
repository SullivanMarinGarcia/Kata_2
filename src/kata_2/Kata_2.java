package kata_2;

import java.util.HashMap;
import java.util.Map;

public class Kata_2 {

    public static void main(String[] args) {
        int[] data = {1, 1, 1, 1, 1, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5};
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key: data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1: 1);
        }
        
        for (Map.Entry<Integer, Integer> valores: histogram.entrySet()) {
            System.out.println(valores.getKey() + " ==> " + valores.getValue());
        }
        
        
    }
    
}
