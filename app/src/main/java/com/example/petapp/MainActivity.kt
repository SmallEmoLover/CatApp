package com.example.petapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.petapp.databinding.ActivityMainBinding

const val CAT_KEY = "cat"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = Repository()

        binding.catRecyclerView.adapter = CatAdapter(repository.getPetList()) {
            startActivity(
                Intent(this, CatInfoActivity::class.java)
                    .putExtra(CAT_KEY, it)
            )
        }
    }
}