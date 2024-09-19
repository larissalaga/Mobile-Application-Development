package com.example.app_teste

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var coxinhaEditText: EditText
    private lateinit var bebidaEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaração de variável
        coxinhaEditText = findViewById(R.id.editTextTextMultiLine2)
        bebidaEditText = findViewById(R.id.editTextTextMultiLine3)

        val calculateButton: Button = findViewById(R.id.button)
        calculateButton.setOnClickListener {
            calculateAndShowResult()
        }
    }
    private fun  calculateAndShowResult(){
        val coxinhaInput = coxinhaEditText.text.toString()
        val bebidaInput = bebidaEditText.text.toString()

        if (coxinhaInput.isNotEmpty() && bebidaInput.isNotEmpty()) {
            val coxinhaQuantity = coxinhaInput.toInt()
            val bebidaQuantity = bebidaInput.toInt()

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(ResultActivity.lblCoxinha, coxinhaQuantity)
            intent.putExtra(ResultActivity.lblBebida, bebidaQuantity)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Preencha todos os campos.", Toast.LENGTH_LONG).show()
        }
    }
}