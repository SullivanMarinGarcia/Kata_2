package kata_2;

import java.util.HashMap;
import java.util.Map;

public class Kata_2 {

    public static void main(String[] args) {
        int[] data = {1, 1, 1, 1, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5};
        Histogram histo = new Histogram(data);
        
        
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        
        
        for (Map.Entry<Integer, Integer> valores: histogr.entrySet()) {
            System.out.println(valores.getKey() + " ==> " + valores.getValue());
        }
        
        
    }
    
}
