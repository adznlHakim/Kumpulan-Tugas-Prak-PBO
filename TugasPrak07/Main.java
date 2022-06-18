package TugasPrak07;

public class Main {

    public static void main(String[] args) {
        System.out.println("========== Pegawai Tetap ==========");
        PegawaiTetap pgwT1 = new PegawaiTetap("Muhammad", "3505011111100756", 1000000);
        PegawaiTetap pgwT2 = new PegawaiTetap("Adzinul", "35050844776628746", 1600000);
        PegawaiTetap pgwT3 = new PegawaiTetap("Hakim", "35050887362413288", 3800000);
        System.out.println(pgwT1);
        System.out.println(pgwT2);
        System.out.println(pgwT3);

        System.out.println("========== Pegawai Harian ==========");
        PegawaiHarian pgwH1 = new PegawaiHarian("Zakia", "350506911123445", 7300, 49);
        PegawaiHarian pgwH2 = new PegawaiHarian("Dila", "3505099990000244", 10000, 37);
        PegawaiHarian pgwH3 = new PegawaiHarian("Juki", "3505077883339203", 28500, 28);
        System.out.println(pgwH1);
        System.out.println(pgwH2);
        System.out.println(pgwH3);

        System.out.println("========== Sales ==========");
        Sales sls1 = new Sales("Lilis", "35050113445892938", 56, 47000);
        Sales sls2 = new Sales("Doni", "35050887734323287", 39, 63000);
        Sales sls3 = new Sales("Samson", "35050288876223007", 84, 52000);
        System.out.println(sls1);
        System.out.println(sls2);
        System.out.println(sls3);
    }
}
