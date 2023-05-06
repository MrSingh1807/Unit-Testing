package com.example.unittestingexercise.utils

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class)
class ParametrizedExample(val input : String, val expectedValue: Boolean) {
    // Parametrized text case

    @Test
    fun test(){
        // Arrange
        val helper = Helper()
        // Act
        val result = helper.isPalindrome(input)
        // Assert
        assertEquals(expectedValue, result)
    }

    companion object {

        @JvmStatic
        @Parameters(name = "{index}: {0} isPalindrome - {1}")
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf("hello", false),
                arrayOf("level", true),
                arrayOf("a", true),
                arrayOf("", true)
            )
        }
    }
}