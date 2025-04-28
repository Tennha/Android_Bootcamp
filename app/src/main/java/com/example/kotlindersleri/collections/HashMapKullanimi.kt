package com.example.kotlindersleri.collections

fun main(){
    //Hashmap JSON veri modeline benzemektedir
    //Map,Dictionary(Swift)
    //Shared Preferences,DataStore,UserDefault(Swift) benizyor
    val iller = HashMap<Int,String>()

    iller.put(16,"Bursa")
    iller[34] = "İstanbul"
    iller[6] = "Ankara"
    println(iller)

    iller[16] = "yeni Bursa"
    println(iller)

    val il = iller[6]
    println(il)

    println("Boyut : ${iller.size}")

    for((anahtar,deger)in iller){
        println("$anahtar -> $deger")
    }

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)

}