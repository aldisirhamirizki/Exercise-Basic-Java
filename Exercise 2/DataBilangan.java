import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataBilangan {
    public static void main(String[] args) {

        Random rand = new Random();
        
        List<Integer> bilRandom = new ArrayList<>();
        
        int bil;
        
        for (int i = 0; i < 20; i++) {
            bil = rand.nextInt(6);
            bilRandom.add(bil);
        }
        System.out.println(bilRandom);

        for (int var : bilRandom) {
            System.out.print("ini ");
            System.out.println(var);
        }
    }
}