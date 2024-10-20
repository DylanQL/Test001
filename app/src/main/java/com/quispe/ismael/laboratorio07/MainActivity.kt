package com.quispe.ismael.laboratorio07

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        observeButtons()
    }
    private fun observeButtons(){
        findViewById<ConstraintLayout>(R.id.lnLyfeCycleFindViewById).setOnClickListener{
            goToLifeCycleActivity()
        }
        findViewById<ConstraintLayout>(R.id.lnIntentViewBinding).setOnClickListener{

            goToIntentActivity()
        }
    }

    private fun goToLifeCycleActivity(){
        val intent= Intent(this,LifeCycleActivity::class.java)
        startActivity((intent))
    }
    private fun goToIntentActivity(){
        val intent= Intent(this,IntentActivity::class.java)
        startActivity((intent))
    }
}