package com.example.kotlindersleri.nesne_tabanli_proramlama

fun main(){
    //NEsne oluşturma
    val y1 = Yemekler(100,"köfte",249)
    //Değer Okumak
    y1.bilgiAl()
    //Değer Atama/Değiştirmek
    y1.fiyat = 320
    y1.bilgiAl()

    val y2 = Yemekler(200,"Baklava",300)
    y2.bilgiAl()
    y2.ad = "Bakalvaki"
    y2.bilgiAl()

}