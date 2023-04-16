package com.akb.latihan2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

/**
 * Tanggal Pengerjaan : 16/04/2023
 * NIM : 10120908
 * Nama : Rizka Ghinna Auliya
 * Kelas : IF-10
 * */

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister = findViewById<MaterialButton>(R.id.btnRegister)
        btnRegister.setOnClickListener {
            startActivity(Intent(this, VerifyActivity::class.java))
        }

    }
}