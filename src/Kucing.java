public class Kucing extends Binatang{
    public String Ras;
    private int Berat;
    
    public int getBerat()
    {
        return Berat;
    }

    public void setBerat(int Berat)
    {
        this.Berat = Berat;
    }

	@Override
	public void Cetak() {
		System.out.printf("Nama           : ");CetakNama();
		System.out.printf("Jenis          : "+Jenis+"\n");
		System.out.printf("Ras            : "+Ras+"\n");
        System.out.printf("Berat          : "+Berat+"\n");
		
	}

	@Override
	public void CetakNama() {
		System.out.printf(Nama+"\n");
	}
	
	@Override
	public void setRas(String Ras) {
		this.Ras = Ras;
		
	}

	@Override
	public void setKecepatan(int Kecepatan) {
	}
	
	@Override
	public int getKecepatan() {
		return 0;
	}
}
