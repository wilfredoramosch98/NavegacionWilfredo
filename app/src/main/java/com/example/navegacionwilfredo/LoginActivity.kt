package com.example.navegacionwilfredo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.navegacionwilfredo.R.id.btnLogin
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val emailValido: String = "wilfredo@gmail.com"
        val passwordValido: String = "12345"

        val etEmail : EditText = findViewById(R.id.etEmail)
        val etPassword : EditText = findViewById(R.id.etPassword)
        val btnLogin : Button = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener{
            val email: String = etEmail.text.trim().toString()
            val password : String = etPassword.text.trim().toString()

            if (email == emailValido && password == passwordValido){
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }

            val rootView : View = findViewById(android.R.id.content)
            Snackbar.make(rootView, "Credenciales invalidas", Snackbar.LENGTH_LONG).show()


        }





    }
}