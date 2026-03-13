package com.example.uts_pemrogseluler_42430004_dina

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class GeneratorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generator)

        val tvSapaan = findViewById<TextView>(R.id.tvSapaan)
        val etJumlah = findViewById<EditText>(R.id.etJumlahMahasiswa)
        val etNilai = findViewById<EditText>(R.id.etRataNilai)
        val btnProses = findViewById<Button>(R.id.btnProses)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        val nama = intent.getStringExtra("NAMA_DOSEN")

        tvSapaan.text = "Selamat bertugas, Dosen $nama"

        btnProses.setOnClickListener {

            val jumlah = etJumlah.text.toString().toInt()
            val nilai = etNilai.text.toString().toInt()

            var status = ""

            if (nilai >= 80) {
                status = "Sangat Baik"
            } else if (nilai >= 60) {
                status = "Cukup"
            } else {
                status = "Kurang"
            }

            var daftar = ""

            for (i in 1..jumlah) {
                daftar += "Mahasiswa $i : ______\n"
            }

            tvHasil.text = "Status Kelas : $status\n\nDaftar Absen:\n$daftar"
        }
    }
}