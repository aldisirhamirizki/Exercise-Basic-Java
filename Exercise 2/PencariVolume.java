import java.util.Scanner;

public class PencariVolume {
    private static Scanner input = new Scanner(System.in);
    
    private static String ulang = "y";
    public static void main(String[] args) {

        String nama, tempat_tinggal;

        System.out.println("Masukan Nama Anda: ");
        nama = input.nextLine();

        System.out.println("Masukan Tempat Tinggal:");
        tempat_tinggal = input.nextLine();
        while(ulang.equals("y")) {
            System.out.println(">>Selamat Datang " + nama + " Dari " + tempat_tinggal);
            System.out.println(">>Silahkan pilih volume bangunan apa yang ingin anda hitung?");
            System.out.println("a. hitung volume bola");
            System.out.println("b. hitung volume prisma segitiga");
            System.out.println("c. hitung volume kubus");
            System.out.println("d. hitung volume balok");
            System.out.println("e. exit");
            System.out.println("Pilihan [a/b/c/d/e]?");
            String pilih = input.next();

            switch (pilih) {
                case "a": {
                    volumeBola();
                    menuUtama();
                    break;
                }

                case "b": {
                    volumePrisma();
                    menuUtama();
                    break;
                }
                case "c": {
                    volumeKubus();
                    menuUtama();
                    break;
                }
                case "d": {
                    volumeBalok();
                    menuUtama();
                    break;
                }
                case "e": {
                    System.exit(0);
                }
            }
        }
    }

    private static void volumeBola() {
        Double phi, r, v;
        Double x = 3 / 4.0;
        phi = 3.14;
        System.out.println("==============================");
        System.out.println(">>  Hitung Volume Bola  <<");
        System.out.println("Masukan jari-jari: ");
        r = input.nextDouble();
        v = x * phi * r * r * r;
        System.out.println("==============================");
        System.out.println("hasil volume bola yaitu: " + v);
    }

    private static void volumePrisma() {
        Double luasAlas, tinggi, v;

        System.out.println();
        System.out.println("==============================");
        System.out.println(">> Rumus Volume Prisma <<");
        System.out.println("Masukan luas alas   : ");
        luasAlas = input.nextDouble();
        System.out.println("Masukan tinggi      : ");
        tinggi = input.nextDouble();

        v = luasAlas * tinggi;
        System.out.println("==============================");
        System.out.println("Hasil Volume Prisma adalah: " + v);
    }

    private static void volumeKubus() {
        Double s, v;

        System.out.println();
        System.out.println("==============================");
        System.out.println(">> Rumus volume kubus  <<");
        System.out.println("Masukan sisi    : ");
        s = input.nextDouble();
        v = s * s * s;
        System.out.println("==============================");
        System.out.println("hasilnya yaitu: " + v);
    }

    private static void volumeBalok() {
        Double p, l, t;

        System.out.println();
        System.out.println("==============================");
        System.out.println(">> Rumus Volume Balok <<");
        System.out.println("Masukan panjang : ");
        p = input.nextDouble();
        System.out.println("Masukan lebar   : ");
        l = input.nextDouble();
        System.out.println("Masukan Tinggi  : ");
        t = input.nextDouble();
        Double v = p * l * t;
        System.out.println("==============================");
        System.out.println("hasilnya yaitu: " + v);
    }

    private static void menuUtama() {
        System.out.println("==============================");
        System.out.println("Kembali ke menu utama?");
        ulang = input.next();
    }

}
