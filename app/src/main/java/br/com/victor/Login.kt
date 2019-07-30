package br.com.victor

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatButton
import android.view.View
import android.widget.EditText
import android.widget.TextView


class Login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<AppCompatButton>(R.id.btn_login)
        btnLogin.setOnClickListener { view ->
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
        val link_signup = findViewById<TextView>(R.id.link_signup)
        link_signup.setOnClickListener{ view ->
            val intent = Intent(this, Singup::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
