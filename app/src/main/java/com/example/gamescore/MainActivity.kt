package com.example.gamescore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var awaypls1 :Button
    private lateinit var awayDecrease1:Button
    private lateinit var awaypls2 :Button
    private lateinit var awayDecrease2:Button
    private lateinit var awaypls3 :Button
    private lateinit var awayDecrease3:Button

    private lateinit var homepls1 :Button
    private lateinit var homeDecrease1:Button
    private lateinit var homepls2 :Button
    private lateinit var homeDecrease2:Button
    private lateinit var homepls3 :Button
    private lateinit var homeDecrease3:Button
    private lateinit var homereset:Button
    private lateinit var awayreset:Button
    private var away = 0
    private var home = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        awaypls1 = findViewById(R.id.awayTeamIncre1)
        awaypls2 = findViewById(R.id.awayTeamIncre2)
        awaypls3 = findViewById(R.id.awayTeamIncre3)
        awayDecrease1 = findViewById(R.id.awayTeamDecre1)
        awayDecrease2 = findViewById(R.id.awayTeamDecre2)
        awayDecrease3 = findViewById(R.id.awayTeamDecre3)
        homepls1 = findViewById(R.id.Homeincre1)
        homepls2 = findViewById(R.id.HomeIncre2)
        homepls3 = findViewById(R.id.homeIncre3)
        homeDecrease1 = findViewById(R.id.HomeDecre1)
        homeDecrease2 = findViewById(R.id.HomeDecre2)
        homeDecrease3 = findViewById(R.id.homeDecre3)
        homereset = findViewById(R.id.homeTeamReset)
        awayreset = findViewById(R.id.awayTeamTeamReset)
        val textView1 = findViewById<TextView>(R.id.homeTeam)
        val textView2 = findViewById<TextView>(R.id.awayTeam)

        awaypls1.setOnClickListener{view:View->
            away += 1
            textView2.text = away.toString()
        }
       awaypls2.setOnClickListener{view:View->
            away += 2
           textView2.text = away.toString()
       }
        awaypls3.setOnClickListener{view:View->
            away += 3
            textView2.text = away.toString()
        }

        awayDecrease1.setOnClickListener{view:View->
            away -= 1
            textView2.text = away.toString()
        }
        awayDecrease2.setOnClickListener{view:View->
            away -= 2
            textView2.text = away.toString()
        }
        awayDecrease3.setOnClickListener{view:View->
            away -= 3
            textView2.text = away.toString()
        }
        awayreset.setOnClickListener{view:View->
            away = 0
            textView2.text = away.toString()
        }


        homepls1.setOnClickListener{view:View->
            home += 1
            textView1.text = home.toString()
        }
        homepls2.setOnClickListener{view:View->
            home += 2
            textView1.text = home.toString()
        }
        homepls3.setOnClickListener{view:View->
            home += 3
            textView1.text = home.toString()
        }

        homeDecrease1.setOnClickListener{view:View->
            home -= 1
            textView1.text = home.toString()
        }
        homeDecrease2.setOnClickListener{view:View->
            home -= 2
            textView1.text = home.toString()
        }
        homeDecrease3.setOnClickListener{view:View->
            home -= 3
            textView1.text = home.toString()
        }
        homereset.setOnClickListener{view:View->
            home = 0
            textView1.text = home.toString()
        }
    }

}