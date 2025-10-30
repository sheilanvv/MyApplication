package com.example.myapplication

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupJenisKelamin)
        val checkBox = findViewById<CheckBox>(R.id.checkboxAgree)
        val btnDaftar = findViewById<Button>(R.id.btnDaftar)
        val spinnerDomisili = findViewById<Spinner>(R.id.spinnerDomisili)

        btnDaftar.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId

            if (selectedId == -1) {
                Toast.makeText(this, "Silakan pilih jenis kelamin terlebih dahulu!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val jenisKelamin = when (selectedId) {
                R.id.buttonPria -> "Pria"
                R.id.buttonWanita -> "Wanita"
                else -> "Tidak diketahui"
            }

            val isSetuju = checkBox.isChecked
            val domisili = spinnerDomisili.selectedItem.toString()

            Toast.makeText(
                this,
                "Jenis Kelamin: $jenisKelamin\nDomisili: $domisili\nSetuju: $isSetuju",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
