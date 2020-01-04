package com.example.kotlindemos.Firebaseapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlindemos.R

class FbloginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fblogin)
    }
    fun Firebaseact(view: View){
        val intent= Intent(applicationContext,FirebaseActivity::class.java)
        startActivity(intent)
    }
}
