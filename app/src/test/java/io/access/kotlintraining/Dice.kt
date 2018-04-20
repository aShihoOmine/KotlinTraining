package io.access.kotlintraining

import java.util.*

class Dice(max: Int) {

    val surface_num = max
    var count = 1

    fun roll() {
        val random = Random()
        if (count > 100) {
            println("I was broken")
        }else{
            println(random.nextInt(surface_num))
            count++
        } // 1〜16 までの数字
    }
}
