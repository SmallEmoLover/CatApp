package com.example.petapp.model

import java.io.Serializable
import java.util.Date

data class Owner(
    val name: String,
    val surname: String,
    val middleName: String,
    val birthday: Date,
    val address: String
) : Serializable {
    override fun toString() =
        "$name $middleName $surname, birthday - $birthday, address - $address"
}