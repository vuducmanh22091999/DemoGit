package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
<<<<<<< HEAD
        loginTestT()
=======
        loginTestggg()
>>>>>>> features/login
    }

    fun test() {
        print("hello world")
    }

<<<<<<< HEAD
    fun loginTestT() {
=======
    fun loginTestggg() {
>>>>>>> features/login
        print("Login success!!!!!")
    }
}