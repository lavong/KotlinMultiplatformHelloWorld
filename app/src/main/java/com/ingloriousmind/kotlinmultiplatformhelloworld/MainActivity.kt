package com.ingloriousmind.kotlinmultiplatformhelloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ingloriousmind.kotlinmultiplatformhelloworld.common.createHelloWorldMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_greeting.text = createHelloWorldMessage()
    }

}
