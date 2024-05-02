package cls;

public abstract class Pegawai {

    private String nama;
    private String noKTP;

    public Pegawai (String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }
    public String getnama(){
        return this.nama;

    }
    public String getnoKTP(){
        return this.noKTP;
    }

    public String toString(){
        return String.format(" " + getnama() +"\nNo. KTP         : " + getnoKTP());

    }

    public abstract double gaji();

}
