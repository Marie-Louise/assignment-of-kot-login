package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Email = findViewById<TextView>(R.id.idname)
        var password = findViewById<TextView>(R.id.idpassword)
        var Contact = findViewById<TextView>(R.id.idContact)
        var LOGIN = findViewById<TextView>(R.id.button2)
        LOGIN.setOnClickListener {
            var email=Email.text.toString()
            var password=password.text.toString()
            var contact=Contact.text.toString()
            var login=LOGIN.text.toString()
            var intent1 = Intent(baseContext, MainActivity2::class.java)
            startActivity(intent1)
        }
    }
}