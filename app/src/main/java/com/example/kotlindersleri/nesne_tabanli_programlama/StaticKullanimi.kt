package com.example.kotlindersleri.nesne_tabanli_programlama

class StaticKullanimi {
    fun main(){
        val a = ClassA()

        //Standatt nesne tabanlı erişim
        //println(a.x)
        //a.metod()

        //Sanal nesne - virtual object - nameless(isimsiz) object
        //println(ClassA().x)//1.nesne
        //ClassA().metod()//2.nesne

        //Static Kullanimi
        println(ClassA.x)
        ClassA.metod()

    }
}