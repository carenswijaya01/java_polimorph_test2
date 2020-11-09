public class Anjing extends Binatang{
    private int Kecepatan;
    public String Ras;
    
    public void Cetak()
    {
        System.out.printf("Ras            : "+Ras+"\n");
        System.out.printf("Kecepatan      : "+Kecepatan+"\n");
    }

    public int getKecepatan()
    {
        return Kecepatan;
    }

    public void setKecepatan(int Kecepatan)
    {
        this.Kecepatan = Kecepatan;
    }
    
}
