package com.example.feedback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var ki: CheckBox
    private lateinit var ara: CheckBox
    private lateinit var name: EditText
    private lateinit var lastname: EditText
    private lateinit var text: EditText
    private lateinit var send: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ki = findViewById(R.id.ki)
        ara = findViewById(R.id.ara)
        name = findViewById(R.id.name)
        lastname = findViewById(R.id.lastname)
        text = findViewById(R.id.text)
        send = findViewById(R.id.send)

        send.setOnClickListener {
            if((ki.isChecked && !ara.isChecked) || (ara.isChecked && !ki.isChecked)){
                if(name.text.toString().length >= 3 && lastname.text.toString().length >= 5
                    && text.text.toString().length >= 10){
                    Toast.makeText(this, "წარმატებით გაიგზავნა", Toast.LENGTH_SHORT).show()
                }
            }else if (ki.isChecked && ara.isChecked){
                Toast.makeText(this, "გთხოვთ სწორად უპასუხეთ პირველ კითხვას", Toast.LENGTH_SHORT).show()
            }
        }

    }
}