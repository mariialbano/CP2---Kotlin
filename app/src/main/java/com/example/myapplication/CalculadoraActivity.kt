package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculadora

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        btnCalcular.setOnClickListener {
            val num1 = txtN1.text.toString().toDoub
            val num2 = txtN2.text.toString().toDoub
            val resultado = when (radioGroup.checkedRadioButt
                    R.id.radioButtonAdd -> num1 + num2
            R.id.radioButtonSubtract -> num1 - num2
            R.id.radioButtonMultiply -> num1 * num2
            R.id.radioButtonDivide -> {
            if (num2 != 0.0) {
                num1 / num2
            } else {
                // Tratamento de divisão por zero
                Toast.makeText(this, "Não é possível
                    return@setOnClickListener
            }
        }
            else -> 0.0 // Caso nenhum RadioButton esteja
        }
        // Exibir o resultado em um Toast
        Toast.makeText(this, "Resultado: $resultado", Toast
    }
}
