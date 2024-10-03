//fungsi utama yang akan dieksekusi saat program dijalankan
fun main() {
    //menampilkan pesan untuk meminta pengguna memasukkan nilai batas awal
    print("Masukkan batas awal: ")
    //?.toIntOrNull() mengubah  input string menjadi angka integer
    //?.toIntOrNull()  jika input tidak valid atau kosong (null), maka akan menghasilkan null.
    val batasAwal = readLine()?.toIntOrNull() ?: 0
    //menampilkan pesan untuk meminta pengguna memasukkan nilai batas akhir.
    print("Masukkan batas akhir: ")
    //mengonversi input menjadi integer atau memberikan nilai default 0 jika input tidak valid.
    val batasAkhir = readLine()?.toIntOrNull() ?: 0
    if (batasAwal > batasAkhir) {
        //Jika kondisi batasAwal > batasAkhir benar, menampilkan pesan kesalahan.
        println("Batas awal tidak boleh lebih besar dari batas akhir.")
        //Menghentikan eksekusi program lebih lanjut jika batas awal lebih besar dari batas akhir
        return
    }
    //menghitung jumlah bilangan genap menggunakan loop for
    //menambah nilai jumlahGenapFor setiap kali ditemukan bilangan genap
    var jumlahGenapFor = 0
    for (i in batasAwal..batasAkhir) if (i % 2 == 0) jumlahGenapFor++
    var jumlahGenapWhile = 0
    //inisialisasi variabel i untuk digunakan dalam loop while
    var i = batasAwal
    while (i <= batasAkhir) {
        if (i % 2 == 0) jumlahGenapWhile++
        i++
    }
    //inisialisasi variabel jumlahGenapDoWhile untuk menghitung jumlah bilangan genap menggunakan loop do-while
    var jumlahGenapDoWhile = 0
    i = batasAwal
    do {
        if (i % 2 == 0) jumlahGenapDoWhile++
        //menambah nilai i setelah setiap iterasi
        i++
    } while (i <= batasAkhir)
    //menampilkan hasil
    println("Jumlah bilangan genap: $jumlahGenapFor")
    println("Jumlah bilangan genap: $jumlahGenapWhile")
    println("Jumlah bilangan genap: $jumlahGenapDoWhile")
}