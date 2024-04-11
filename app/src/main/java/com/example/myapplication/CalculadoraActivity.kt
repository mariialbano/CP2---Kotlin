package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlink.android.synthetic.main.activity_calculadora.*

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        btnSoma.setOnClickListener {
            calculate("Soma")
        }

        btnSubtracao.setOnClickListener {
            calculate("Subtração")
        }

        btnMultiplicacao.setOnClickListener {
            calculate("Multiplicação")
        }

        btnDivisao.setOnClickListener {
            calculate("Divisão")
        }
    }

    private fun calculate(operador:Char):
        val num1 = editTextNumber1.text.toString().toFloat()
        val num2 = editTextNumber2.text.toString().toFloat()
        val resultado = Float = when (operador){
                'Soma' -> num1 + num2
                'Subtração' -> num1 - num2
                'Multiplicação' -> num1 * num2
                'Divisão' -> {
                    if (num2 != Of){
                        num1 / num2
                    } else {
                        Float.NaN
                    }
                }
                else -> Float.NaN
            }
    textViewResultado.text = "Resultado: $reasultado"
}

