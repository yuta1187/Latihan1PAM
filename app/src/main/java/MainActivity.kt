package com.example.counter

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.increamentBtn.setOnClickListener {
            binding.countertv.text = increamentCounter().toString()
        }

        binding.decreamentBtn.setOnClickListener {
            binding.countertv.text = decreaseCounter().toString()        }
    }

    private fun increamentCounter(): Int{
        return ++counter

    }
    private fun decreaseCounter(): Int{
        if(counter > 0 ){
            counter--
        }else{
            Toast.makeText( this, "Angka tidak Boleh kurang dari 0", Toast.LENGTH_LONG).show()
        }
        return counter
    }
}