package com.example.buyanistomagatchiapp

import android.widget.TextView


class Functionality {

    lateinit var cleanText: TextView
    lateinit var happyText: TextView
    lateinit var hungerText: TextView


    var cleanInt: Int = 0
    var happyInt: Int = 0
    var hungerInt: Int = 0




    fun start(){
        cleanText.text = "0%"
        happyText.text = "0%"
        hungerText.text = "0%"
    }


    fun regulateHunger() {
        //change
        hungerInt = hungerInt + 20
        cleanInt = cleanInt - 20
//value
        cleanText.text = "${cleanInt}%"
        happyText.text = "${happyInt}%"
        hungerText.text = "${hungerInt}%"
        print("Change")
    }

    fun regulateClean() {
        //change
        cleanInt = cleanInt + 20
        happyInt = hungerInt - 20
        //value
        cleanText.text = "${cleanInt}%"
        happyText.text = "${happyInt}%"
        hungerText.text = "${hungerInt}%"
        print("Change")
    }

    fun regulateHappy() {
        //change
        happyInt = happyInt + 20
        hungerInt = hungerInt - 20
        //change
        cleanText.text = "${cleanInt}%"
        happyText.text = "${happyInt}%"
        hungerText.text = "${hungerInt}%"
        print("Change")
    }


}