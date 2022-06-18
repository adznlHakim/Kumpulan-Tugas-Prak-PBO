package TugasPrak07;

public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.komisi = komisi;
        this.penjualan = penjualan;
    }

    public int getPenjualan() {
        return penjualan;
    }
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }
    public double getKomisi() {
        return komisi;
    }
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double gaji(){
        double x ;
        x = getPenjualan() * getKomisi();
        return (int) x;
    }

    public String toString() {
        return "Sales\t\t\t\t: " + getNama() + "\n" + super.toString()+ "\n" + "Total Penjualan\t\t: " + getPenjualan() + "\n" + "Besaran Komisi\t\t: " + getKomisi() + "\n" + "Pendapatan\t\t\t: Rp " + gaji() + "\n";
    }
}
