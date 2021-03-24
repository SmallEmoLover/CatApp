package com.example.petapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.petapp.model.Cat

class CatInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_info)

        val cat : Cat? = intent.extras?.getSerializable("cat") as Cat?
        if (cat == null) {
            Toast.makeText(this, "Some error with this cat, sorry :(", Toast.LENGTH_LONG).show()
            finish()
        } else {
            val title = findViewById<TextView>(R.id.cat_info_title)
            val catBio = findViewById<TextView>(R.id.cat_info_bio)
            val catOwner = findViewById<TextView>(R.id.cat_info_owner)
            val catVaccination = findViewById<TextView>(R.id.cat_info_vaccinations)

            title.text = cat.name
            catBio.text = "It`s ${cat.name} - ${cat.kind} ${cat.age} years old ${cat.sex} cat"
            catOwner.text = "It`s cat owner!\n${cat.owner ?: "This cat have not owner =( So sad"}"
            catVaccination.text = "It`s cat vaccinations:\n${ cat.vaccinations.fold("") { result, value -> result + value + "\n" }.ifEmpty { "No vaccinations" }}"
        }
    }
}