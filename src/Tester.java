
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner string = new Scanner(System.in);

        Anjing a = new Anjing();
        Binatang b = new Binatang();
        Kucing k = new Kucing();

        int i, jmlh, menu, maks;

        System.out.printf("Masukkan jumlah binatang: ");
        jmlh = scan.nextInt();
        System.out.println("");

        String[] nama = new String[jmlh];
        int[] jenis = new int[jmlh];
        String[] aras = new String[jmlh];
        String[] kras = new String[jmlh];
        int[] cepat = new int[jmlh];
        int[] berat = new int[jmlh];

        for (i = 1; i <= jmlh; i++) {
            System.out.printf("Binatang #" + i + "\n");
            System.out.printf("1. Anjing\n");
            System.out.printf("2. Kucing\n");
            System.out.printf("Jenis Binatang: ");
            jenis[i - 1] = scan.nextInt();
            switch (jenis[i - 1]) {
                case 1:
                    System.out.printf("Masukkan nama      : ");
                    nama[i - 1] = string.nextLine();
                    System.out.printf("Masukkan ras       : ");
                    aras[i - 1] = string.nextLine();
                    System.out.printf("Masukkan kecepatan : ");
                    cepat[i - 1] = scan.nextInt();
                    System.out.println("");
                    break;
                case 2:
                    System.out.printf("Masukkan nama      : ");
                    nama[i - 1] = string.nextLine();
                    System.out.printf("Masukkan ras       : ");
                    kras[i - 1] = string.nextLine();
                    System.out.printf("Masukkan berat     : ");
                    berat[i - 1] = scan.nextInt();
                    System.out.println("");
                    break;
                default:
                    System.out.printf("Inputan Salah\n\n");
                    i--;
                    break;
            }
        }

        do {
            System.out.printf("\n");
            System.out.printf("===== TUGAS PEMROGRAMAN =====\n");
            System.out.printf("===== POLIMORFISME JAVA =====\n");
            System.out.printf("1.Tampilkan semua nama binatang\n");
            System.out.printf("2.Tampilkan semua DATA binatang\n");
            System.out.printf("3.Tampilkan binatang terberat\n");
            System.out.printf("4.Tampilkan binatang tercepat\n");
            System.out.printf("5.Exit\n");
            System.out.printf("Pilihan: ");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("");
                    System.out.println("");
                    System.out.printf("===== Menu 1 : Semua Nama Binatang =====\n");
                    for (i = 1; i <= jmlh; i++) {

                        b.Nama = nama[i - 1];

                        System.out.printf(i + "." + b.Nama + "\n");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("");
                    System.out.printf("===== Menu 2 : Semua DATA Binatang =====\n\n");
                    for (i = 1; i <= jmlh; i++) {

                        b.Nama = nama[i - 1];
                        a.Ras = aras[i - 1];
                        k.Ras = kras[i - 1];
                        a.setKecepatan(cepat[i - 1]);
                        k.setBerat(berat[i - 1]);

                        System.out.printf("DATA binatang ke #" + i + "\n");
                        if (jenis[i - 1] == 1) {
                            b.Jenis = "Anjing";
                            b.Cetak();
                            a.Cetak();
                        } else {
                            b.Jenis = "Kucing";
                            b.Cetak();
                            k.Cetak();
                        }
                        System.out.println("");
                    }
                    break;

                case 3:
                    String knama;
                    System.out.println("");
                    System.out.println("");
                    System.out.printf("===== Menu 3 : DATA Binatang Terberat =====\n\n");
                    if (jmlh != 0) {
                        maks = berat[0];
                        knama = nama[0];
                        for (i = 1; i <= berat.length; i++) {
                            if (berat[i - 1] > maks) {
                                maks = berat[i - 1];
                                knama = nama[i - 1];
                            }
                        }
                        if (maks != 0) {
                            System.out.printf("Kucing %s adalah yang terberat (%d kg)\n\n", knama, maks);
                        } else {
                            System.out.printf("Tidak ada data kucing\n\n");
                        }
                    } else {
                        System.out.printf("Tidak ada data kucing\n\n");
                    }
                    break;

                case 4:
                    String anama;
                    System.out.println("");
                    System.out.println("");
                    System.out.printf("===== Menu 4 : DATA Binatang Tercepat =====\n\n");
                    if (jmlh != 0) {
                        maks = cepat[0];
                        anama = nama[0];
                        for (i = 1; i <= cepat.length; i++) {
                            if (cepat[i - 1] > maks) {
                                maks = cepat[i - 1];
                                anama = nama[i - 1];
                            }
                        }
                        if (maks != 0) {
                            System.out.printf("Anjing %s adalah yang terberat (%d mph)\n\n", anama, maks);
                        } else {
                            System.out.printf("Tidak ada data anjing\n\n");
                        }
                    } else {
                        System.out.printf("Tidak ada data anjing\n\n");
                    }
                    break;

                case 5:
                    break;
                default:
                    System.out.printf("Input Salah\n\n");
                    break;
            }
        } while (menu != 5);
    }
}
