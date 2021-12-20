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
      Proses pembuatan interface dan kodingan menggunakan software Eclipse IDE dengan tools WindowBuilder yang sudah diinstall di dalamnya. Untuk menyimpan data, digunakan H2 
   Java SQL Database dengan pertimbangan tools tersebut mudah digunakan dan ringan. Pastikan user terlebih dahulu menginstall H2 database sebelum menjalankan aplikasi ini. 
   Setelah menginstall Database, silahkan import tools jdbc tersebut ke dalam package aplikasi.
   
3. Diagram Kelas
      Kelas MainFrame adalah kelas yang digunakan untuk menampilkan halaman utama. Kelas Kontak adalah kelas yang akan digunakan sebagai objek frame Kontak yang akan 
   pop-up/muncul ketika pencarian suatu kontak ditemukan. Kelas AboutPage adalah frame yang akan muncul ketika user mengklik tombol “AboutPage” pada halaman utama
   (MainFrame). Kelas Kontak dan AboutPage memiliki hubungan composition terhadap MainFrame. Artinya, apabila MainFrame hilang, maka keduanya juga hilang.
   
4. Alur Pembuatan Aplikasi1) Membuat halaman menu utama dalam Class MainFrame yang terdiri dari interface buat kontak baru , interface cari kontak, serta tombol halaman about. GUI dan segala
         actionnya diletakkan dalam fungsi initialize().
            - Buat terlebih dahulu frame utama sebagai wadah untuk interface yang selainnya, beri judul “Java Kontak app sederhana”. Gunakan layout absolute agar fleksibel
              dalam menaruh GUI nya. Gunakan actionListener terhadap tombol “Buat kontak baru”.
            - Buat panel baru yang berisikan label, field, dan tombol, untuk menginput data kontak baru.
            - Buat label “Cari kontak”, field untuk mencari kontak, tombol “cari”, tombol “buat kontak”, dan tombol “about page”.
            - Pastikan panel daftar kontak baru agar tidak kelihatan sebelum diklik tombol “Buat kontak baru”.
      2) Hubungkan MainFrame dengan H2 database
            - Deklarasikan objek tipe Connection di dalam Class MainFrame.
            - Lalu, buat koneksi dengan Database.
      3) Mempersiapkan table dalam database
            - Buat fungsi createTableNew() dalam Class MainFrame.
            - Panggil method tersebut dalam method inisialisasi GUI “initialize()”.
      4) Buat halaman About di class AboutPage. GUI diletakkan dalam fungsi constructor AboutPage()
            - Buat terlebih dahulu frame utama sebagai wadah untuk interface yang selainnya, beri judul “About Page”. Gunakan layout absolute agar fleksibel dalam menaruh GUI 
              nya. Pastikan operasi saat close disetting (DISPOSE_ON_CLOSE).
            - Lalu, isikan dengan judul “About this app” menggunakan label . Deskripsi singkat tentang aplikasi serta pembuat aplikasi menggunakan JTextArea. Pastikan JTextArea 
              tersebut diset agar tidak dapat diedit.
      5) Tampilkan halaman about Ketika user meng-klik tombol “About Page” pada halaman utama MainFrame.
            - Buat actionListener pada tombol “About Page” di MainFrame Lalu isikan dengan potongan kode seperti gambar di bawah ini. Hal ini akan secara otomatis membuat objek 
              AboutPage() dengan default constructor-nya yang berisikan fungsi initialize() yang berfungsi untuk menampilkan GUI-nya ketika setVisible(true).
      6) Setelah user melakukan proses input data kontak baru pada MainFrame, buat actionListener ketika user meng-klik tombol “Buat baru”
            - ActionListener digunakan untuk memasukkan input User dari setiap field ke dalam kolom table “KONTAK” yang sudah dibuat sebelumnya di dalam Database H2.
      7) Buat Frame kontak untuk menampilkan hasil pencarian. GUI diletakkan dalam constructor Kontak()
            - Buat terlebih dahulu frame utama sebagai wadah untuk interface yang selainnya, beri judul “Kontak ditemukan”. Gunakan layout absolute agar fleksibel dalam menaruh 
              GUI nya. Pastikan operasi saat close disetting (DISPOSE_ON_CLOSE).
            - Buat UI nya. Terdiri dari beberapa field dan label.
      8) Buat actionListener pada tombol “Cari” ketika user melakukan pencarian data
            - ActionListener digunakan untuk meng-“fetch” sebuah baris dalam table yang sesuai dengan pencarian yang diinginkan.
            - Kemudian setiap kolom dari baris yang di-“fetch” itu dimasukkan ke dalam masing-masing field yang relevan di objek Kontak.
            - Jangan lupa untuk terlebih dahulu membuat Objek Kontak dalam Class MainFrame, nantinya akan digunakan untuk menampilkan hasil pencarian.
            - Alternatif lain apabila user menekan “Enter” pada tombol “Cari”.


Download zip [disini](https://drive.google.com/uc?export=download&id=1GmqLXqQ4r0tzH6wGl_hNU264aleHhH6n)
