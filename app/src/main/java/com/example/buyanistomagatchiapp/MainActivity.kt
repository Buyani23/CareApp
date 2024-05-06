package com.example.buyanistomagatchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Intents
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.welcomeButton)
        var image =  findViewById<ImageView>( R.id.jaguarimage)



        image.setImageResource(R.drawable.jcover)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)



            startActivity(intent)

        }
    }
}