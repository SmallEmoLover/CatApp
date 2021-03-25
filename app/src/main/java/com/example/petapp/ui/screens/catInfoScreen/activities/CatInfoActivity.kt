package com.example.petapp.ui.screens.catInfoScreen.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.petapp.R
import com.example.petapp.databinding.ActivityCatInfoBinding
import com.example.petapp.model.Cat
import com.example.petapp.ui.screens.mainScreen.activities.CAT_KEY

class CatInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCatInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat: Cat? = intent.extras?.getParcelable(CAT_KEY) as Cat?
        if (cat == null) {
            Toast.makeText(this, "Some error with this cat, sorry :(", Toast.LENGTH_LONG).show()
            finish()
        } else {
            binding.apply {
                catInfoTitle.text = cat.name
                catInfoBio.text =
                    getString(R.string.cat_bio, cat.name, cat.kind, cat.age, cat.sex)
                catInfoOwner.text =
                    getString(
                        R.string.cat_owner,
                        if (cat.owner != null)
                            cat.owner
                        else
                            "This cat have not owner =( So sad"
                    )
                catInfoVaccinations.text =
                    getString(
                        R.string.cat_vaccinations,
                        if (cat.vaccinations.isNotEmpty())
                            cat.vaccinations.fold("") { result, value -> result + value + "\n" }
                        else
                            "No vaccinations"
                    )
            }
        }
    }
}