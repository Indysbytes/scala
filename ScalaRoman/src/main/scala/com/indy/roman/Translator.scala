package com.indy.roman

import java.util.Locale

class Translator {
    val romanNumerals: Map[Char, Int] = Map(  'I' -> 1,
                                              'V' -> 5,
                                              'X' -> 10,
                                              'L' -> 50,
                                              'C' -> 100,
                                              'D' -> 500,
                                              'M' -> 1000)

    def translate(romanNumber: String): Option[Int] = {

        val upper = romanNumber.toUpperCase(Locale.ENGLISH).reverse

        var translatedResult: Int = 0;
        var current: Int = 0;
        var previous: Int = 0;

        for(c <- upper){
            current = romanNumerals.get(c).get
            if(current < previous){
                translatedResult -= current
            }
            else{
                translatedResult += current
            }

            previous = current
        }

        Some(translatedResult)

    }
}

