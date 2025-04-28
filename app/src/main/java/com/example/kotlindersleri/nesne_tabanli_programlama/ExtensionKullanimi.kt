package com.example.kotlindersleri.nesne_tabanli_programlama

fun main(){
    val sonuc = 5.carp(2)
    println(sonuc)

    val sonuc1 = 5 carp 2
    println(sonuc1)

}

infix fun Int.carp(sayi:Int):Int{
    return this * sayi
}
