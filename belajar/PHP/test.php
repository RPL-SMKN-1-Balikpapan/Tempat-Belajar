<?php
function cekPalindrome($teks) {
    // Menghapus semua karakter non-alphanumeric dan mengubah ke huruf kecil
    $teksBersih = preg_replace("/[^a-zA-Z0-9]/", "", strtolower($teks));
    
    // Membandingkan string dengan kebalikannya
    return ($teksBersih === strrev($teksBersih)) ? "benar" : "salah";
}

// Program utama
echo "Masukkan kata atau kalimat: ";
$input = trim(fgets(STDIN));
$hasil = cekPalindrome($input);
echo $hasil;


?>