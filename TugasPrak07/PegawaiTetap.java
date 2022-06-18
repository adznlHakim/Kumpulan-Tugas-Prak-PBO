package TugasPrak07;

public class PegawaiTetap extends Pegawai{
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }
    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public double gaji() {
        return (int) getUpah();
    }

    public String toString() {
        return "Pegawai Tetap\t\t: " + getNama() + "\n" + super.toString()+ "\n" + "Upah\t\t\t\t: " + getUpah() +"\n" + "Pendapatan\t\t\t: Rp "+ gaji() +"\n";
    }
}
