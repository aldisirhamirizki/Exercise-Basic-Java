import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CRUD {
    private static Scanner input = new Scanner(System.in);

    private static DaftarKaryawan dk = new DaftarKaryawan();

    private static List<DaftarKaryawan> listDk = new ArrayList<DaftarKaryawan>();

    private static String ulang = "y";

    public static void main(String[] args) {

        String pilih;

        while (ulang.equals("y")) {
            System.out.println("===========================");
            System.out.println("***Program Data Karyawan***");
            System.out.println(">> a. tampilkan data karyawan");
            System.out.println(">> b. masukan karyawan baru");
            System.out.println(">> c. update data karyawan");
            System.out.println(">> d. hapus data");
            System.out.println(">> e. exit");
            System.out.println(">> Pilihan anda [a/b/c/d/e] ?");
            pilih = input.next();

            switch (pilih) {
            case "a": {
                dataKaryawan();
                menuUtama();
                break;
            }
            case "b": {
                tambahData();
                dataKaryawan();
                menuUtama();
                break;
            }
            case "c": {
                updateData();
                dataKaryawan();
                menuUtama();
                break;
            }
            case "d": {
                hapusData();
                menuUtama();
                break;
            }
            case "e": {
                System.exit(0);
            }
            }
        }
    }

    private static void tambahData() {
        String nama, jabatan;
        Double salary;

        dk = new DaftarKaryawan();
        System.out.println("==============================");
        System.out.println("*****Insert Karyawan Baru*****");
        System.out.println(">> Masukan Nama: ");
        nama = input.next();
        System.out.println(">> Masukan Jabatan: ");
        jabatan = input.next();
        System.out.println(">> Masukan Salary: ");
        salary = input.nextDouble();

        int terbesar = 0;
        for (DaftarKaryawan dk : listDk) {
            terbesar = dk.getId();
        }
        if (listDk.isEmpty()) {
            dk.setId(1);
            dk.setNama(nama);
            dk.setJabatan(jabatan);
            dk.setSalary(salary);
        } else {
            dk.setId(terbesar + 1);
            dk.setNama(nama);
            dk.setJabatan(jabatan);
            dk.setSalary(salary);
        }

        listDk.add(dk);
    }

    private static void updateData() {
        int idk = 0;
        DaftarKaryawan dkUp = null;
        System.out.println("==============================");
        System.out.println("*****Update Data Karyawan*****");
        System.out.println(">> Masukan Id Karyawan: ");
        idk = input.nextInt();
        for (DaftarKaryawan dk : listDk) {
            if (idk == dk.getId()) {
                dkUp = dk;
            }
            
        }
        if (dkUp != null) {
            System.out.println(">> Nama sebelumnya : " + dkUp.getNama());
            System.out.println(">> Masukan Nama Baru : ");
            String nama = input.next();
            System.out.println(">> jabatan sebelumnya : " + dkUp.getJabatan());
            System.out.println(">> masukan jabatan baru : ");
            String jabatan = input.next();
            System.out.println(">> Salary sebelumnya : " + dkUp.getSalary());
            Double salary = input.nextDouble();

            listDk.remove(dkUp);
            dkUp.setNama(nama);
            dkUp.setJabatan(jabatan);
            dkUp.setSalary(salary);

            listDk.add(dkUp);
        }
        else {
            System.out.println(">> Data tidak ditemukan!!!");
        }
    }

    private static void hapusData() {
        int idk = 0;
        DaftarKaryawan dkDel = null;
        System.out.println("===============================");
        System.out.println("******Hapus Data Karyawan******");
        System.out.println(">> Masukan id yang ingin dihapus : ");
        idk = input.nextInt();
        for (DaftarKaryawan dk : listDk) {
            if (idk == dk.getId()) {
                dkDel = dk;
            }
        }
        if (dkDel != null) {
            System.out.println("-----------------------------------");
            System.out.println(">> id      :" + dkDel.getId() + "\n" + ">> nama    :" + dkDel.getNama() + "\n"
                    + ">> jabatan :" + dkDel.getJabatan() + "\n" + ">> salary  :" + dkDel.getSalary() + "\n");
            System.out.println(">> Hapus data di atas ? [y/t]");
            String pilihan = input.next();
            if (pilihan.equals("y")) {
                listDk.remove(dkDel);
                System.out.println(">> DAta berhasil dihapus!!!");
            }
        }
        else {
            System.out.println(">> Data tidak ditemukan!!!");
        }
        
    }

    private static void dataKaryawan() {
        if (!listDk.isEmpty()) {
            for (DaftarKaryawan dk : listDk) {
                System.out.println("===============================");
                System.out.println("*********Data Karyawan*********");
                System.out.println("--------------------------------");
                System.out.println("Id      :   " + dk.getId() + "\n" + "Nama    :   " + dk.getNama() + "\n"
                        + "Jabatan :   " + dk.getJabatan() + "\n" + "Salary  :   " + dk.getSalary() + "\n");
                System.out.println("--------------------------------");
            }
        } else {
            System.out.println(">> DATA MASIH KOSONG!!!");
        }
    }

    private static void menuUtama() {
        System.out.println("================================");
        System.out.println(">> Kembali ke menu utama?");
        ulang = input.next();
    }
}