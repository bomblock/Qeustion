package com.example.qeustion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// 물음표(?) -> null 일수도 있음
// 느낌표 (!) -> unll 이 아님
// 코틀린은 값을 넣었냐 안넣었냐로 민감하게 반응

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value: String? = "a"
        val value : String? = null

        Log.d("MainActivity",value2)
    }
}