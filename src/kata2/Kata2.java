package kata2;
import java.util.HashMap; 
import java.util.Map;
import java.util.Arrays;

public class Kata2 {
    public static void main(String[] args) {
        String[] datos = {"Rosa", "Pepe", "Juan", "Pepe", "Pepe", "Rosa"};        
        Histogram histo = new Histogram(datos);
        Map<String,Integer> histogr = histo.getHistogram();
        for (String key : histogr.keySet()){
           System.out.println(key + "==>" + histogr.get(key)); 
        }
       
       System.out.println("=============");
       System.out.println(Arrays.asList(histogr));
       System.out.println("=============");
       System.out.println(histogr.entrySet());
    }
    
}
