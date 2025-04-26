package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 16

    println(yas>=17)
    if(yas>=18){
        println("Reşitsiniz")
    }
    else{println("Reşit değilsiniz")}

    val ka ="admin"
    val s = 123456
    val sayi = 10
    if (ka=="admin" && s == 123456){
        println("Hoşgeldiniz")
    }
    else{
        println("Hatalı Giriş")
    }

    if (sayi==9 || sayi == 10){
        println("Sayi 9 veya 10 dur")
    }
    else{
        println("Sayi 9 veya 10 değildir")}


    val number = 1

    when(number){
        1-> println("sayı birdir")
        2-> println("sayi ikidir")
        else -> println("Tanımlanamayan sayı")
    }
}