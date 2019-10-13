import java.util.Scanner;

public class PencariHurufVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kalimat = "la la la aku sayang sekali doraemon";

        kalimat.toLowerCase();

        int[] jum = new int[256];

        for (int i = 0; i < 256; i++) {
            jum[i] = 0;
        }

        int jumlahVokal = 0;
        for ( int i = 0; i < kalimat.length(); i++) {
            jum[(int)kalimat.charAt(i)]++;
            if (kalimat.charAt(i) == 'a' || kalimat.charAt(i) == 'i' || 
                kalimat.charAt(i) == 'u' || kalimat.charAt(i) == 'e' ||
                kalimat.charAt(i) == 'o') {
                    jumlahVokal++;
            }
        }
        System.out.println();
        
        for (int i = 0; i < 256; i++) {
            if (jum[i] > 0) {
                if ((char) i == 'a' || (char) i == 'i' || (char) i == 'u' || (char) i == 'e' || (char) i == 'o') {
                    System.out.println("Jumlah Huruf " + (char)i + " adalah " + jum[i] );
                }
            }
        }
        System.out.println("\nJumlah vokal : " + jumlahVokal);

        System.out.println();
    }

}