package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.firstapplication.databinding.CalculadoraMainBinding
import java.text.DecimalFormat

class CalculadoraActivity : AppCompatActivity() {

    var num1 = 0.0
    var num2 = 0.0
    var operacion = " "
    lateinit var binding: CalculadoraMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CalculadoraMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ClickBotones()
    }
    fun ClickBotones(){

        binding.btnCero.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnCero.text }
        binding.btnUno.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString()+ binding.btnUno.text }
        binding.btnDos.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnDos.text }
        binding.btnTres.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnTres.text }
        binding.btnCuatro.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnCuatro.text }
        binding.btnCinco.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnCinco.text }
        binding.btnSeis.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnSeis.text }
        binding.btnSiete.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnSiete.text }
        binding.btnOcho.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnOcho.text }
        binding.btnNueve.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnNueve.text }
        binding.btnSumar.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnSumar.text }
        binding.btnRestar.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnRestar.text }
        binding.btnMultiplicar.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnMultiplicar.text }
        binding.btnDividir.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnDividir.text }
        binding.btnPunto.setOnClickListener{binding.txtResultado2.text = binding.txtResultado2.text.toString() + binding.btnPunto.text }

        binding.btnIgual.setOnClickListener{
            num2 = binding.txtResultado2.text.toString().toDouble()
            binding.txtResultado1.text = binding.txtResultado1.text.toString() + num2
            operaciones()
        }
        binding.btnSumar.setOnClickListener{
            operacion = binding.btnSumar.text.toString()
            num1=binding.txtResultado2.text.toString().toDouble()
            binding.txtResultado1.text = binding.txtResultado2.text.toString() + operacion
            binding.txtResultado2.text = ""

        }
        binding.btnRestar.setOnClickListener{
            operacion = binding.btnRestar.text.toString()
            num1=binding.txtResultado2.text.toString().toDouble()
            binding.txtResultado1.text = binding.txtResultado2.text.toString() + operacion
            binding.txtResultado2.text = ""

        }
        binding.btnMultiplicar.setOnClickListener{
            operacion = binding.btnMultiplicar.text.toString()
            num1=binding.txtResultado2.text.toString().toDouble()
            binding.txtResultado1.text = binding.txtResultado2.text.toString() + operacion
            binding.txtResultado2.text = ""

        }
        binding.btnDividir.setOnClickListener{
            operacion = binding.btnDividir.text.toString()
            num1=binding.txtResultado2.text.toString().toDouble()
            binding.txtResultado1.text = binding.txtResultado2.text.toString() + operacion
            binding.txtResultado2.text = ""

        }
        binding.btnBorrar.setOnClickListener{
            binding.txtResultado2.text = ""
            binding.txtResultado1.text = ""
        }
    }
    fun operaciones(){
        when(operacion){
        "+"->suma()
        "-"->resta()
        "x"->multiplicar()
        "/"->dividir()
        }

    }
    fun suma(){
        var sumar = num1 + num2
        binding.txtResultado2.text = sumar.toString()

    }
    fun resta(){
        var restar = num1 - num2
        binding.txtResultado2.text = restar.toString()
    }
    fun multiplicar(){
        var multiplicar = num1*num2
        binding.txtResultado2.text = multiplicar.toString()
    }
    fun dividir(){
        var dividir = num1 / num2
        binding.txtResultado2.text = dividir.toString()
    }
}



