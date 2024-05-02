package cls;

public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;


    public Sales (String nama, String noKTP, int penjualan, double komisi){
        super(nama,noKTP);

        setPenjualann(penjualan);
        setKomisi (komisi);
    }

    public int getPenjualan(){
        return penjualan;
    }

    public double getKomisi(){
        return komisi;
    }

    public void setPenjualann (int penjualan){
        this.penjualan = penjualan;
    }

    public void setKomisi (double komisi){
        this.komisi = komisi;
    }

    public double gaji(){
        return penjualan * komisi;
    }

    public String toString(){
        return String.format("\nSales           :" + super.toString() + "\nTotal penjualan : " + getPenjualan() + "\nBesaran Komisi  : " + getKomisi() + "\nPendapatan      : Rp " + (int) gaji());
    }
    
}
