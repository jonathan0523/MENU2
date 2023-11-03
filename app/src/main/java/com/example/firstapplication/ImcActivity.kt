package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.firstapplication.databinding.ImcMainBinding
import java.text.DecimalFormat

class ImcActivity : AppCompatActivity() {

    lateinit var binding: ImcMainBinding
    var selectHombre: Boolean = true
    var selectMujer: Boolean = false
    var peso = 60
    var edad = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ImcMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickComponentes()
        cambiarPeso()
    }

    fun clickComponentes() {
        binding.viewHombre.setOnClickListener {
            cambiarSelec()
            cambiarColor()
        }
        binding.viewMujer.setOnClickListener {
            cambiarSelec()
            cambiarColor()
        }
        binding.rsaAltura.addOnChangeListener { _, value, _ ->
            var df = DecimalFormat("#.##")
            var valor = df.format(value)
            binding.txtAltura.text = "$valor cm"
        }
        binding.btnQuitarPeso.setOnClickListener{
            peso -= 1
            cambiarPeso()
        }
        binding.btnAumentarPeso.setOnClickListener{
            peso += 1
            cambiarPeso()
        }
    }
    fun cambiarColor() {
        binding.viewHombre.setCardBackgroundColor(selectColor(selectHombre))
        binding.viewMujer.setCardBackgroundColor(selectColor(selectMujer))
    }
    fun cambiarSelec() {
        selectHombre = !selectHombre
        selectMujer = !selectMujer
    }
    fun selectColor(CompSeleccionado: Boolean): Int {
        var color = if (CompSeleccionado) {
            R.color.rojoSelecter
        } else {
            R.color.rojo
        }
        return ContextCompat.getColor(this, color)
    }
    fun cambiarPeso(){
        binding.tvPeso.text = peso.toString()
    }

}
