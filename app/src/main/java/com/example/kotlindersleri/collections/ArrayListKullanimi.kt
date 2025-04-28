package com.example.kotlindersleri.collections

fun main(){
    val meyveler = ArrayList<String>()

    //Veri Ekleme
    meyveler.add("Elma")//0
    meyveler.add("Muz")//1
    println(meyveler)

    //Güncelleme
    meyveler[1] = "Yeni muz"
    println(meyveler)

    //Insert : istediğimiz indekse
    meyveler.add(1,"Portakal")
    println(meyveler)

    //okuma
    val m = meyveler.get(3)
    println(m)
    println(meyveler.get(0))

    println("Boyut : ${meyveler.size}")

    meyveler.reverse()
    println(meyveler)

    for(meyve in meyveler){
        println("Sonuç : $meyve")
    }

    for((indeks,meyve) in meyveler.withIndex()){//Swift Enumarated
        println("$indeks -> $meyve")
    }

    meyveler.removeAt(1)
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}