import java.util.Scanner;

public class TestUKLS3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Meminta jumlah siswa
        System.out.println("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        //Validasi input
        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0!");
            input.close();
            return;
            
        }

        double totalNilai = 0;

        //Perulangan untuk input nilai setiap siswa
        for(int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();

            //Validasi nilai (0-100)
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, masukkan antara 0-100!");
                i--;
                continue;
            }

            //Menghitung rata-rata
            double rataRata = totalNilai / jumlahSiswa;

            //Hasil
            System.out.println("\n=== Rekapitulasi Nilai Produktif RPL ===");
            System.out.println("Jumlah Siswa: " + jumlahSiswa);
            System.out.println("Total nilai: " + totalNilai);
            System.out.println("Rata-rata nilai: " + String.format("%.2f", rataRata));
        }
    }
}
