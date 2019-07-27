package com.ynsy.drinkingdealer

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_korean_alphabet.*

class KoreanAlphabetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korean_alphabet)

        with (this) {
            val pagerAdapter = FragmentPagerAdapter(supportFragmentManager)
            pagerAdapter.fragmentList.add(KoreanAlphabetGamePlayFragment())
            pagerAdapter.fragmentList.add(KoreanAlphabetGameOverFragment())

            viewpager_game.adapter = pagerAdapter
            viewpager_game.setCurrentItem(0)

            button_quit.setOnClickListener { finish() }
        }
    }

    class FragmentPagerAdapter(fm : FragmentManager): androidx.fragment.app.FragmentPagerAdapter(fm) {
        val fragmentList : MutableList<Fragment> = ArrayList()

        override fun getItem(position: Int): Fragment {
            return fragmentList.get(position)
        }

        override fun getCount(): Int {
            return fragmentList.size
        }

    }
}