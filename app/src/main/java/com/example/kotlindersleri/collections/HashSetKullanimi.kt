package com.example.kotlindersleri.collections

import java.util.HashSet

fun main(){
    //HASHSET
    //Tanımlama
    val meyveler = HashSet<String>()
    //Any -> En üst sınıf demek
    //Bütün türleri kapsar
    //Java -> Object

    meyveler.add("Elma")
    meyveler.add("Armut")
    meyveler.add("Ayva")
    println(meyveler)

    meyveler.add("Amasya Elma")
    println(meyveler)

    val y = meyveler.elementAt(2)
    println(y)

    println("Boyut : ${meyveler.size}")

    for(meyve in meyveler){
        println("Sonuç : $meyve")
    }

    for((indeks,meyve) in meyveler.withIndex()){//Swift Enumarated
        println("$indeks -> $meyve")
    }

    meyveler.remove("Elma")
    println(meyveler)
}