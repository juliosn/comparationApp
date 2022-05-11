package com.example.comparationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.btnComp)
        btnRoll.setOnClickListener { comparacaoNumero() }
    }
    private fun comparacaoNumero(){

        val edtNumber: EditText = findViewById(R.id.edtNumber)
        val edtNumber2: EditText = findViewById(R.id.edtNumber2)


        if(edtNumber.text.toString().trim().isEmpty() || edtNumber2.text.toString().trim().isEmpty())
        {
            Toast.makeText(this, "Por favor, insira um número no campo vazio", Toast.LENGTH_SHORT).show()
        } else {
            if(Integer.parseInt(edtNumber.text.toString()) > Integer.parseInt(edtNumber2.text.toString()))
            {
                Toast.makeText(this, "Campo 1 é maior que o Campo 2", Toast.LENGTH_SHORT).show()
            }
            else if (Integer.parseInt(edtNumber.text.toString()) < Integer.parseInt(edtNumber2.text.toString()))
            {
                Toast.makeText(this,"Campo 2 é maior que o campo 1", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this,"Campo 1 é igual ao Campo 2", Toast.LENGTH_SHORT).show()
            }
        }
    }
}