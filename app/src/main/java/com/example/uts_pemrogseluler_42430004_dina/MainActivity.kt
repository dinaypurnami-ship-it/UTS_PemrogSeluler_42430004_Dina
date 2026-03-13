package com.example.uts_pemrogseluler_42430004_dina

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNama = findViewById<EditText>(R.id.etNamaDosen)
        val btnMasuk = findViewById<Button>(R.id.btnMasuk)

        btnMasuk.setOnClickListener {

            val namaDosen = etNama.text.toString()

            val intent = Intent(this, GeneratorActivity::class.java)
            intent.putExtra("NAMA_DOSEN", namaDosen)

            startActivity(intent)
        }
    }
}