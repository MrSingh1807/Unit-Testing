package com.example.unittestingexercise.utils


class Helper {

    fun isPalindrome(input: String) : Boolean {
        val reverseInput = input.reversed()
        if (input == reverseInput){
            return true
        }
        return false
    }
}