package kata_2;

import java.util.HashMap;
import java.util.Map;

public class Kata_2 {

    public static void main(String[] args) {
        String[] data = {"Carlos", "Carlos", "Pedro", "Arturo", "Pedro", "Carlos"};
        Histogram histo = new Histogram(data);
        
        
        Map<String,Integer> histogr = histo.getHistogram();
        
        
        
        
        
        for (Map.Entry<String, Integer> valores: histogr.entrySet()) {
            System.out.println(valores.getKey() + " ==> " + valores.getValue());
        }
        
        
    }
    
}
