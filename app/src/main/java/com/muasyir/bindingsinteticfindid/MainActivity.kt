package com.muasyir.bindingsinteticfindid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.muasyir.bindingsinteticfindid.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_dua.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_satu.*
import javax.net.ssl.SSLSessionBindingEvent

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //        3 Cara pemanggilan ID widget pada layout

//        1. FindViewById
//        var button = findViewById<Button>(R.id.btn_by_id)
//        button.setOnClickListener {
//            Toast.makeText(this,"Ini toast dari By Id", Toast.LENGTH_SHORT).show()
//        }
//
////        2. Kotlin Sintetik -> Tambahin plugin (id 'kotlin-android-extensions')
//        btn_kt_sintetik.setOnClickListener {
//            Toast.makeText(this, "Ini toast dari Kotlin sintetik", Toast.LENGTH_LONG).show()
//        }
//
////        3. View Binding
//        binding.btnViewBinding.setOnClickListener {
//            Toast.makeText(this, "Ini toast dari Binding", Toast.LENGTH_LONG).show()
//        }

        btn_satu.setOnClickListener {
            Toast.makeText(this, "ini toast dari sintetik", Toast.LENGTH_SHORT).show()
        }

        binding.btnDua.setOnClickListener {
            Toast.makeText(this, "ini toast dari binding", Toast.LENGTH_SHORT).show()
        }

        var button3 = findViewById<Button>(R.id.btn_tiga)
        button3.setOnClickListener {
            Toast.makeText(this, "ini toast dari By Id", Toast.LENGTH_SHORT).show()
        }
    }
}