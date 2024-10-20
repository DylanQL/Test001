package com.quispe.ismael.laboratorio07

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.quispe.ismael.laboratorio07.databinding.ActivityIntentBinding
import android.content.Intent
class IntentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntentBinding

    private val NAME_KEY = "NAME_KEY"
    private val EMAIL_KEY = "EMAIL_KEY"
    private val PHONE_KEY = "PHONE_KEY"
    private val OFFICE_KEY = "OFFICE_KEY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIntentBinding.inflate(layoutInflater)

        enableEdgeToEdge()

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        observeButtons()
    }

    private fun observeButtons() {
        binding.btnSave.setOnClickListener {
            goDetailActivity()
        }
    }

    private fun goDetailActivity() {

        val name = binding.edtName.text.toString()
        val email = binding.edtEmail.text.toString()
        val phone = binding.edtPhone.text.toString()
        val office = binding.edtOffice.text.toString()

        val intent = Intent(this, DetailActivity::class.java)

        intent.putExtra(NAME_KEY, name)
        intent.putExtra(EMAIL_KEY, email)
        intent.putExtra(PHONE_KEY, phone)
        intent.putExtra(OFFICE_KEY, office)

        startActivity(intent)
    }
}
