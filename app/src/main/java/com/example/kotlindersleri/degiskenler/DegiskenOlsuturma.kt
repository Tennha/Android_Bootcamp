package com.example.kotlindersleri.degiskenler

fun main(){
    println("Merhaba Dünya")
    var id = 1
    var ad = "Mont"
    var resim = "mont.png"
    var puan = 4.7
    var fiyat = 4500
    var stokDurum = true

    println("Id : $id")
    println("Ad : $ad")
    println("Resim : $resim")
    println("Puan : $puan")
    println("Fiyat : $fiyat")
    println("Stok : $stokDurum")

    //Sabitler - Constant
    var sayi = 30
    sayi = 100
    println(sayi)

    val numara = 50

    //Tür Dönüşümü
    //1 - Sayısaldan sayısala dönüşüm
    val d = 89.56
    val sonuc1 = d.toInt()
    println(sonuc1)

    //2 - Sayısaldan Metine dönüşüm
    var x =85
    val sonuc3 = x.toString()
    println(sonuc3)

    //3 - Metinden Sayısala dönüşüm
    val yazi = "48t"
    val sonuc4 = yazi.toIntOrNull()

    if (sonuc4 != null) {
    println(sonuc4)
    }else{
        println("Sonuc null dur")}


}