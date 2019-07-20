package com.ynsy.drinkingdealer

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main);

        with(this) {
            button_start.setOnClickListener { showButtonTextOnToast(it) }
        }
    }

    fun showButtonTextOnToast(v : View) {
        Toast.makeText(this, (v as Button).text, Toast.LENGTH_SHORT).show()
    }
}