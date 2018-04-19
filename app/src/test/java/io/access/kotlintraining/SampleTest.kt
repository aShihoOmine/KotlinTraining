package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testWelcome() {
        welcome()
        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        hello()
        fizzbuzzLoop()
    }

    @Test
    fun testFizzBuzz() {
        var i = 3
        val expected1 = fizzbuzz(3)
        val actual1 = "Fizz"
        assertEquals(expected1, actual1, "[want] $expected1 [got] $actual1")

        i = 5
        val expected2 = fizzbuzz(5)
        val actual2 = "Buzz"
        assertEquals(expected2, actual2, "[want] $expected2 [got] $actual2")

        i = 13
        val expected3 = fizzbuzz(13)
        val actual3 = "13"
        assertEquals(expected3, actual3, "[want] $expected3 [got] $actual3")
    }

    @Test
    fun testUrudoshi() {
        var j = 1212
        val expected1 = urudoshi(1212)
        val actual1 = "うるう年"
        assertEquals(expected1, actual1, "[want] $expected1 [got] $actual1")

        j = 1700
        val expected2 = urudoshi(1700)
        val actual2 = "平年"
        assertEquals(expected2, actual2, "[want] $expected2 [got] $actual2")

        j = 1600
        val expected3 = urudoshi(1600)
        val actual3 = "うるう年"
        assertEquals(expected3, actual3, "[want] $expected3 [got] $actual3")
    }

    @Test
    fun testPower() {
        val expected1 = power(2,3)
        val actual1 = 8
        assertEquals(expected1, actual1, "[want] $expected1 [got] $actual1")

        val expected2 = power(3,2)
        val actual2 = 9
        assertEquals(expected2, actual2, "[want] $expected2 [got] $actual2")

        val expected3 = power(4,3)
        val actual3 = 64
        assertEquals(expected3, actual3, "[want] $expected3 [got] $actual3")
    }

}