import java.util.Arrays;

public class SortingBilangan {
    public static void main(String[] args) {
        int [] angka = {10,8,1,5,3,7,9,15,21,12,7,16,18,4};
        int data;
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Ini angka i : " + angka[i] + " index : " + i);
            for (int j = 0; j < angka.length; j++) {
                System.out.println("Ini Angka j : " + angka[j] +" index : " + j);
                if (angka[i] < angka[j]) {
                    System.out.println("Masookk ");
                    data = angka[i]; // 15
                    System.out.println("Ini Data : " + data);
                    angka[i] = angka[j]; // [0] = 21
                    angka[j] = data; // [8] = 15
                    System.out.println(Arrays.toString(angka));
                }
                else {System.out.println("wadaw");}
            }
        }
        System.out.println(Arrays.toString(angka));
    }
}