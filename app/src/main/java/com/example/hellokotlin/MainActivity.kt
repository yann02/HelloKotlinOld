package com.example.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.hellokotlin.schedule.Idioms
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    var idioms = Idioms()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun maxOf(a: Int, b: Int) = if (a > b) a else b

    fun filter(view: View) {
        val needFruit = idioms.testFilter()
        val firstOne = needFruit[0]
        Log.d(TAG, "I like $firstOne")
        //字符串内插
    }

    fun testWhen(view: View) {
        useWhen("apple")
    }


    fun useWhen(name: String) {
        when (name) {
            "apple" -> Log.d(TAG, "It is apple")
            "orange" -> Log.d(TAG, "It is orange")
            "banana" -> Log.d(TAG, "It is banana")
        }
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btn_use_map -> useMap()
            R.id.btn_use_try_catch -> testTryCatch()
        }
    }

    fun useMap() {
        val mMap = mapOf("a" to "b", "c" to "d")
        for ((k, v) in mMap) {
            Log.d(TAG, "$k -> $v")
        }
        "efg".abc()
    }

    fun String.abc() {
        Log.d(TAG, "abc")
    }

    fun testTryCatch() {
        var result = try {
            Log.d(TAG, "try")
            "hello try"
        } catch (e: Exception) {
            throw Exception("出错啦")
        }
        Log.d(TAG, "result:$result")
    }

}
