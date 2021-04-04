public class Anjing extends Binatang{
	private int Kecepatan;
    public String Ras;

    public int getKecepatan()
    {
        return Kecepatan;
    }

    public void setKecepatan(int Kecepatan)
    {
        this.Kecepatan = Kecepatan;
    }

	@Override
	public void Cetak() {
		System.out.printf("Nama           : ");CetakNama();
		System.out.printf("Jenis          : "+Jenis+"\n");
		System.out.printf("Ras            : "+Ras+"\n");
        System.out.printf("Kecepatan      : "+Kecepatan+"\n");
		
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
	public void setAtribut(int obj, int nilai) {
		if(obj == 0) {
			this.Kecepatan = nilai;
		}
	}

	@Override
	public int getAtribut(int obj) {
		if (obj == 0) {
			return Kecepatan;
		}
		return 0;
	}
}
