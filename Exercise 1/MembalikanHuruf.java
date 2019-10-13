public class MembalikanHuruf {
    public static void main(String[] args) {
        String kalimat = "bahasa pemrograman";
        String dibalik = "";

        for (int i = kalimat.length()-1; i >= 0; i--) {
            dibalik = dibalik + kalimat.charAt(i);
            
        }
        System.out.println("Kata dibalik jadi :" + dibalik);
    }
}