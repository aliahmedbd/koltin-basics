package org.androix.kotlin

fun main() {
    val taxCalculator: (Double, Double) -> Double = { price, ratio ->
        price * ratio
    }

    val taxCalculator2 = { price: Double, ratio: Double ->
        price * ratio
    }

    val taxCalculator3: Double.(Double) -> Double = { ratio ->
        this * ratio
    }

    println(taxCalculator(200.0, 0.1))
    println(taxCalculator2(200.0, 0.1))
    println(200.0.taxCalculator3(0.1))
}