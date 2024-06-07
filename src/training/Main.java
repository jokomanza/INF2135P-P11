package training;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("123456", "Budi");
        Karyawan karyawan = new Karyawan("789012", "Joko");

        Manusia manusia = new Manusia();
        manusia.makan();

        manusia = mahasiswa;
        manusia.makan();

        manusia = karyawan;
        manusia.makan();
    }
}
