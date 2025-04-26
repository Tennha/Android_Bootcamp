package com.example.kotlindersleri.standart_programlama

fun main(){
    for(i in 1..3){//swift dilinde 3 nokta kullanılır
        println("Döngü 1: $i")
    }

    for(x in 10..20 step 5){
        println("Döngü 2: $x")
    }

    for (y in 20 downTo 10 step 5){
        println("Döngü 3: $y")
    }

    var sayac = 1
    while (sayac<4){
        println("Döngü 4: $sayac")
        sayac+=1
    }

    for (i in 1..5) {
        if (i == 3) {
            break
        }//döngüyü durdurur
        println("Döngü 5: $i")

        for (i in 1..5) {
            if (i == 3) {
                continue
            }//bulunduğu adımı pas geçer
            println("Döngü 5: $i")
        }

    }
}