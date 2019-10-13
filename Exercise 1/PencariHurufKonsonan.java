import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PencariHurufKonsonan {
    public static void main(String[] args) {
        String kalimat = "la la la aku sayang sekali doraemon";

        List<Character> kumpulanHurufKonsonan = new ArrayList<>();
        List<Character> kumpulanHurufVokal = new ArrayList<>();

        for(int i = 0; i < kalimat.length(); i++) {
            if ((kalimat.charAt(i) != 'a') && 
                (kalimat.charAt(i) != 'i') && 
                (kalimat.charAt(i) != 'u') &&
                (kalimat.charAt(i) != 'e') &&
                (kalimat.charAt(i) != 'o') && (kalimat.charAt(i) != ' ')) {
                
                kumpulanHurufKonsonan.add(kalimat.charAt(i));
            }         
            else {
                if(kalimat.charAt(i) != ' ') kumpulanHurufVokal.add(kalimat.charAt(i));
            }  
        }
        
        System.out.println(Arrays.toString(kumpulanHurufKonsonan.toArray()));

        // for(int i = 0; i < kalimat.length(); i++) {
        //     if ((kalimat.charAt(i) == 'a') ||
        //         (kalimat.charAt(i) == 'i') ||
        //         (kalimat.charAt(i) == 'u') ||
        //         (kalimat.charAt(i) == 'e') ||
        //         (kalimat.charAt(i) == 'o')){

        //         kumpulanHurufVokal.add(kalimat.charAt(i));
        //     }
        // }
        System.out.println(Arrays.toString(kumpulanHurufVokal.toArray()));
    //     int[] jum = new int[256];

    //     for (int i = 0; i < 256; i++) {
    //         jum[i] = 0;
    //     }

    //     int jumlahKonsonan = 0;
    //     for (int i = 0; i < kalimat.length(); i++) {
    //         jum[(int)kalimat.charAt(i)]++;
    //         if (kalimat.charAt(i) == 'b' ||
    //             kalimat.charAt(i) == 'c' ||
    //             kalimat.charAt(i) == 'd' ||
    //             kalimat.charAt(i) == 'f' ||
    //             kalimat.charAt(i) == 'g' ||
    //             kalimat.charAt(i) == 'h' ||
    //             kalimat.charAt(i) == 'j' ||
    //             kalimat.charAt(i) == 'k' ||
    //             kalimat.charAt(i) == 'l' ||
    //             kalimat.charAt(i) == 'm' ||
    //             kalimat.charAt(i) == 'n' ||
    //             kalimat.charAt(i) == 'p' ||
    //             kalimat.charAt(i) == 'q' ||
    //             kalimat.charAt(i) == 'r' ||
    //             kalimat.charAt(i) == 's' ||
    //             kalimat.charAt(i) == 't' ||
    //             kalimat.charAt(i) == 'v' ||
    //             kalimat.charAt(i) == 'w' ||
    //             kalimat.charAt(i) == 'x' ||
    //             kalimat.charAt(i) == 'y' ||
    //             kalimat.charAt(i) == 'z' 
    //             ) {
    //             jumlahKonsonan++;
    //         } 
    //     }
    //     System.out.println();

    //     for (int i = 0; i < 256; i++) {
    //         if (jum[i] > 0) {
    //             if ((char) i == 'b' ||
    //                 (char) i == 'c' ||
    //                 (char) i == 'd' ||
    //                 (char) i == 'd' ||
    //                 (char) i == 'f' ||
    //                 (char) i == 'g' ||
    //                 (char) i == 'h' ||
    //                 (char) i == 'j' ||
    //                 (char) i == 'k' ||
    //                 (char) i == 'l' ||
    //                 (char) i == 'm' ||
    //                 (char) i == 'n' ||
    //                 (char) i == 'p' ||
    //                 (char) i == 'q' ||
    //                 (char) i == 'r' ||
    //                 (char) i == 's' ||
    //                 (char) i == 't' ||
    //                 (char) i == 'v' ||
    //                 (char) i == 'w' ||
    //                 (char) i == 'x' ||
    //                 (char) i == 'y' ||
    //                 (char) i == 'z'
    //                 ) {
    //                 System.out.println("Jumlah huruf " + (char)i + " adalah " + jum[i] );
    //             }
    //         }
    //     }
    //     System.out.println("\nJumlah Konsonan :" + jumlahKonsonan);
    // }
}
}