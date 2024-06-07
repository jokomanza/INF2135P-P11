package training;

public class Mahasiswa extends Manusia {
    String nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di Burjo");
    }
}
