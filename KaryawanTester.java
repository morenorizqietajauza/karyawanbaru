
public class KaryawanTester {
    public static void main(String[] args) {
        Karyawan Gilam = new Karyawan(24,"Gilam","TU","Bekasi");
        Karyawan Nibras = new Karyawan(29, "Nibras", "TU", "lamongan");
        Karyawan Burhan = new Karyawan(26, "Burhan", "Kurikulum", "Tulungagung");
        Karyawan Bintang = new Karyawan(25, "Bintang", "Kesiswaan", "Inggris");
        Karyawan Azam = new Karyawan(22, "Azam", "Kurikulum", "Malang");

        Moreno.print();
        System.out.println();
        Nibras.print();
        System.out.println();
        Burhan.print();
        System.out.println();
        Bintang.print();
        System.out.println();
        Azam.print();
    }
}