import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class HapusBilangan {
    public static void main(String[] args) {
        
        Random rand = new Random();

        int bil;

        List<Integer> bilRandom = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            bil = rand.nextInt(6);
            bilRandom.add(bil);
        }
        System.out.println("Bilangan Random: " + bilRandom);
        
        Iterator<Integer> itr = bilRandom.iterator();
        while(itr.hasNext()) {
            Integer x = itr.next();
            if(x % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println("Bilangan Genap Dihapus: " + bilRandom);

        for(int a = 0; a < bilRandom.size(); a++) {
            if(bilRandom.get(a) == 3) {
                bilRandom.set(a, 0);
            }
        }
        System.out.println("Ubah Angka 3 : " + bilRandom);
    }
}