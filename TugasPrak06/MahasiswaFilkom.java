package TugasPrak06;

public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;
    static int jumlah1;

    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, double IPK, String NIM) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus(){
        String angkatan="";
        String prodi="";
        angkatan = "20" + NIM.substring(0,2);
        switch (NIM.substring(6,7)){
            case "2" :
                prodi = "Teknik Meniup Gelembung";
                break;
            case "3" :
                prodi = "Teknik Berburu Ubur-Ubur";
                break;
            case "4" :
                prodi = "Sistem Perhamburgeran";
                break;
            case "6" :
                prodi = "Pendidikan Chum Bucket";
                break;
            case "7" :
                prodi = "Teknologi Telepon Kerang";
                break;
        }
        return prodi + ", "+ angkatan;
    }

    public double getBeasiswa(){
        if (IPK >= 3.0 && IPK < 3.5){
            return 50;
        } else if (IPK >= 3.5 && IPK <= 4.0){
            return 75;
        } else {
            return getTunjangan();
        }
    }

    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    public String toString(){
        jumlah1++;
        return super.toString() + "\nIPK\t\t\t\t: " + getIPK() + "\nNIM\t\t\t\t: " + getNIM() + "\nStatus\t\t\t: " + getStatus();
    }
}
