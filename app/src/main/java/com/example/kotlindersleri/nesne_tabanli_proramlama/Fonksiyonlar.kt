package com.example.kotlindersleri.nesne_tabanli_proramlama

class Fonksiyonlar {
    //Void - sadece işlem yapar
    fun  selamla1(){//swift->func
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }
    //return - hem işlem yapan hem veri transferi yapan
    fun selamla2() : String{
        val sonuc ="Mehaba Ahmet"
        return sonuc
    }

    //parametre
    fun  selamla3(isim:String) {
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //Overloading
    //Bir sınıf içerisinde aynı isimde fonksiyonları tekrar kullanmak.
    fun topla(sayii1:Int,sayi2:Int){
        println("Toplam : ${sayii1+sayi2}" )
    }

    fun topla(sayii1:Double,sayi2:Double){
        println("Toplam : ${sayii1+sayi2}" )
    }
    fun topla(sayii1:Int,sayi2:Int,isim:String){
        println("Toplam : ${sayii1+sayi2} - İşlem yapan: $isim" )
    }
}