package com.example.user.ramenbykotlin.Activity

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.widget.TextView
import com.example.user.ramenbykotlin.Adapter.LearnAdapter
import com.example.user.ramenbykotlin.R
import kotlinx.android.synthetic.main.learn_layout.*

class LearnActivity : AppCompatActivity() {

//    set TextView in class
//    internal lateinit var text: TextView

    var images:Array<Int> = arrayOf(
            R.drawable.ramen,
            R.drawable.car,
            R.drawable.sale
            )

    var adapter: PagerAdapter = LearnAdapter(applicationContext,images)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.learn_layout)

        //set font
//        text = findViewById(R.id.testtext) as TextView
//        val face = Typeface.createFromAsset(assets, "fonts/Kanit-Light.ttf")
//        text.typeface = face

        viewPager.adapter = adapter

        
    }
}



