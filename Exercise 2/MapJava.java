import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapJava{
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<String, String>();

        map.put("TBDM", "The Black Dahlia Murder");
        map.put("GNR", "Guns N Roses");
        map.put("BMTH", "Bring Me The Horizon");

        System.out.println("Using entrySet and manual String creation");
        for(Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println();

        System.out.println("Using Keyset");
        for(String m : map.keySet()) {
            System.out.println(m + " " + map.get(m));
        }

        System.out.println();

        System.out.println("Using entrySet");
        for(Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();
        
    }
}