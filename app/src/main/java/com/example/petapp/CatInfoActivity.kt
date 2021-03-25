package com.example.petapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.petapp.databinding.ActivityCatInfoBinding
import com.example.petapp.model.Cat

class CatInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCatInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat: Cat? = intent.extras?.getSerializable(CAT_KEY) as Cat?
        if (cat == null) {
            Toast.makeText(this, "Some error with this cat, sorry :(", Toast.LENGTH_LONG).show()
            finish()
        } else {
            binding.catInfoTitle.text = cat.name
            binding.catInfoBio.text =
                "It`s ${cat.name} - ${cat.kind} ${cat.age} years old ${cat.sex} cat"
            binding.catInfoOwner.text =
                "It`s cat owner!\n${cat.owner ?: "This cat have not owner =( So sad"}"
            binding.catInfoVaccinations.text =
                "It`s cat vaccinations:\n${cat.vaccinations.fold("") { result, value -> result + value + "\n" }
                    .ifEmpty { "No vaccinations" }}"
        }
    }
}