import java.util.*;

public class Tester {
	static Scanner s = new Scanner(System.in);
	static boolean cekKucing;
	static boolean cekAnjing;
	static List<Binatang> ar = new ArrayList<Binatang>();
	static Binatang a;
	static Binatang k;
	
	public static void semuaNama() {
		int i=0;
		for(Binatang nama : ar) {
			i++;
			System.out.print(i+". ");
			nama.CetakNama();
		}
		System.out.println("");
	}
	
	public static void semuaData() {
		for(Binatang data : ar) {
			data.Cetak();
			System.out.println("");
		}
	}
	
	public static void terCepat() {
		if(cekAnjing) {
			int cepat = 0;
	        for (int i = 1; i < ar.size(); i++){
	            if (ar.get(i).getKecepatan() > ar.get(cepat).getKecepatan()){
	                cepat = i;
	            }
	        }
	        System.out.println("Anjing tercepat adalah " + ar.get(cepat).Nama + " dengan kecepatan : " + ar.get(cepat).getKecepatan() + " (mph)");
		}else {
			System.out.println("Tidak ada data anjing\n");
		}
		System.out.println("");
	}
	
	public static void terBerat() {
		if(cekKucing) {
			int berat = 0;
	        for (int i = 1; i < ar.size(); i++){
	            if (ar.get(i).getBerat() > ar.get(berat).getBerat()){
	                berat = i;
	            }
	        }
	        System.out.println("Kucing terberat adalah " + ar.get(berat).Nama + " dengan berat : " + ar.get(berat).getBerat() + " (kg)");
		}else {
			System.out.println("Tidak ada data kucing\n");
		}
		System.out.println("");
	}
	
	public static void menu() {
		int menu;
		System.out.println("\n");
		do {
			System.out.println("MENU UTAMA");
			System.out.println("1. Tampilkan semua nama binatang");
			System.out.println("2. Tampilkan semua data binatang");
			System.out.println("3. Tampilkan binatang tercepat");
			System.out.println("4. Tampilkan binatang terberat");
			System.out.println("5. Exit");
			System.out.print("Pilihan Menu: ");menu = s.nextInt();
			switch(menu) {
			case 1: 
				System.out.println("\n====== MENU 1. SEMUA NAMA BINATANG ======");
				semuaNama();
				break;
			case 2: 
				System.out.println("\n====== MENU 2. SEMUA DATA BINATANG ======");
				semuaData();
				break;
			case 3:
				System.out.println("\n====== MENU 3. BINATANG TERCEPAT ======");
				terCepat();
				break;
			case 4:
				System.out.println("\n====== MENU 4. BINATANG TERBERAT ======");
				terBerat();
				break;
			case 5: break;
			default:
				System.out.println("Inputan Anda Salah\n");
				break;
			}
		}while (menu != 5);
	}
	
	public static void main(String[] args) {
		System.out.print("Masukkan jumlah Binantang: ");
		int inp = s.nextInt();
		int i = 0;
		do 
		{
			System.out.println("\nBinatang #"+(i+1));
			System.out.println("1. Anjing");
			System.out.println("2. Kucing");
			System.out.print("Jenis binatang: ");
			int jenis = s.nextInt();
			switch(jenis) 
			{
			case 1:
				a = new Anjing();
				a.Jenis = "Anjing";
				System.out.print("Masukkan nama: ");a.Nama = s.next();
				System.out.print("Masukkan ras: ");a.setRas(s.next());
				System.out.print("Masukkan kecepatan: ");a.setKecepatan(s.nextInt());
				cekAnjing = true;
				i++;
				ar.add(a);
				break;
			case 2:
				k = new Kucing();
				k.Jenis = "Kucing";
				System.out.print("Masukkan nama: ");k.Nama = s.next();
				System.out.print("Masukkan ras: ");k.setRas(s.next());
				System.out.print("Masukkan berat: ");k.setBerat(s.nextInt());
				cekKucing = true;
				i++;
				ar.add(k);
				break;
			default:
				System.out.println("Inputan Salah");
				break;
			}
		}while(i < inp);
		menu();
	}
}
