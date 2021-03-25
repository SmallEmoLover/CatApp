package com.example.petapp.ui.screens.mainScreen.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.petapp.ui.screens.mainScreen.adapters.CatAdapter
import com.example.petapp.databinding.ActivityMainBinding
import com.example.petapp.model.Repository
import com.example.petapp.ui.screens.catInfoScreen.activities.CatInfoActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = Repository()

        binding.catRecyclerView.adapter =
            CatAdapter(
                repository.getPetList()
            ) {
                startActivity(
                    Intent(this, CatInfoActivity::class.java)
                        .putExtra(CatInfoActivity.CAT_KEY, it)
                )
            }
    }
}