package main;
import cls.*;

public class main {
    public static void main(String[] args) {

        PegawaiTetap pegawaiTetap1 = new PegawaiTetap("Bayu","35072849032732489342" , 2000000.0);
        PegawaiTetap pegawaiTetap2 = new PegawaiTetap("Ayu", "35078972635162738971" , 3000000.0);
        PegawaiTetap pegawaiTetap3 = new PegawaiTetap("Nisa","35076374829018273646" , 4000000.0);
        PegawaiTetap pegawaiTetap4 = new PegawaiTetap("Rofi","35076738927483992834" , 4000000.0);

        PegawaiHarian pegawaiHarian1 = new PegawaiHarian("Edo","350728490327424892343", 8500.0, 40);
        PegawaiHarian pegawaiHarian2 = new PegawaiHarian("Kaka","35076273849201827462", 6500.0, 30);
        PegawaiHarian pegawaiHarian3 = new PegawaiHarian("Ilham","3507093747382938472", 9000.0, 50);
        PegawaiHarian pegawaiHarian4 = new PegawaiHarian("Budi","35070846839200384799", 9000.0, 50);

        Sales sales1 = new Sales("Tika", "350728490327424892344", 50, 50000.0);
        Sales sales2 = new Sales("Amanda","35078976472890013839", 30, 40000.0);
        Sales sales3 = new Sales("Ibnu", "350767348928664388392", 50, 50000.0);
        Sales sales4 = new Sales("Yahya", "350767348928664388392", 50, 50000.0);



        System.out.println("\n---------------------------------------");
        System.out.println(pegawaiTetap1.toString());
        System.out.println(pegawaiTetap2.toString());
        System.out.println(pegawaiTetap3.toString());
        System.out.println(pegawaiTetap4.toString());

        System.out.println("\n---------------------------------------");
        System.out.println(pegawaiHarian1.toString());
        System.out.println(pegawaiHarian2.toString());
        System.out.println(pegawaiHarian3.toString());
        System.out.println(pegawaiHarian4.toString());

        System.out.println("\n---------------------------------------");
        System.out.println(sales1.toString());
        System.out.println(sales2.toString());
        System.out.println(sales3.toString());
        System.out.println(sales4.toString());











    }
}

