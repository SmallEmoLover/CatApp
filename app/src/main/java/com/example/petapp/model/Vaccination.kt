package com.example.petapp.model

import android.os.Parcelable
import com.example.petapp.extension.getFancyString
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Vaccination(
    val name: String,
    val date: GregorianCalendar,
    val clinic: String
) : Parcelable {
    override fun toString() = "Vaccination $name at $clinic, ${date.getFancyString()}"
}