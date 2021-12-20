# FP_Java_ContactAPP_PBOF_07
## Kelompok 7
- Rizaldi Nur Rahman Naufal 05111940000201
- Afdhal Maruf Lukman 05111940007001
- Moh. Ilham Fakhri Zamzami 5025201275
- Aqil Ramadhan Hadiono 5025201261

1. Deskripsi singkat aplikasi
      Kami membuat aplikasi kontak telepon sederhana. Melalui aplikasi ini, user dapat melakukan operasi input/save data seperti membuat kontak baru. User juga dapat melakukan 
   operasi load data yakni mencari kontak yang sudah ada berdasarkan nomor telepon atau nama kontaknya.
      Referensi yang digunakan merupakan aplikasi billing sederhana. Dari referensi itu, kami modifikasi sedemikian rupa agar sesuai dengan kebutuhan aplikasi kontak telepon. 

2. Tools yang digunakan   
      Proses pembuatan interface dan kodingan menggunakan software Eclipse IDE dengan tools WindowBuilder yang sudah diinstall di dalamnya. Untuk menyimpan data, digunakan H2 Java 
   SQL Database dengan pertimbangan tools tersebut mudah digunakan dan ringan. Pastikan user terlebih dahulu menginstall H2 database sebelum menjalankan aplikasi ini. Setelah 
   menginstall Database, silahkan import tools jdbc tersebut ke dalam package aplikasi.
   
3. Diagram Kelas
      Kelas MainFrame adalah kelas yang digunakan untuk menampilkan halaman utama. Kelas Kontak adalah kelas yang akan digunakan sebagai objek frame Kontak yang akan pop-up/muncul    ketika pencarian suatu kontak ditemukan. Kelas AboutPage adalah frame yang akan muncul ketika user mengklik tombol “AboutPage” pada halaman utama (MainFrame). Kelas Kontak dan 
   AboutPage memiliki hubungan composition terhadap MainFrame. Artinya, apabila MainFrame hilang, maka keduanya juga hilang.


Download zip [disini](https://drive.google.com/uc?export=download&id=1GmqLXqQ4r0tzH6wGl_hNU264aleHhH6n)
