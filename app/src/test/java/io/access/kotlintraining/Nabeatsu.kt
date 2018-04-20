package io.access.kotlintraining

class Nabeatsu {
    var count = 0
    var regex = Regex("3")

    fun next() {
        count++
        var num = count.toString()
        if (count % 3 == 0) {
            println("Aho")
        } else if (regex.containsMatchIn(num)) {
            println("Aho")
        } else {
            println(num)
        }
    }
}