import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Kalimat: ");
        String kalimat = input.nextLine();

        int i1 = 0;
        int i2 = kalimat.length()-1;

        for (int a = 0; a < kalimat.length(); a++) {
            if (kalimat.charAt(a) == kalimat.charAt(i2)) {
                i2 = i2-1;
                i1 += 1;
            } else {
                break;
            }
        }
        if (i1 == kalimat.length()) {
            System.out.println("kalimat " + kalimat + " adalah Palindrom");
        }
        else {
            System.out.println("Kalimat " + kalimat + " Bukan Palindrom");
        }

    }
}