//fungsi utama yang akan dieksekusi saat program dijalankan
fun main() {
    //Mval untuk mendeklarasikan variabel yang immutable (tidak dapat diubah)
    //listOf digunakan untuk membuat daftar (list) berisi angka-angka
    val daftarAngka = listOf(10, 8, 0, 15, -5, 20, 25)
//perulangan for
    for (angka in daftarAngka) {
        //pengecekan apakah nilai angka saat ini lebih kecil dari 0 (artinya angka negatif)
        if (angka < 0) {
            println("Pengecekan dihentikan karena ditemukan angka negatif: $angka")
            //break digunakan untuk menghentikan perulangan for saat kondisi tertentu terpenuhi
            break
        }
        //digunakan untuk melewati iterasi saat ini dan melanjutkan ke iterasi berikutnya
        if (angka == 0) continue
        println("Angka: $angka")
    }
}