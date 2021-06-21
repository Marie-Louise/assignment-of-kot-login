package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var Name = findViewById<TextView>(R.id.idName)
        var gender = findViewById<Spinner>(R.id.spinner3)
        var Email = findViewById<TextView>(R.id.idEmail)
        var Phone= findViewById<TextView>(R.id.idphone)
        var password = findViewById<TextView>(R.id.idpassword)
        var SignUp= findViewById<TextView>(R.id.button)
        var genders= arrayOf("select gender", "Female", "Male")
        var genderAdapter = ArrayAdapter(baseContext, android.R.layout.simple_spinner_item, genders)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        gender.adapter=genderAdapter

        SignUp.setOnClickListener {
            var Name=Name.text.toString()
            var Email=Email.text.toString()
            var Phone=Phone.text.toString()
            var Password=password.text.toString()
            var gender=""
            var intent1 = Intent(baseContext, MainActivity::class.java)
            startActivity(intent1)
        }
    }
}


