public class BilanganGanjil {
    public static void main(String[] args) {
        int[] angka = {10,8,1,5,3,7,9,15,21,12,7,16,18,4};

        for (int i = 0; i < angka.length; i++) {
            System.out.println("HASIL SISA BAGI: " + (angka[i] % 2));
            if (angka[i] % 2 != 0) {
                System.out.println( angka[i] + "");
            }
        }
        System.out.println();
    }
}