package io.access.kotlintraining

fun welcome() {
    println("welcome to ACCESS!")
}

// TODO: declare hello function

fun hello() {
    println("Hello World!")
}

fun fizzbuzz(i: Int): String {
    if (i % 3 == 0) {
        return "Fizz"
    } else if (i % 5 == 0) {
        return "Buzz"
    } else {
        return i.toString()
    }
}

fun fizzbuzzLoop() {
    for (n in 1..100) {
        fizzbuzz(n)
    }
}



