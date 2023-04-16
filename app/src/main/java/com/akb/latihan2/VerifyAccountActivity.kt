package com.akb.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class VerifyAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_account)

        val btnVerifyAccount = findViewById<MaterialButton>(R.id.btnSend)
        btnVerifyAccount.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}