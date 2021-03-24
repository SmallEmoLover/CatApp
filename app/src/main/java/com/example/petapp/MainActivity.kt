package com.example.petapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.petapp.model.Cat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()

        val recyclerView = findViewById<RecyclerView>(R.id.catRecyclerView)
        val adapter = CatAdapter(repository.createPetList()) {         Toast.makeText(applicationContext, it.name, Toast.LENGTH_SHORT).show();
        }
        recyclerView.adapter = adapter
    }
}