package com.example.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    private lateinit var toggleButton: ToggleButton
    private lateinit var textViewHide: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton = findViewById(R.id.toggleButton)
        textViewHide = findViewById(R.id.textView)
        
        toggleButton.setOnCheckedChangeListener { CompoundButton, isChecked ->
            if (isChecked){
                textViewHide.visibility = View.VISIBLE
            }else{
                textViewHide.visibility = View.INVISIBLE
            }
        }
    }
}