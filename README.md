# Deskripsi Singkat Sistem Manajemen Pengelolaan Rumah Subsidi:

Sistem manajemen pengelolaan rumah suubsidi dibuat untuk administrasi dalam mengelola pendataan rumah subsidi, data pembeli, dokumen persyaratan pengajuan pembelian, pengajuan rumah subsidi sampai dengan proses pembayaran. Sistem ini ditujukan untuk bagian administrasi atau admin. 

# Penjelasan alur program:

Admin dapat memasukkan dan mengelola data rumah subsidi, admin juga dapat memasukkan data calon pembeli secara umum yang pasti digunakan sebagai syarat dalam mengajukan pembelian rumah subsidi, jika data calon pembeli sudah terinput ke dalam sistem calon pembeli harus melengkapi dokumen persyaratan agar bisa melakukan proses pengajuan pembelian rumah subsidi lalu akan diverivikasi dokumennya. Dokumen yang dilampirkan harus lengkap jika tidak maka calon pembeli tidak bisa mengajukan pembelian rumah subsidi. kemudian buat pengajuan pembelian dan akan dilakukan cek penghasilan yang didapat. Untuk bisa melakukan pengajuan calon pembeli harus memiliki penghasilan minimal 2 jt, jika tidak memenuhi maka tidak bisa disetujui pengajuannya. Setelah itu kembali dilakukan verifikasi  untuk memastikan persyaratan telah terpenuhi. Jika pengajuan telah diverifikasi dan disetujui langsung dilanjutkan ke tahap pembayaran. Pembayaran dapat dilakukan dengan dua metode yaitu cash ataupun cicilan.

# Penerapan Nilai Tambah Encapsulation, Access Modifire, & Validasi Input

1. Encapsulation

   Saya menerapkan encapsulation pada semua class yang dibuat karena semua atribut dibuat private. Getter digunakan untuk mengambil nilai dari atribut class itu sendiri lalu menggunakan setter untuk mengubah atau menambah isi nilai ya ada pada atributya.

3. Access Modifire

   Access modifire private diterapkan pada semua atribut di setiap class sehingga entitas data tidak dapat diakses atau diubah secara langsung dari class lain, dan hanya bisa diubah dengan method yang tersedia. Salah satunya ada di atribut nik pembeli itu hanya bisa diakses dengan method yang disediakan.

4. Validasi Input

   Validasi input diterapkan pada package sistemcrud pada percabangan. Penerapan validasi input digunakan di setiap menu yang ditambahkan salah satunya pada menu proses pengajuan bahwa jika gaji dibawah 2 juta maka pengajuan rumah subsidi akan ditolak.
   <img width="819" height="269" alt="image" src="https://github.com/user-attachments/assets/d965aaaf-a82f-4e87-a98c-3b205651e51e" />
diatas adalah salah satu dari penerapan program validasi input untuk menu proses pengajuan, sistem memastikan gaji dari pembeli ada di angka >= 2 juta untuk melakukan pengajuan pembelian rumah subsidi.



