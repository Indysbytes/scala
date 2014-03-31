package com.indy.roman

import org.scalatest.FunSuite

class TestTranslator extends FunSuite {

    test("Returns 1 for Roman I") {

        val instance = new Translator()
        val result = instance.translate("I")
        assert(result == Some(1))

    }

    test("Returns 3 for Roman III") {

        val instance = new Translator()
        val result = instance.translate("III")
        assert(result === Some(3))

    }

    test("Returns 8 for Roman VIII") {

        val instance = new Translator()
        val result = instance.translate("VIII")
        assert(result === Some(8))

    }

    test("Returns 24 for Roman XXIV") {

        val instance = new Translator()
        val result = instance.translate("XXIV")
        assert(result === Some(24))

    }

}
