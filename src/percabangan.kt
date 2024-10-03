//fungsi ini adalah awal dri titik program dan untuk mengeksekusi kode didalamnya untuk dijalankan
fun main() {
    //menampilkan teks ke konsol
    print("Masukkan harga barang: ")
    //deklarasi variabel immutabel(tidak dapat diubah)untuk menyimpan nilai harga)
    val harga = readLine()?.toDoubleOrNull()

    //if digunakan untuk memeriksa input harga yg tidak valid
    if (harga == null || harga < 0) {
        println("Harga tidak valid.")
    } else if (harga < 100000) {
        println("Kategori: Murah")
    } else if (harga <= 500000) {
        println("Kategori: Sedang")
    } else {
        println("Kategori: Mahal")
    }
}