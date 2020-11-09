public class Kucing extends Binatang{
    public String Ras;
    private int Berat;
    
    public void Cetak()
    {
        System.out.printf("Ras            : "+Ras+"\n");
        System.out.printf("Berat          : "+Berat+"\n");
    }
    
    public void setBerat(int Berat)
    {
        this.Berat = Berat;
    }
}
