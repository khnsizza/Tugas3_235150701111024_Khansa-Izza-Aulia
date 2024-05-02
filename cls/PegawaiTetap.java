package cls;

public class PegawaiTetap extends Pegawai{

    private double upah;
    
    public PegawaiTetap(String nama, String noKTP, double Upah) {
        super(nama, noKTP);
        setUpah(Upah);
    }

    
    public void setUpah(double Upah) {
        this.upah = Upah;
    }
    
    public double getUpah() {
        return this.upah;
    }
    
    public double gaji() {
        return getUpah();
    }
    
    public String toString() {
        return String.format("\nPegawai Tetap   :" + super.toString() + "\nUpah            : " + getUpah() + "\nPendapatan      : Rp " + (int)gaji());
    }
}
