Deskripsi Sistem
Sistem ini dirancang untuk mendemonstrasikan penerapan konsep Encapsulation. Program ini berfungsi untuk mencatat mata kuliah, memberikan nilai, memvalidasi input nilai agar selalu masuk akal, dan menghitung nilai rata-rata mahasiswa secara otomatis.

Penjelasan Desain Class
Sistem ini dibangun menggunakan 3 class utama:

1. Class Course
- Private Fields: courseCode, courseName, dan grade. Data ini disembunyikan agar tidak bisa dimanipulasi langsung dari luar.
- Getter: Disediakan untuk membaca data (misalnya saat ingin mencetak nama mata kuliah).
- Setter & Validation Logic: Terdapat setGrade(double grade) yang berfungsi sebagai jalur satu-satunya untuk mengubah nilai. 

 2. Class Student
- Private Fields: studentId, studentName, dan courses
- Setter & Validation Logic:setStudentName(String name) memvalidasi agar nama mahasiswa tidak boleh kosong (null atau empty string).
   addCourse(Course course) memvalidasi agar tidak ada object mata kuliah kosong yang masuk, serta mencegah masuknya mata kuliah duplikat ke dalam transkrip.
- Main Logic: Memiliki calculateAverageGrade() untuk memproses seluruh data nilai di dalam List menjadi satu nilai rata-rata akhir.

 3. Class Main
Berfungsi untuk menjalankan simulasi program. 
