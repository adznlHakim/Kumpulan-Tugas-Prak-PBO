package TugasPrak06;

public class Main {
    static Manusia man[] ;
    static MahasiswaFilkom mhs[];
    static Pekerja pkj[];
    static Manajer mnjr[];

    public static void main(String[] args) {
        System.out.println("============ Daftar Manusia ============");
        man = new Manusia[3];
        man[0] = new Manusia("Bejo suherman", "3505022764519",true, false);
        man[1] = new Manusia("zulis putri", "3505087334556892",false, true);
        man[2] = new Manusia("Ronaldinho", "35066003835282635",true, true);
        for(int i = 0; i < 3; i++){
            System.out.println(man[i].toString());
        }
        System.out.print("\n");

        System.out.println("============ Daftar Mahasiswa ============");
        mhs = new MahasiswaFilkom[3];
        mhs[0] = new MahasiswaFilkom( "Sahiba Zulfa","8268186432328",false,false, 4.0, "215150700111010");
        mhs[1] = new MahasiswaFilkom("Siti Munasaroh","8238123261377",false,true, 3.7, "215150307111090");
        mhs[2] = new MahasiswaFilkom("Saldi Prasetya","8262328361318",true,true, 4.5, "215150201111004");
        for(int i = 0; i < 3; i++){
            System.out.println(mhs[i].toString());
        }
        System.out.print("\n");

        System.out.println("============ Daftar Pekerja ============");
        pkj = new Pekerja[3];
        pkj[0] = new Pekerja("Udin leader", "3589027355758", true, true, 5, 26,"5674372937373828");
        pkj[1] = new Pekerja("Satria tama", "3564857265389476", true, false, 10, 15, "563638462927334");
        pkj[2] = new Pekerja("Ahmad Panjol", "354618885498767", true, true, 8, 30, "575634244232320");
        for(int i = 0; i < 3; i++){
            System.out.println(pkj[i].toString());
        }
        System.out.print("\n");

        System.out.println("============ Daftar Manager ============");
        mnjr = new Manajer[3];
        mnjr[0] = new Manajer("Juwita","35235865145",false,true,2500, 10, 70, "73643726242718");
        mnjr[1] = new Manajer("Nilna muna","35226485957",false,false,3067, 8, 49, "5887468424373");
        mnjr[2] = new Manajer("Derry putra","35699981634",true,false,1678, 7, 54, "1883634242537");
        for(int i = 0; i < 3; i++){
            System.out.println(mnjr[i].toString());
        }
        System.out.println("================================================");

        System.out.println(" \n===== Total yang Terdaftar =====");
        System.out.println("===================================");
        System.out.println("Jumlah Manusia\t\t: " + man.length);
        System.out.println("Jumlah Mahasiswa\t: " + mhs.length);
        System.out.println("Jumlah Pekerja\t\t: " + pkj.length);
        System.out.println("Jumlah Manager\t\t: " + mnjr.length);
    }
}
