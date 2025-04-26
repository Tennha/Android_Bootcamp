package com.example.kotlindersleri.nesne_tabanli_proramlama

fun main(){
    val f =Fonksiyonlar()

    //void
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    //parametre
    f.selamla3("Zeynep")

    f.topla(10,20,"beyza")
}