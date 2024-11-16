# LAPORAN TUGAS KESEMBILAN PEMROGRAMAN BERORIENTASI OBJEK PADA GITHUB

👨‍🏫 **Dosen Pembimbing**: Bayu Adhi Nugroho, Ph.D  
🎓 **Program Studi**: Sistem Informasi

📋 A. Penjelasan

Pada pertemuan kali ini, saya menambahkan fitur Login dan Registrasi untuk meningkatkan keamanan pada sistem CRUD. Dengan adanya fitur ini, akses tidak dapat dilakukan secara sembarangan oleh pihak lain.

🔒 Login digunakan untuk mengambil data dari database yang telah tersimpan, sehingga pengguna bisa masuk ke akun yang sudah dibuat sebelumnya.
🆕 Registrasi digunakan untuk pendataan atau penambahan data baru ke dalam database, terutama untuk pengguna baru yang belum memiliki akun.

🛠️ Langkah-langkah Implementasi:

1. 📋 Buat Tabel Baru.
     - Pada database sebelumnya, buatlah tabel baru dengan nama DataLogin.

   ![image](https://github.com/user-attachments/assets/b788bf76-6f64-44c1-ab53-4f6385b47be2)

2. ✏️ Input Data Awal.
     - Masukkan satu data awal ke tabel DataLogin sebagai contoh.

   ![image](https://github.com/user-attachments/assets/762f1965-cf96-47f5-a5af-fc6119befffa)

3. ⚙️ Tambahkan Persistence Baru.
     - Buat file persistence baru yang akan berfungsi untuk menghubungkan aplikasi dengan tabel DataLogin.

   ![image](https://github.com/user-attachments/assets/ab5f59fd-3396-4920-8d3a-ee31a98e74e7)

4. ➕ Tambahkan Tabel Baru pada Project.
     - Integrasikan tabel DataLogin.

   ![image](https://github.com/user-attachments/assets/e3d09b35-1fe9-4793-91b1-0a1c881f4f6c)

   ![image](https://github.com/user-attachments/assets/6c232f9d-8e5f-4d18-a390-732da1ebdb6f)

   ![image](https://github.com/user-attachments/assets/b2d7e2f2-2bee-48f1-8d49-e9090388f221)

5. 🎉 Class Baru Ditambahkan.
     - Setelah menyelesaikan langkah-langkah di atas, akan otomatis dibuat sebuah class baru bernama DataLogin.java.

   ![image](https://github.com/user-attachments/assets/33f739d8-4b20-472e-91dd-74bd5ca9034a)

6. 🖥️ Membuat JFrame Form Baru.
     - Buat dua frame baru dengan menggunakan JFrame Form. Frame pertama diberi nama "Registrasi" dan frame kedua "Login".
     - Pada frame Registrasi, tambahkan komponen-komponen seperti TextField untuk input nama, email, dan password, serta tombol "REGIST".
     - Pada frame Login, tambahkan komponen-komponen seperti TextField untuk input username dan password, serta tombol "LOGIN".

   ![image](https://github.com/user-attachments/assets/e3726f59-7c0b-4d55-be7d-cf74b03ed2c2)

7. 🎨 Desain Frame Registrasi dan Menambahkan Fungsi Button.
     - Desain frame Registrasi sesuai selera, misalnya dengan menggunakan label dan teks untuk pengisian data pengguna.
     - Tambahkan Button "REGIST" pada form Registrasi yang ketika diklik akan melakukan registrasi data baru dan kemudian mengarahkan pengguna ke frame Login.
     - Setelah registrasi berhasil, pengguna akan diarahkan ke frame Login untuk melakukan login dengan data yang baru didaftarkan.

   ![image](https://github.com/user-attachments/assets/711ecb10-f55d-44f5-995b-0b0bc60892aa)

   ![image](https://github.com/user-attachments/assets/368ec731-fc1a-48bd-a98e-5b64322c438d)

8. 🔑 Desain Frame Login dan Menambahkan Fungsi Button.
     - Desain frame Login sesuai selera Anda. Biasanya, form ini memiliki dua TextField untuk username dan password serta tombol "LOGIN".
     - Tambahkan Button "LOGIN" pada form Login untuk melakukan validasi username dan password. Jika valid, pengguna akan diarahkan ke halaman CRUD MataKuliah.
     - Pada frame CRUD MataKuliah, Anda bisa menambahkan fungsi CRUD seperti biasa untuk mengelola data mata kuliah, namun hanya dapat diakses setelah login berhasil.

   ![image](https://github.com/user-attachments/assets/4ab8177b-2154-43ae-ba4c-dd22ef186778)

   ![image](https://github.com/user-attachments/assets/331ce7a2-57f0-4287-b2fd-0b212e240e10)


