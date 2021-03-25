package com.example.petapp.model

import java.io.Serializable
import java.util.*

data class Vaccination(
    val name: String,
    val date: GregorianCalendar,
    val clinic: String
) : Serializable {
    override fun toString() = "Vaccination $name at $clinic, ${date.getFancyString()}"
}