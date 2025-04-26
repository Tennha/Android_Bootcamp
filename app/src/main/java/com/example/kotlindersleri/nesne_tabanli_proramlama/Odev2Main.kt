package com.example.kotlindersleri.nesne_tabanli_proramlama

fun main(){
    val f = Odev2()

    val soru1 = f.soru1(20.0)
    val soru2 = f.soru2(20,10)
    val soru3 = f.soru3(5)
    val soru4 = f.soru4("Savas",'a')
    val soru5 = f.soru5(6)
    val soru6 = f.soru6(21)
    val soru7 = f.soru7(70)
    println("Cevap : $soru1 F")
    println("Cevre uzunlugu : $soru2")
    println("Sayinin Faktoriyeli : $soru3")
    println("Girilen harf, kelimede $soru4 kere geciyor")
    println("Seklin ic acilar toplami : $soru5")
    println("Hesaplanan maas : $soru6 tl")
    println("Hesaplanan kota ucreti : $soru7 tl")

}
