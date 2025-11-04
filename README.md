# TestUKL3
# Program Penghitung Rata-rata Nilai Siswa

## 🧩 Deskripsi Singkat
Program **TestUKLS3** adalah program berbasis **Java** yang digunakan untuk menghitung **rata-rata nilai siswa** pada suatu kelas.  
Program ini meminta jumlah siswa, kemudian menerima nilai setiap siswa satu per satu, memvalidasi agar nilai berada dalam rentang 0–100, dan akhirnya menampilkan total serta rata-rata nilai seluruh siswa.

---

## ⚙️ Cara Kerja Program

**1. Input Jumlah Siswa**
   ```java
   System.out.println("Masukkan jumlah siswa: ");
   int jumlahSiswa = input.nextInt();

-Pengguna diminta memasukkan jumlah siswa.
-Jika nilai ≤ 0, program akan menampilkan pesan kesalahan dan berhenti.

**2. Perulangan Input Nilai Tiap Siswa**
for (int i = 1; i <= jumlahSiswa; i++) {
    System.out.println("Masukkan nilai siswa ke-" + i + ": ");
    double nilai = input.nextDouble();
}
-Program menggunakan loop for untuk meminta nilai dari setiap siswa.

**3. Validasi Nilai**
if (nilai < 0 || nilai > 100) {
    System.out.println("Nilai tidak valid, masukkan antara 0-100!");
    i--;
    continue;
}

-Jika nilai di luar rentang 0–100, program meminta pengguna untuk memasukkan ulang.

**4. Perhitungan Total dan Rata-rata**

⚠️ Catatan: Pada kode kamu, perhitungan rata-rata dilakukan sebelum totalNilai ditambahkan.
Secara logis, baris perhitungan rata-rata seharusnya ditempatkan setelah perulangan agar hasilnya benar.

Logika yang benar seharusnya seperti berikut:
totalNilai += nilai;
...
double rataRata = totalNilai / jumlahSiswa;

**5. Menampilkan Hasil**
Program menampilkan hasil rekapitulasi berupa:
-Jumlah siswa
-Total nilai
-Nilai rata-rata dengan format dua angka di belakang koma

**Contoh Output (Setelah Logika Diperbaiki)**
System.out.println("\n=== Rekapitulasi Nilai Produktif RPL ===");
System.out.println("Jumlah Siswa: " + jumlahSiswa);
System.out.println("Total nilai: " + totalNilai);
System.out.println("Rata-rata nilai: " + String.format("%.2f", rataRata));

💡 Kesimpulan

Program ini menunjukkan konsep dasar:
-Perulangan (for)
-Validasi input
-Perhitungan rata-rata
-Format output menggunakan String.format

Program ini dapat dikembangkan lebih lanjut, misalnya dengan:
-Menampilkan nilai tertinggi dan terendah.
-Menyimpan data ke dalam array.
-Menambahkan fitur laporan nilai lengkap.

**🖥️ Cara Menjalankan**
1. Simpan kode dalam file: TestUKLS3.java
2. Kompilasi program: javac TestUKLS3.java
3. Jalankan program

<img width="681" height="231" alt="Screenshot 2025-11-04 161913" src="https://github.com/user-attachments/assets/ca1e2ad2-a947-4ee6-b7ba-4c15acad6cae" />
