package cls;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian (String nama, String noKTP, double UpahPerJam,int TotalJam ){
        
        super(nama, noKTP);
        setTotalJam(TotalJam);  
        setUpahPerJam(UpahPerJam);

      }

      public double getUpahPerJam(){
        return upahPerJam;
      }

      public int getTotalJam(){
        return totalJam;
      }

      public void setUpahPerJam(double UpahPerJam){
        this.upahPerJam = UpahPerJam;
      }

      public void setTotalJam (int TotalJam){
        this.totalJam = TotalJam;
      }


      public double gaji(){
        if (getTotalJam() >= 40){
            return (40 * getUpahPerJam()) + ((getTotalJam() - 40) * getUpahPerJam() * 1.5);
        } else {
            return getTotalJam() * getUpahPerJam();
        }

      }

      public String toString(){
        return String.format("\nPegawai Harian  :" + super.toString() + "\nUpah/jam        : " + getUpahPerJam() + "\nTotal jam kerja : " + getTotalJam() + "\nPendapatan      : Rp " + (int) gaji());
      }

}
