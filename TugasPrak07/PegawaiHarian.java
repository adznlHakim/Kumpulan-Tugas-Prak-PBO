package TugasPrak07;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }
    public int getTotalJam() {
        return totalJam;
    }
    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        if (totalJam <= 40){
            upahPerJam = upahPerJam * totalJam;
        } else if (totalJam > 40){
            upahPerJam = (upahPerJam * 40) + (totalJam - 40) * (upahPerJam * 1.5);
        } else {
            upahPerJam = 0;
        }
        return (int) this.upahPerJam;
    }

    public String toString() {
        return "Pegawai Harian\t\t: " + getNama() + "\n" + super.toString() + "\n" + "Upah/jam\t\t\t: " + getUpahPerJam() + "\n" + "Total jam kerja\t\t: " + getTotalJam() + "\n" + "Pendapatan\t\t\t: Rp " + gaji() + "\n";
    }
}
