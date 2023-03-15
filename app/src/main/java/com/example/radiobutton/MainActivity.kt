package com.example.radiobutton

import android.content.EntityIterator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtResultado: TextView
    lateinit var  rdSuma: RadioButton
    lateinit  var rdResta: RadioButton
    lateinit  var rdMultiplicacion: RadioButton
    lateinit  var rdDivision: RadioButton
    lateinit var num1: EditText
    lateinit var num2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtResultado = findViewById(R.id.tvResultado)
        rdSuma = findViewById(R.id.rdSuma)
        rdResta = findViewById(R.id.rdResta)
        rdMultiplicacion = findViewById(R.id.rdMultiplicacion)
        rdDivision = findViewById(R.id.rdDivision)
        num1 = findViewById(R.id.edNum1)
        num2 = findViewById(R.id.edNum2)
    }

    fun accionBoton(v: View) {
        val numerito1 = num1.text.toString().toInt()
        val numerito2 = num2.text.toString().toInt()
        var resultado = 0
        if (rdSuma.isChecked){
            resultado = numerito1 + numerito2
    }else if(rdResta.isChecked){

        resultado = numerito1 - numerito2
    }
        else if(rdMultiplicacion.isChecked){

            resultado = numerito1 * numerito2
        }
        else if(rdDivision.isChecked){

            resultado = numerito1 / numerito2
        }
    txtResultado.text = "$resultado";
    }
}