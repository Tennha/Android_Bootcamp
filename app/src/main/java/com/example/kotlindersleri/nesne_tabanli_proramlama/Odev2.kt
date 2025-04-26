package com.example.kotlindersleri.nesne_tabanli_proramlama

class Odev2 {
    //Celcius sıcaklık birimini Fahrenhiet'a dönüştürüp döndür
    fun soru1(celcius: Double): Double {
        val F = celcius * 1.8 + 32
        return F
    }

    fun soru2(UzunKenar: Int, KısaKenar: Int): Int {
        //Kenarları parametre olarak girilen dikdörtgen çevre uzunluğunu hesaplayıp döndür
        val CevreUzunlugu = (UzunKenar + KısaKenar) * 2
        return CevreUzunlugu
    }

    fun soru3(FaktoriyelSayısı: Int): Int {//Parametre olarak girilen sayının faktoriyelini hesaplayıp döndür
        var Sonuc = 1
        for (i in 1..FaktoriyelSayısı) {
            Sonuc *= i
        }
        return Sonuc
    }

    fun soru4(kelime: String, harf: Char): Int {//Girilen kelimenin içinde sorulan harften kaç defa olduğu sayıp döndür
        return kelime.count { it.equals(harf, ignoreCase = true) }//ignorcase büyük küçük ayrımı yapmıyor}
    }

    fun soru5(KenarSayısı:Int):Int{//Parametrede girilen kenar sayısına göre şeklin iç açılar toplamını hesaplayıp döndür
        val IcAcilar = (KenarSayısı-2)*180
        return IcAcilar
    }

    fun soru6(GünSayisi:Int):Int{
        val CalismaSüresi = GünSayisi*8
        val MaxNormalMesai = 160
        var EkMesai = CalismaSüresi-MaxNormalMesai
        var Ucret = 0

        if (CalismaSüresi>MaxNormalMesai){
            Ucret = ((MaxNormalMesai*10)+(EkMesai*20))
        }
        else{Ucret = CalismaSüresi*10}

        return Ucret
    }

    fun soru7(Kota:Int):Int{
        val Maxkota = 50
        val NormalUcret = 100
        val AsimUcretGB = 4
        var Ucret = 0
        if (Kota>Maxkota){ Ucret = (Kota-Maxkota)*AsimUcretGB+NormalUcret }
        else{Ucret=NormalUcret}
        return Ucret
    }
}