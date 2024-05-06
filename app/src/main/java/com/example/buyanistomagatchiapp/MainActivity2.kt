package com.example.buyanistomagatchiapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var init = Functionality()


        //declare buttons
        var happyButton = findViewById<Button>(R.id.happybutton)
        var cleanButton = findViewById<Button>(R.id.cleanbutton)
        var hungryButton = findViewById<Button>(R.id.hungerbutton)


         //Text views
        init.cleanText = findViewById<TextView>(R.id.cleanid)
        init.happyText = findViewById<TextView>(R.id.happyid)
        init.hungerText = findViewById<TextView>(R.id.hungerid)


        //Declare image view
        var imageView = findViewById<ImageView>(R.id.pictureid)

        imageView.setImageResource(R.drawable.m2starting)

        //Starting values
        init.start()





//happy
        happyButton.setOnClickListener {
            imageView.setImageResource(R.drawable.jplay)
            init.regulateHappy()
        }

        //clean
       cleanButton.setOnClickListener {
            imageView.setImageResource(R.drawable.jcleaning)
            init.regulateClean()
        }
//hungry
        hungryButton.setOnClickListener {
            imageView.setImageResource(R.drawable.jeating)
            init.regulateHunger()


        }
    }
}