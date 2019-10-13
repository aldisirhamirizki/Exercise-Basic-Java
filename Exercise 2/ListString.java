import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListString {
    public static void main(String[] args) {
        
        List<String> angka = new ArrayList<>();
        
        for(int i = 1; i < 51; i++) {
            String penampung;
            if(i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                penampung = "tiga-empat-lima";
            }
            else if(i % 3 == 0 && i % 5 == 0) {
                penampung = "tiga-lima";
            }
            else if(i % 3 == 0 && i % 4 == 0) {
                penampung = "tiga-empat";
            }
            else if(i % 3 == 0) {
                penampung = "tiga";
            }
            else if(i % 4 == 0) {
                penampung = "empat";
            }
            else if(i % 5 == 0) {
                penampung = "lima";
            }
            else {
                penampung = Integer.toString(i);
            }

            angka.add(penampung);
        }

        System.out.println("ini angka: " + angka);
    }
}