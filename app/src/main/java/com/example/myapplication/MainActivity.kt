package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAluno = findViewById<Button>(R.id.btnAluno);

        buttonAluno.setOnClickListener {
            val mySignature = """
            Nome: Mariana Albano
            RM: 551154
        """.trimIndent()

            AlertDialog.Builder(this)
                .setTitle("Desenvolvido Por")
                .setMessage(mySignature)
                .setPositiveButton("Ok") { dialog, which ->

                }
                .show()
        }
    }

}