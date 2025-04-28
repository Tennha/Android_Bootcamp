package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main(){
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar()//Kalıtım yok kendi metoduna erişti
    memeli.sesCikar()//Kalıtım var Üst sınıftaki metoda erişti
    kedi.sesCikar()//Kalıtım var Kendi metoduna erişti
    kopek.sesCikar()//Kalıtım var Kendi metoduna erişti
}