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

fun urudoshi(j: Int): String {
    if (j % 4 != 0) {
        return "平年"
    } else if (j % 100 == 0 && j % 400 != 0) {
        return "平年"
    } else {
        return "うるう年"
    }
}

fun power(a: Int, n: Int): Int {
    if (a < 0 && n < 0) {
        println("inputs must be positive. return 0")
    }
    var i = 1
    var ans = a
    while (i < n){
        ans = ans*a
        i = i+1
    }
    return ans
}

//exercise2

fun Int.isEven():Boolean{
    return this % 2 == 0
}

fun Int.isOdd():Boolean{
    return this % 2 == 1
}

