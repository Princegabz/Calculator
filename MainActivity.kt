package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.calculator.R.id.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Val is a constant
        //VAR IS CAN BE CHANGED
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val btnPower = findViewById<Button>(R.id.btnPower)
        val btnSquared = findViewById<Button>(R.id.btnSquared)

        var txtNumber1 = findViewById<EditText>(R.id.txtNumber1)
        var txtNumber2 = findViewById<EditText>(txtNumber2)
        val textView = findViewById<TextView>(R.id.textView)

        //? checks for nulls
        btnAdd?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Add Button Clicked", Toast.LENGTH_LONG).show()
            var number1 = txtNumber1.text.toString().toInt();
            var number2 = txtNumber2.text.toString().toInt();
            var totalAdd: Number = 0;
            totalAdd = number1 + number2;
            textView.text = "${txtNumber1.text} + ${txtNumber2.text} = $totalAdd"
        }
        btnSubtract?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Subtract Button Clicked", Toast.LENGTH_LONG).show()
            var number1 = txtNumber1.text.toString().toInt();
            var number2 = txtNumber2.text.toString().toInt();
            var totalSubtract: Number = 0;
            totalSubtract = number1 - number2;
            textView.text = "${txtNumber1.text} - ${txtNumber2.text} = $totalSubtract"
        }
        btnMultiply?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Multiply Button Clicked", Toast.LENGTH_LONG).show()
            var number1 = txtNumber1.text.toString().toInt();
            var number2 = txtNumber2.text.toString().toInt();
            var totalMultiply: Number = 0;
            totalMultiply = number1 * number2;
            textView.text = "${txtNumber1.text}* ${txtNumber2.text} = $totalMultiply"
        }
        btnDivide?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Divide Button Clicked", Toast.LENGTH_LONG).show()
            var number1 = txtNumber1.text.toString().toInt();16
            var number2 = txtNumber2.text.toString().toInt();
            var totalDivide: Number = 0;


            if (number2 == 0) {
                textView.text = "You may not divide by 0 please try another number"
            } else {
                totalDivide = number1 / number2;
                textView.text = "${txtNumber1.text}/ ${txtNumber2.text} = $totalDivide"
            }
        }
        btnPower?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Power Button Clicked", Toast.LENGTH_LONG).show()
            var number1 = txtNumber1.text.toString().toInt();
            var number2 = txtNumber2.text.toString().toInt();
            //var totalPower:Number= 0;

            val totalPower = Math.pow(number1.toDouble(), number2.toDouble())
            textView.text = "${txtNumber1.text}^ ${txtNumber2.text} = $totalPower"
        }
        btnSquared?.setOnClickListener {
            Toast.makeText(this@MainActivity, "Squared Button Clicked", Toast.LENGTH_LONG).show()
            var number1 = txtNumber1.text.toString().toInt();
            var number2 = txtNumber2.text.toString().toInt();
            var totalSquared: Number = 0;

            totalSquared = Math.sqrt(number1.toDouble());
            textView.text = "Square root of ${txtNumber1.text} = $totalSquared"

        }
    }
}