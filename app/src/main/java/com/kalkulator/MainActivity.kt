package com.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var EditBilangan1: EditText
    private lateinit var EditBilangan2: EditText
    private lateinit var ViewHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EditBilangan1 = findViewById(R.id.edit_bilangan_pertama)
        EditBilangan2 = findViewById(R.id.edit_bilangan_kedua)
        ViewHasil = findViewById(R.id.hasil_kalkulator)

        val ButtonTambah: Button = findViewById(R.id.button_tambah)
        val ButtonKurang: Button = findViewById(R.id.button_kurang)
        val Buttonkali: Button = findViewById(R.id.button_kali)
        val ButtonBagi: Button = findViewById(R.id.button_bagi)

        ButtonTambah.setOnClickListener(this)
        ButtonKurang.setOnClickListener(this)
        Buttonkali.setOnClickListener(this)
        ButtonBagi.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.button_tambah -> {
                    val HasilTambah = EditBilangan1.text.toString().trim()
                        .toDouble() + EditBilangan2.text.toString().toDouble()
                    ViewHasil.text = HasilTambah.toString()
                }
                R.id.button_kurang -> {
                    val HasilKurang = EditBilangan1.text.toString().trim()
                        .toDouble() + EditBilangan2.text.toString().toDouble()
                    ViewHasil.text = HasilKurang.toString()
                }
                R.id.button_kali -> {
                    val HasilKali = EditBilangan1.text.toString().trim()
                        .toDouble() + EditBilangan2.text.toString().toDouble()
                    ViewHasil.text = HasilKali.toString()
                }
                R.id.button_bagi -> {
                    val HasilBagi = EditBilangan1.text.toString().trim()
                        .toDouble() + EditBilangan2.text.toString().toDouble()
                    ViewHasil.text = HasilBagi.toString()
                }
            }
        }
    }
}
