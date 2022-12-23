/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata_2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sgarc
 */
public class Histogram {
    
    private final int[] data;

    public Histogram(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    
    
    public Map<Integer, Integer> getHistogram(){
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key: data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1: 1);
        }
        
        
        return histogram;
        
    }
    
}
