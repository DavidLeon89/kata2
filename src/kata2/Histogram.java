package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[] data;


    public Histogram(int[] array) {
        this.data = array;
    }
    
    public int[] getArray() {
        return data;
    }
    
    public Map<Integer,Integer> getHistogram(){
        Map <Integer,Integer> datos = new HashMap<>();
            for (int i : data) {
                    datos.put(i, datos.containsKey(i) ? datos.get(i) + 1 : 1); 
            }
        return datos;
    }
}