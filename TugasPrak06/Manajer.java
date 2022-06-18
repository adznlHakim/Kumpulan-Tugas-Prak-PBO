package TugasPrak06;

public class Manajer extends Pekerja {
    private int lamaKerja;
    static int jumlah3;

    public Manajer(String nama, String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja, int jamKerja, int hariKerja, String NIP) {
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, NIP);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public double getBonus() {
        return super.getBonus() + (super.getBonus() * (30/100));
    }

    public double getTunjangan() {
        return super.getTunjangan() + 15;
    }

    public String toString(){
        jumlah3++;
        return super.toString() + "\nLama kerja\t\t: " + getLamaKerja() + " hari";
    }
}
