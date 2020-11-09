public class Binatang {
    protected String Nama;
    protected String Jenis;

    public void Cetak()
    {
        System.out.printf("Jenis Binatang : "+Jenis+"\n");
        System.out.printf("Nama           : "+Nama+"\n");
    }
    
    public void setNama(String Nama)
    {
        this.Nama = Nama;
    }
}
