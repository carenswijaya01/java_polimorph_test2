public abstract class Binatang implements Perilaku {
    protected String Nama;
    protected String Jenis;
    public abstract void Cetak();
    public abstract void setRas(String Ras);
    public abstract void setKecepatan(int Kecepatan);
    public abstract void setBerat(int Berat);
    public abstract int getKecepatan();
    public abstract int getBerat();
}
