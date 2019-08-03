package com.example.hellokotlin.schedule

class Idioms{
    val fruit = listOf("apple", "orange", "banana")
    //过滤list
    fun testFilter():List<String>{
        return fruit.filter { it.startsWith("a") }
    }
}