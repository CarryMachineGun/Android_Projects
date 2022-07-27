package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var boxThreeText : View;
    private lateinit var boxFourText : View;
    private lateinit var boxFiveText : View;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boxThreeText = findViewById<TextView>(R.id.box_three_text)
        boxFourText = findViewById<TextView>(R.id.box_four_text)
        boxFiveText = findViewById<TextView>(R.id.box_five_text)

        setListeners()
    }

    private fun setListeners() {
        var clickableViews: List<View> =
            listOf(
                findViewById(R.id.box_one_text),
                findViewById(R.id.box_two_text),
                boxThreeText,
                boxFourText,
                boxFiveText,
                findViewById(R.id.constraint_layout),
                findViewById(R.id.red_button),
                findViewById(R.id.green_button),
                findViewById(R.id.yellow_button)
            )



        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }


        }
    }

    private
    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxFourText.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFiveText.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}