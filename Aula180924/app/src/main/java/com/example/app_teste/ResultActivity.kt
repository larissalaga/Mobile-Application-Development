package com.example.app_teste

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.nio.file.attribute.AttributeView

class ResultActivity : AppCompatActivity(){
    private lateinit var resultadoTextView: TextView
    private lateinit var voltarBotão: Button
    private lateinit var coxinhaQuantidadeTextView: TextView
    private lateinit var bebidaQuantidadeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultadoTextView = findViewById(R.id.textViewResultado)
        voltarBotao = findViewById(R.id.backButton)
        coxinhaQuantidadeTextView = findViewById(R.id.textViewCoxinhaResult)
        bebidaQuantidadeTextView = findViewById(R.id.textViewBebidaResult)

        val coxinhaQuantidade = intent.getIntExtra(lblCoxinha, defaultValue: 0)
        val bebidaQuantidade = intent.getIntExtra(lblBebida, defaultValue: 0)

        val total = calculateTotal(coxinhaQuantidade, bebidaQuantidade)

        resultadoTextView.text = "Total a pagar: R$ $total"
        // resultadoTextView.text = "Total a pagar: R$ %.2f".format(total)
        coxinhaQuantidadeTextView.text = "Quantidade de Coxinhas: $coxinhaQuantidade"
        bebidaQuantidadeTextView.text = "Quantidade de Bebidas: $bebidaQuantidade"

        voltarBotão.setOnClickListener{
            finish() // Volta para a tela anterior
        }

        private fun calculateTotal(coxinhaQuantidade: Int, bebidaQuantidade: Int): Double{
            val coxinhaPrice = 10.0
            val bebidaPrice = 15.0
            val taxaServico = 0.10

            val totalCoxinha = coxinhaQuantidade * coxinhaPrice
            val totalBebida = bebidaQuantidade * bebidaPrice
            val subtotal = totalCoxinha + totalBebida
            val totalComTaxa = subtotal + (subtotal * taxaServico)

            return totalComTaxa
        }

        companion object {
            const val lblCoxinha = "lbl_coxinha"
            const val lblBebida = "lbl_bebida"
        }

    }
}