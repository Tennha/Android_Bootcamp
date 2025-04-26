package com.example.kotlindersleri.nesne_tabanli_proramlama

data class Yemekler(var id:Int,var ad:String,var fiyat:Int) {
    //constroctur - init fonksiyonu
    //Bu sınıftan nesne oluştuğunda çalışsın.
    init{
        println("******* Nesne oluştu ******")
    }
    fun bilgiAl(){
        println("-----------------")
        println("Id:    ${id}")
        println("Ad:    ${ad}")
        println("Fiyat: ${fiyat}")}
}
//this = Bulunduğu sınıfı temsil edet.Swift dilinde self olarak kullanılır
//super : Kalıtım ile bir üst sınıfı temsil eder.