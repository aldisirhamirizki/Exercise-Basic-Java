import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {
        double s, hitung;
        Scanner scanner = new Scanner(System.in);

        System.out.println("###-Luas Persegi-###");
        System.out.println("Masukan Sisi:");
        s = scanner.nextDouble();

        hitung = s * s;
        System.out.println("Luasnya adalah : " + hitung);
    }
}