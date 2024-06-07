package training;

public class Karyawan extends Manusia {
    String nip;

    public Karyawan() {
    }

    public Karyawan(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public void makan() {
        System.out.println("Karyawan makan di RM Padang");
    }
}
