import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        final double phi = 3.14;
        double r, hitung;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Jari-jari:");

        r = scanner.nextDouble();

        hitung = phi * r * r;

        System.out.println("Luas Lingkaran adalah: " + hitung);

    }
}