package com.example.petapp.model

import java.io.Serializable
import java.util.Date

data class Vaccination(
    val name: String,
    val date: Date,
    val clinic: String
) : Serializable {
    override fun toString() = "Vaccination $name at $clinic, $date"
}