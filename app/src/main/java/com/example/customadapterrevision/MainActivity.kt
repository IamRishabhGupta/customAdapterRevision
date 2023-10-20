package com.example.customadapterrevision

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.customadapterrevision.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val post = Post(
            "Hello",
            "Rishabh Gupta",
            "https://www.shutterstock.com/image-photo/thanksgiving-dinner-table-traditional-friendship-day-2212571747"
        )
    }
}