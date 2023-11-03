package com.example.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapplication.databinding.MenuMainBinding

class MenuActivity : AppCompatActivity() {
    lateinit var binding: MenuMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MenuMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalculadora.setOnClickListener{calculadora()}
        binding.btnImc.setOnClickListener{calcularImc()}
    }

    private fun calcularImc() {
        var intent = Intent(this, ImcActivity::class.java)
        startActivity(intent)
    }

    fun calculadora(){
        var intent = Intent(this, CalculadoraActivity::class.java)
        startActivity(intent)
    }
}