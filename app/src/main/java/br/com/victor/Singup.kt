package br.com.victor

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatButton
import android.widget.TextView

class Singup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)

        val btnSingup = findViewById<AppCompatButton>(R.id.btn_signup)
        btnSingup.setOnClickListener{ view ->
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

        val link_login = findViewById<TextView>(R.id.link_login)
        link_login.setOnClickListener{ view ->
            val intent = Intent(this, Login::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
