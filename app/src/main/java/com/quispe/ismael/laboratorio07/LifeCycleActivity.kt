package com.quispe.ismael.laboratorio07

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView


class LifeCycleActivity : AppCompatActivity() {

    private lateinit var tvStateLifeCycle: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_life_cycle)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        tvStateLifeCycle= findViewById(R.id.tvStateLifeCycle)
        tvStateLifeCycle.text="onCreate"
        Log.i("LifeCycleActivity","onCreate")

    }
    override  fun onStart(){
        super.onStart()
        tvStateLifeCycle.text="onStart"
        Log.i("LifeCycleActivity","onStart")
    }
    override  fun onResume(){
        super.onResume()
        tvStateLifeCycle.text="onResume"
        Log.i("LifeCycleActivity","onResume")
    }
    override  fun onPause(){
        super.onPause()
        tvStateLifeCycle.text="onPause"
        Log.i("LifeCycleActivity","onPause")
    }
    override  fun onStop(){
        super.onStop()
        tvStateLifeCycle.text="onStop"
        Log.i("LifeCycleActivity","onStop")
    }
    override  fun onDestroy(){
        super.onDestroy()
        tvStateLifeCycle.text="onDestroy"
        Log.i("LifeCycleActivity","onDestroy")
    }
}