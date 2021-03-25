package com.example.petapp.model

import java.io.Serializable
import java.util.*

fun GregorianCalendar.getFancyString() =
    "${this.get(GregorianCalendar.YEAR)}.${this.get(GregorianCalendar.MONTH)}.${this.get(GregorianCalendar.DAY_OF_MONTH)}"

data class Owner(
    val name: String,
    val surname: String,
    val middleName: String,
    val birthday: GregorianCalendar,
    val address: String
) : Serializable {
    override fun toString() =
        "$name $middleName $surname, birthday - ${birthday.getFancyString()}, address - $address"
}