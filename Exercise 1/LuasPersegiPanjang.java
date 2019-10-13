import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        double p, l, hitung;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Panjang:");

        p = scanner.nextDouble();

        System.out.println("Masukan Lebar:");

        l = scanner.nextDouble();

        hitung = p * l;

        System.out.println("Luasnya Adalah: " + hitung);

    }
}