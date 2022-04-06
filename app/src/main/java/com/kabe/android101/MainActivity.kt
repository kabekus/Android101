package com.kabe.android101

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addSuperHero(view : View){
        val name =  nameText.text.toString()
        val age = ageText.text.toString().toIntOrNull()
        val job = jobText.text.toString()

        if (age == null){
            resultText.text = "Doğru Yaşı Giriniz !!"
        }else{
            val superHero = SuperHero(name,age,job)
            resultText.text = "İsim: ${name} \nYaş: ${age} \nMeslek: ${job} "
        }
    }
}