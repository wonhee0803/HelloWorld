package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        val imageView = findViewById<ImageView>(R.id.image)
        imageView.setImageResource(R.drawable.icon)

        Toast.makeText( this, "안녕하세요 버튼 클릭입니다", Toast.LENGTH_LONG).show()
    }
}
