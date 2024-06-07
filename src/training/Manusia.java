package training;

public class Manusia {
    String nama;

    public Manusia() {
    }

    public Manusia(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void makan() {
        System.out.println("Manusia sedang makan");
    }
}
