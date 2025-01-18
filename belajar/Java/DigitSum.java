public class DigitSum {
     public static int hitungJumlahDigit(int angka) {
        // Mengubah angka negatif menjadi positif
        angka = Math.abs(angka);
        // Jika angka 0, langsung return 0
        if (angka == 0) {
            return 0;
        }
        int jumlah = 0;
        // Loop sampai angka menjadi 0
        while (angka > 0) {
            // Ambil digit terakhir dengan modulo 10
            jumlah += angka % 10;
            // Hilangkan digit terakhir dengan membagi 10
            angka /= 10;
        }
        return jumlah; // Menambahkan kurung kurawal yang hilang
    }

    // Metode main untuk testing
    public static void main(String[] args) {
        // Contoh penggunaan
        int angka1 = 12345; // Memperbaiki nama variabel
        int angka2 = -789;
        int angka3 = 0;

        System.out.println("Jumlah digit dari " + angka1 + " adalah: " + hitungJumlahDigit(angka1));
        System.out.println("Jumlah digit dari " + angka2 + " adalah: " + hitungJumlahDigit(angka2));
        System.out.println("Jumlah digit dari " + angka3 + " adalah: " + hitungJumlahDigit(angka3));
    }
}
