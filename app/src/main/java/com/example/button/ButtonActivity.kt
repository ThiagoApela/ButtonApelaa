package com.example.button

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.button.databinding.ActivityButtonBinding

class ButtonActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.holaMundoButton.setOnClickListener(this)
        binding.containedButton.setOnClickListener(this)
        binding.textButton.setOnClickListener(this)
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.customButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            binding.holaMundoButton.id -> showToast("Se oprimió el botón 'HOLA MUNDOOOO'")
            binding.containedButton.id -> showToast("Se oprimió el botón 'Contained Button'")
            binding.textButton.id -> showToast("Se oprimió el botón 'Text button'")
            binding.button1.id -> showToast("Se oprimió el Button 1")
            binding.button2.id -> showToast("Se oprimió el Button 2")
            binding.button3.id -> showToast("Se oprimió el Button 3")
            binding.customButton.id -> showToast("Se oprimió el Custom Button")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}