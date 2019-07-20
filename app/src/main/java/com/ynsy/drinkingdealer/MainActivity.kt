package com.ynsy.drinkingdealer

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main);

        with(this) {
            button_start.setOnClickListener { startKoreanAlphabetGame() }
        }
    }

    fun startKoreanAlphabetGame() {
        val intent = Intent(this, KoreanAlphabetActivity::class.java)
        startActivity(intent)
    }
}