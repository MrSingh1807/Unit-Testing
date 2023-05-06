package com.example.unittestingexercise.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

    lateinit var helper : Helper
    @Before
    fun setUP(){
        // TODO: this annotation is used before every text cases
        //Arrange
        helper = Helper()
        println("execute before all text cases")
    }


    @Test
    fun isPalindrome() {
        // Arrange
//        val helper = Helper()
        // Act
        val result = helper.isPalindrome("")
        // Assert
        assertEquals(true, result)
    }

    @Test
    fun isPalindrome_Level_expectedTrue(){
        // Arrange
//        val helper = Helper()
        // Act
        val result = helper.isPalindrome("level")
        // Assert
        assertEquals(true, result)
    }

    @After
    fun tearDown(){
        // TODO: this annotation is used after all text cases
        println("execute after all text cases")
    }
}