package com.example.petapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()

        val recyclerView = findViewById<RecyclerView>(R.id.catRecyclerView)

        val intent = Intent(this, CatInfoActivity::class.java)

        val adapter = CatAdapter(repository.getPetList()) {
            intent.putExtra("cat", it)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }
}