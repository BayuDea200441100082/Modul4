package praktikum4;

public class main extends program {
    public static void main(String[] args) {
        main m = new main();
        m.setA(10.5);
        m.setB(0.5);
        m.setC();
        
        System.out.println("Aplikasi penjumlahan,pengurangan,perkalian,dan pembagian");
        System.out.println("Bilangan A : "+m.getA());
        System.out.println("Bilangan B : "+m.getB());
        System.out.println("-------------------------------");
        m.tampil();
        //penjumlahan
        penjumlahan jumlah = new penjumlahan();
        jumlah.setA(10.5);
        jumlah.setB(0.5);
        jumlah.setC();
        System.out.println("Penjumlahan");
        System.out.println("Bilangan A  : "+m.getA());
        System.out.println("Bilangan B  : "+m.getB());
        System.out.println("Hasil A + B : "+jumlah.getC());
        jumlah.tampil();
  
        pengurangan kurang = new pengurangan ();
        kurang.setA(10.5);
        kurang.setB(0.5);
        kurang.setC();
        System.out.println("----------------------------------");
        System.out.println("Pengurangan");
        System.out.println("Bilangan A  :"+kurang.getA());
        System.out.println("Bilangan B  :"+kurang.getB());
        System.out.println("Hasil A - B : "+kurang.getC());
        kurang.tampil();
        //perkalian
        perkalian kali = new perkalian ();
        kali.setA(10.5);
        kali.setB(0.5);
        kali.setC();
        System.out.println("----------------------------------");
        System.out.println("perkalian");
        System.out.println("Bilangan A  :"+kali.getA());
        System.out.println("Bilangan B  :"+kali.getB());
        System.out.println("Hasil A * B : "+kali.getC());
        kali.tampil();
        //pembagian
        pembagian bagi = new pembagian ();
        bagi.setA(10.5);
        bagi.setB(0.5);
        bagi.setC();
        System.out.println("----------------------------------");
        System.out.println("pembagian");
        System.out.println("Bilangan A  :"+bagi.getA());
        System.out.println("Bilangan B  :"+bagi.getB());
        System.out.println("Hasil A / B : "+bagi.getC());
        System.out.println("==================================");

        bagi.tampil();
    }
}

