package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
        loginTest()
    }

    fun test() {
        print("hello world")
    }

    fun loginTest() {
        print("Login success!!!!!")
    }
}