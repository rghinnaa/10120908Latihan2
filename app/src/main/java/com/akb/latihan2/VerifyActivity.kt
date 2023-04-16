package com.akb.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

/**
 * Tanggal Pengerjaan : 16/04/2023
 * NIM : 10120908
 * Nama : Rizka Ghinna Auliya
 * Kelas : IF-10
 * */

class VerifyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        val btnVerify = findViewById<MaterialButton>(R.id.btnVerify)
        btnVerify.setOnClickListener {
            startActivity(Intent(this, VerifyAccountActivity::class.java))
        }

    }
}