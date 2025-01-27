package com.example.wsw

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_mypage.*
import kotlinx.android.synthetic.main.activity_random_message.*
import kotlinx.android.synthetic.main.activity_random_message.back

class RandomMessageActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_message)

        var random_message = findViewById<ImageView>(R.id.random_message)
        random_message.setOnClickListener { view ->
            val intent=Intent(this,RandomMessageViewActivity::class.java)
            startActivity(intent)
        }
        backBtn()

    }

    /* 뒤로가기 화살표 클릭 리스너 */
    fun backBtn(){
        back.setOnClickListener {
            finish()
        }
    }
}