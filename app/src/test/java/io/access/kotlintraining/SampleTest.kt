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
        val i = 3
        val expected1 = fizzbuzz(3)
        val actual1 = "Fizz"
        assertEquals(expected1, actual1, "[want] $expected1 [got] $actual1")

        val i = 5
        val expected2 = fizzbuzz(3)
        val actual2 = "Buzz"
        assertEquals(expected2, actual2, "[want] $expected2 [got] $actual2")

        val i = 13
        val expected3 = fizzbuzz(3)
        val actual3 = "13"
        assertEquals(expected3, actual3, "[want] $expected3 [got] $actual3")
    }
}