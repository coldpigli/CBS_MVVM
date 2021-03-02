package com.example.logincbs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.logincbs.databinding.ActivityLoginBinding
import com.example.logincbs.databinding.ActivityTermsAndCondititonsBinding
import java.lang.Thread.sleep

class TermsAndConditionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_LoginCBS)
        super.onCreate(savedInstanceState)
        val binding = ActivityTermsAndCondititonsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonInTnc.setOnClickListener {
            if(binding.checkbox.isChecked){
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Please Agree to the terms and Conditions", Toast.LENGTH_SHORT).show()
            }
        }
    }
}