package com.example.user.ramenbykotlin.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.Log
import android.widget.Toast
import com.example.user.ramenbykotlin.R
import kotlinx.android.synthetic.main.logo_layout.*
import java.util.*
import kotlin.concurrent.timerTask

class LogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logo_layout)

//        testbutton.setOnClickListener{
//            Toast.makeText(this@LogoActivity,testtext.text,Toast.LENGTH_SHORT).show()
//        }

//        testbutton.setOnClickListener{
//            val intent = Intent(this, LearnActivity::class.java)
////            intent.putExtra("keyIdentifier", value)
//            startActivity(intent)
//        }

        Handler().postDelayed({
//            val intent = Intent(this, LearnActivity::class.java)
            startActivity(Intent(this,LearnActivity::class.java))
        }, 2500)
    }
}
