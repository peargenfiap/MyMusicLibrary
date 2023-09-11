package br.com.mymusiclibrary.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.mymusiclibrary.R
import br.com.mymusiclibrary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}