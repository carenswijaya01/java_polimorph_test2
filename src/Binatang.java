public abstract class Binatang implements Perilaku {
    protected String Nama;
    protected String Jenis;
    public abstract void Cetak();
    public abstract void setRas(String Ras);
    public abstract void setAtribut(int obj, int nilai);
    public abstract int getAtribut(int obj);
}
