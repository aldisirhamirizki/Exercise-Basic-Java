import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double alas, tinggi, hitung;
       

       System.out.println("Masukan Alas");
        alas = scanner.nextDouble();

        System.out.println("Masukan Tinggi:");
        tinggi = scanner.nextDouble();

        hitung = (alas * tinggi) / 2;

        System.out.println("Luasnya Adalah: " + hitung);
    }
}