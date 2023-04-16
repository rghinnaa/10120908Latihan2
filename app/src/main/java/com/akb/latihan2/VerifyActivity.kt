package com.akb.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

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