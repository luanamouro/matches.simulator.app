package me.dio.simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(binding.root)
        binding.tvHello.text = "Teste"

        binding = ActivityMainBinding.inflate(layoutInflater)
    }
}