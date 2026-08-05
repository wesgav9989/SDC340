// Wesley Gavitt
// 8/5/2026
// 2.4 Performance Assessment

package com.example.temperatureconversion

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtTemperature = findViewById<EditText>(R.id.edtTemperature)
        val radioFtoC = findViewById<RadioButton>(R.id.radioFtoC)
        val btnConvert = findViewById<Button>(R.id.btnConvert)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnConvert.setOnClickListener {

            val input = edtTemperature.text.toString()

            if (input.isEmpty()) {
                Toast.makeText(
                    this,
                    getString(R.string.invalid_number),
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val temp = input.toDouble()

            if (radioFtoC.isChecked) {

                if (temp < -100 || temp > 250) {
                    Toast.makeText(
                        this,
                        getString(R.string.invalid_fahrenheit),
                        Toast.LENGTH_LONG
                    ).show()
                    return@setOnClickListener
                }

                val result = (temp - 32) * 5 / 9

                txtResult.text = String.format("%.2f °C", result)

            } else {

                if (temp < -75 || temp > 125) {
                    Toast.makeText(
                        this,
                        getString(R.string.invalid_celsius),
                        Toast.LENGTH_LONG
                    ).show()
                    return@setOnClickListener
                }

                val result = (temp * 9 / 5) + 32

                txtResult.text = String.format("%.2f °F", result)
            }
        }
    }
}