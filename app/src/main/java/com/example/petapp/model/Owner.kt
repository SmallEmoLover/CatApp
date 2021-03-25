package com.example.petapp.model

import android.os.Parcelable
import com.example.petapp.extension.getFancyString
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Owner(
    val name: String,
    val surname: String,
    val middleName: String,
    val birthday: GregorianCalendar,
    val address: String
) : Parcelable {
    override fun toString() =
        "$name $middleName $surname, birthday - ${birthday.getFancyString()}, address - $address"
}