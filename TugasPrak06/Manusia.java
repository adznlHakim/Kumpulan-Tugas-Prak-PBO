package TugasPrak06;

public class Manusia {

    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;
    static int jumlah = 0;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean getMenikah() {
        return menikah;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getJenisKelamin() {
        if (jenisKelamin == true) {
            return "Laki-Laki";
        } else {
            return "Perempuan";
        }
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public double getTunjangan() {
        if (getMenikah() == true && jenisKelamin == true){
            return 25.0;
        } else if (getMenikah() == true && jenisKelamin == false){
            return 20.0;
        } else {
            return 15.0;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        jumlah++;
        return "\nNama\t\t\t: " + getNama() + "\nNIK\t\t\t\t: " + getNIK() + "\nJenis Kelamin\t: " + getJenisKelamin() + "\nPendapatan\t\t: " + getPendapatan() + "$";
    }
}
