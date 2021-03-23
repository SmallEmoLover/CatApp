package com.example.petapp.model

import java.util.Date

data class Vaccination(
    val name: String,
    val date: Date,
    val clinic: String
) {
    override fun toString() = "Vaccination $name at $clinic, $date"
}