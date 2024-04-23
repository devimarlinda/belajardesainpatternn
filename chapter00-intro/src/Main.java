//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();
            mhs.nama = "Devi";
            mhs.nim = "2022573010087";
        System.out.println("Nama Mahasiswa : " + mhs.nama);
        System.out.println("Nim Mahasiswa : " + mhs.nim);

        Dosen dosen = new Dosen();
            dosen.nama = "Farah";
            dosen.nip = "19902726544324";
        System.out.println("Nama Dosen : " + dosen.nama);
        System.out.println("Nip Dosen : " + dosen.nip);

        Penguin pg = new Penguin();
        pg.nama = "depdep";
        pg.warna = "Biru";
        pg.display();
        pg.swim();


        Elang elg = new Elang();
        elg.nama= "bangbang";
        elg.warna = "hitam";
        elg.display();
        elg.terbang();

            Sepeda spd =new Sepeda();
            spd.bergerak();
            spd.berhenti();

        SepedaMotor mtr =new SepedaMotor();
        mtr.bergerak();
        mtr.berhenti();


    }
}
