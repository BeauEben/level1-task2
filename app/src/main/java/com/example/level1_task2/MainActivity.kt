package com.example.level1_task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.level1_task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var AmountCorrect = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            checkAnswers()
        }
    }

    private fun checkAnswers(){
        AmountCorrect = 0

        if (binding.Answer1.text.length < 2) {
            if (binding.Answer1.text.contains("T"))
                AmountCorrect += 1
        }

        if (binding.Answer2.text.length < 2) {
            if (binding.Answer2.text.contains("F"))
                AmountCorrect += 1
        }

        if (binding.Answer3.text.length < 2) {
            if (binding.Answer3.text.contains("F"))
                AmountCorrect += 1
        }

        if (binding.Answer4.text.length < 2) {
            if (binding.Answer4.text.contains("F"))
                AmountCorrect += 1
        }


        Toast.makeText(this, getString(R.string.EndMessage, AmountCorrect), Toast.LENGTH_LONG).show()
    }
}