package com.example.gamescore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var awaypls1 :Button
    private lateinit var decrease1:Button
    private lateinit var awaypls2 :Button
    private lateinit var decrease2:Button
    private lateinit var awaypls3 :Button
    private lateinit var decrease3:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        awaypls1 = findViewById<Button>(R.id.awayTeamIncre1)
        awaypls2 = findViewById<Button>(R.id.awayTeamIncre2)
        awaypls3 = findViewById<android.main.res.layout.activity_main.Button>(R.id.awayTeamIncre3)
    }
}