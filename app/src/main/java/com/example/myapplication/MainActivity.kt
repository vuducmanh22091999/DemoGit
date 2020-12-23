package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
        loginTestT()
    }
    fun test() {
        print("hello world")
        print("commit1")
        print("commit2")
        print("commit3")
        print("commit4")
    }

    fun loginTestT() {
        print("Login success!!!!!")
    }
}